package com.niit.dao;

import java.util.List;

import com.niit.model.Blogs;

public interface BlogDao {
	
	public void PostBlog(Blogs blog);
	public List<Blogs>GetApprovedBlogs();
	public List<Blogs>GetBlogsWaitingApproval();
	public void UpdateBlogPost(Blogs blogpost);
	public Blogs GetBlog(int id);
	

}
