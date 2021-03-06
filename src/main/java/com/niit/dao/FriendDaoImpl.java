package com.niit.dao;

import java.util.List;
import org.hibernate.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Friend;
import com.niit.model.User;
@Repository
@Transactional
public class FriendDaoImpl implements FriendDao {
	@Autowired
	private SessionFactory sessionFactory;
    public List<User> getSuggestedUsers(String email) {
    	Session session=sessionFactory.getCurrentSession();
		SQLQuery query=session.createSQLQuery("select * from user_s180396 where email in (select email from user_s180396 where email!=? minus (select toId_email from friend_s180396 where fromId_email=? union select fromId_email from friend_s180396 where toId_email=?) )" );
		query.setString(0, email);
		query.setString(1, email);
		query.setString(2, email);
		query.addEntity(User.class);
		List<User>suggestedUsers=query.list();
		return suggestedUsers;
	}
	public void addFriend(Friend friend) {
		Session session=sessionFactory.getCurrentSession();
		session.save(friend);
	}
	public List<Friend> PendingRequest(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Friend where toId.email=? and status=?");
    	query.setString(0, email);
		query.setCharacter(1,'P');
		List<Friend>PendingRequest=query.list();
		return PendingRequest;
	}
	
	public List<Friend> MyFriend(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query1=session.createQuery("from Friend where toId.email=? and status=?");
    	query1.setString(0, email);
		query1.setCharacter(1,'A');
		List<Friend>MyFriends1=query1.list();
		
		Query query2=session.createQuery("from Friend where fromId.email=? and status=?");
    	query2.setString(0, email);
		query2.setCharacter(1,'A');
		List<Friend>MyFriends=query2.list();
		MyFriends.addAll(MyFriends1);
		return MyFriends;
	}

	public void updateStatus(Friend friendRequest) {
		Session session=sessionFactory.getCurrentSession();
		if(friendRequest.getStatus()=='A')
			session.update(friendRequest);
		if(friendRequest.getStatus()=='D')
		session.delete(friendRequest);
		
	}

	/*public List<Friend> getAllFriends(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query1=session.createQuery("select f.toId from Friend f where f.fromId.email=? and f.status=?");
    	query1.setString(0, email);
    	query1.setCharacter(1,'A');
    	List<Friend> friendList1=query1.list();
    	
		Query query2=session.createQuery("select f.fromId from Friend f where f.toId.email=? and f.status=?");
    	query2.setString(0, email);
    	query2.setCharacter(1,'A');
    	List<Friend> friendList2=query2.list(); 	
    	
    	friendList2.addAll(friendList1);

return friendList2;
	}*/
	
	
	public void unFriend(Friend friend) {
		System.out.println(friend.getStatus()+"**************************************************************");
		Session session=sessionFactory.getCurrentSession();	
	      session.update(friend);
	     
	}
	
	
}
