package com.niit.dao;

import java.util.List;

import com.niit.model.BlogPost;

public interface BlogPostDao {
	void saveBlogPost(BlogPost blogPost);
	List<BlogPost>approvedblogs();
	  //For admin 
	  List<BlogPost> blogsWaitingforApproval();

}
