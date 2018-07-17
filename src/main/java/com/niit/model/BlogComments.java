package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Blogcomments")
public class BlogComments {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int CommentId;

private String CommentTxt;

@ManyToOne
private User CommentedBy;

@ManyToOne
private Blogs BlogPost;

private Date CommentedOn;

public int getCommentId() {
	return CommentId;
}

public void setCommentId(int commentId) {
	CommentId = commentId;
}

public String getCommentTxt() {
	return CommentTxt;
}

public void setCommentTxt(String commentTxt) {
	CommentTxt = commentTxt;
}

public User getCommentedBy() {
	return CommentedBy;
}

public void setCommentedBy(User commentedBy) {
	CommentedBy = commentedBy;
}

public Blogs getBlogPost() {
	return BlogPost;
}

public void setBlogPost(Blogs blogPost) {
	BlogPost = blogPost;
}

public Date getCommentedOn() {
	return CommentedOn;
}

public void setCommentedOn(Date commentedOn) {
	CommentedOn = commentedOn;
}



}
