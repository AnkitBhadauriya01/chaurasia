package com.demoApi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="coursename",length=50)
//	@NotNull
//	@Size(min=1, message="Name must be min of 1 characters !!")
	String coursename;
	
	@Column(name="coursefees",length=50)
	int coursefees;
	
	@Column(name="courseduration",length=50)
	String courseduration;
	
	@Column(name="coursedescription",length=50)
	String coursedescription;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(int coursefees) {
		this.coursefees = coursefees;
	}
	public String getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}
	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseEntity(int id, String coursename, int coursefees, String courseduration, String coursedescription) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.coursefees = coursefees;
		this.courseduration = courseduration;
		this.coursedescription = coursedescription;
	}
	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", coursename=" + coursename + ", coursefees=" + coursefees
				+ ", courseduration=" + courseduration + ", coursedescription=" + coursedescription + "]";
	}
	
	
	

}
