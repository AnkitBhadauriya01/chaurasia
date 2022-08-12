package com.demoApi.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	
	String name;
	String email;
	@Id
	@Column(name="phoneno")
	int phoneno;
	String query;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String email, int phoneno, String query) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.query = query;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", phoneno=" + phoneno + ", query=" + query + "]";
	}
	
	
}