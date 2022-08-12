package com.demoApi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyEntity {
	@Id
	int id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="studentname",length=50)
	String studentname;
	
	@Column(name="studentemail",length=50)
	String studentemail;
	
	@Column(name="studentmobileno",length=20)
	String studentmobileno;
	
	@Column(name="studentaddress",length=100)
	String studentaddress;
	
	@Column(name="studentcity",length=50)
	String studentcity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public String getStudentmobileno() {
		return studentmobileno;
	}
	public void setStudentmobileno(String studentmobileno) {
		this.studentmobileno = studentmobileno;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	public MyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyEntity(int id, String studentname, String studentemail, String studentmobileno, String studentaddress,
			String studentcity) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentemail = studentemail;
		this.studentmobileno = studentmobileno;
		this.studentaddress = studentaddress;
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", studentmobileno=" + studentmobileno + ", studentaddress=" + studentaddress + ", studentcity="
				+ studentcity + "]";
	}
	
	
	
}
