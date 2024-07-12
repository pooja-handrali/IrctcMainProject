package com.example.entity;

public class Coustomer {
	Integer id;
	String name;
	String emailid;
	public Coustomer(Integer id, String name, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
	}
	public Coustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Coustomer [id=" + id + ", name=" + name + ", emailid=" + emailid + "]";
	}
	

}
