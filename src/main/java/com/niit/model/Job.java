package com.niit.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_s180396")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String JobTitle;
private String JobDescription;
private String SkillsRequired;
private String Location;
private String Salary;
private String CompanyName;
private String DatePostedOn;
private String YrsOfExp;
private boolean active;
public int getId() {
	return id;
}
public String getJobTitle() {
	return JobTitle;
}
public void setJobTitle(String jobTitle) {
	JobTitle = jobTitle;
}
public String getJobDescription() {
	return JobDescription;
}
public void setJobDescription(String jobDescription) {
	JobDescription = jobDescription;
}
public String getSkillsRequired() {
	return SkillsRequired;
}
public void setSkillsRequired(String skillsRequired) {
	SkillsRequired = skillsRequired;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public String getSalary() {
	return Salary;
}
public void setSalary(String salary) {
	Salary = salary;
}
public String getCompanyName() {
	return CompanyName;
}
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public String getDatePostedOn() {
	return DatePostedOn;
}
public void setDatePostedOn(String datePostedOn) {
	DatePostedOn = datePostedOn;
}
public String getYrsOfExp() {
	return YrsOfExp;
}
public void setYrsOfExp(String yrsOfExp) {
	YrsOfExp = yrsOfExp;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public void setId(int id) {
	this.id = id;
}
public static void setPostedON(Date date) {
	// TODO Auto-generated method stub
	
}

}
