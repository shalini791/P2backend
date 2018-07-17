package com.niit.dao;

import java.util.List;

import com.niit.model.BlogComments;

public interface BlogCommentsDao {
	
	public void PostBlogComment(BlogComments blogcomment);
	public List<BlogComments> GetBlogComments(int id);
	public List<BlogComments> GetAllBlogComments();
}