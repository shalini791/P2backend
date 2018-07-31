package com.niit.dao;

import java.util.List;

import com.niit.model.BlogComments;
import com.niit.model.Blogs;

public interface BlogCommentsDao {
	
	public void PostBlogComment(BlogComments blogcomment);
	public List<BlogComments> GetBlogComments(int id);
	public List<BlogComments> GetAllBlogComments();
	public void DeleteBlogComments(BlogComments blogComments);
}