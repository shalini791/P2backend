package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.BlogPostLikes;

@Repository
@Transactional
public class BlogPostLikesDaoImpl implements BlogPostLikesDao {
@Autowired
private SessionFactory sf;

    public BlogPostLikesDaoImpl()
    {
     System.out.println("BlogPostLikesDaoImpl class Instantiated");	
    }
	
    public void LikeBlogPost(BlogPostLikes blogpostlike) {
		Session ssn=sf.getCurrentSession();
		ssn.save(blogpostlike);
	}

	public BlogPostLikes HasUserLikedBlogPost(int blogid, String email) {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("from BlogPostLikes where Blogid=? and Likeby=?");
		query.setInteger(0, blogid);
		query.setString(1, email);
		BlogPostLikes BlogPostLike=(BlogPostLikes) query.uniqueResult();
		return BlogPostLike;
		
	}
	
	public void RemoveBlogPostLike(int blogid, String email) {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("delete BlogPostLikes where Blogid=? and Likeby=?");
		query.setInteger(0, blogid);
		query.setString(1, email);
		query.executeUpdate();
		
	}
	
	public List<BlogPostLikes> GetAllLikedBlogs(String email) {
		Session ssn=sf.getCurrentSession();
		Query query=ssn.createQuery("from BlogPostLikes where Likeby=?");
		query.setString(0,email);
		List<BlogPostLikes> AllLikedBlogs=query.list();
		return AllLikedBlogs;
	}

}
