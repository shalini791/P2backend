package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bloglikes")
public class BlogPostLikes {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int Likeid;

private int Blogid;

private String Likeby;


public int getLikeid() {
	return Likeid;
}

public void setLikeid(int likeid) {
	Likeid = likeid;
}

public int getBlogid() {
	return Blogid;
}

public void setBlogid(int blogid) {
	Blogid = blogid;
}

public String getLikeby() {
	return Likeby;
}

public void setLikeby(String likeby) {
	Likeby = likeby;
}



}
