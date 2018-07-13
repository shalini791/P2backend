package com.niit.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Blogs;

@Repository
@Transactional
public class BlogDaoImpl implements BlogDao {
@Autowired
SessionFactory sf;

    public BlogDaoImpl()
    {
    System.out.println("BlogDaoImpl class Instantiated");	
    }
	
    public void PostBlog(Blogs blog) {
		Session ssn=sf.getCurrentSession();
		ssn.save(blog);

	}
    
    public List<Blogs>GetApprovedBlogs()
    {
    	Session ssn=sf.getCurrentSession();
    	Query query=ssn.createQuery("from Blogs where Approved=true");
    	List<Blogs>Approved_Blogs=query.list();
    	return Approved_Blogs;
    }

	public List<Blogs> GetBlogsWaitingApproval() {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("from Blogs where Approved=false");
    	List<Blogs>Blogs_Waiting_Approval=query.list();
    	return Blogs_Waiting_Approval;
	}

	public void UpdateBlogPost(Blogs blogpost) {
		Session ssn=sf.getCurrentSession();
		ssn.update(blogpost);
		
	}

	public Blogs GetBlog(int id) {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("from Blogs where id=?");
		query.setInteger(0, id);
		Blogs blog=(Blogs)query.uniqueResult();
		return blog;
		
	}

}
