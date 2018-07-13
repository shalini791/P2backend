package com.niit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Null;

@Entity
@Table(name="Blogs")
public class Blogs {

@javax.persistence.Id
@GeneratedValue(strategy=GenerationType.AUTO)
int Id;

@Column(nullable=false)
private String BlogTitle;

@Lob
@Column(nullable=false)
private String BlogContent;

private Date PostedOn;

@ManyToOne
private User PostedBy;

private int Likes;

private Boolean Approved;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getBlogTitle() {
	return BlogTitle;
}

public void setBlogTitle(String blogTitle) {
	BlogTitle = blogTitle;
}

public String getBlogContent() {
	return BlogContent;
}

public void setBlogContent(String blogContent) {
	BlogContent = blogContent;
}

public Date getPostedOn() {
	return PostedOn;
}

public void setPostedOn(Date postedOn) {
	PostedOn = postedOn;
}

public User getPostedBy() {
	return PostedBy;
}

public void setPostedBy(User postedBy) {
	PostedBy = postedBy;
}

public int getLikes() {
	return Likes;
}

public void setLikes(int likes) {
	Likes = likes;
}

public Boolean getApproved() {
	return Approved;
}

public void setApproved(Boolean approved) {
	Approved = approved;
}


}

