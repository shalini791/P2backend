package com.niit.dao;

import java.util.List;

import com.niit.model.BlogPostLikes;

public interface BlogPostLikesDao {
	
	public void LikeBlogPost(BlogPostLikes blogpostlike);
	public BlogPostLikes HasUserLikedBlogPost(int blogid,String email); 
	public void RemoveBlogPostLike(int blogid,String email);
	public List<BlogPostLikes> GetAllLikedBlogs(String email);
	
}
