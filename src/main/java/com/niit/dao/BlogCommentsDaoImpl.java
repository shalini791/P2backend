package com.niit.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.BlogComments;

@Repository
@Transactional
public class BlogCommentsDaoImpl implements BlogCommentsDao{
	@Autowired
	private SessionFactory sf;
	
	public BlogCommentsDaoImpl()
    {
     System.out.println("BlogCommentsDaoImpl class Instantiated");	
    }

	public void PostBlogComment(BlogComments blogcomment) {
		Session ssn=sf.getCurrentSession();
		ssn.save(blogcomment);
		
	}

	public List<BlogComments> GetBlogComments(int id) {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("from BlogComments where BlogPost.Id=?");
		query.setInteger(0,id);
		List<BlogComments> BlogComments=query.list();
		return BlogComments;
		
	}

	public List<BlogComments> GetAllBlogComments() {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("from BlogComments");
		List<BlogComments> AllBlogComments=query.list();
		return AllBlogComments;
	}

	public void DeleteBlogComments(BlogComments blogComments) {
		Session ssn=sf.getCurrentSession();
		ssn.delete(blogComments);
		
	}
	
	

}
