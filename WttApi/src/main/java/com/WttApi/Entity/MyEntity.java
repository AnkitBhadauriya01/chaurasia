package com.WttApi.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyEntity {
	
	@Id
	int id;
	String name;
	String email;
	String address;
	int mobileno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public MyEntity(int id, String name, String email, String address, int mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileno = mobileno;
	}
	public MyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobileno="
				+ mobileno + "]";
	}
	
	
	}
	


