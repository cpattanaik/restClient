package com.chandra.rest;

public class Message {

	private int UserId;
	private int id;
	private String title;
	private String body;

	// Must have no-argument constructor
	public Message() {

	}

	public Message(String fname, String lname, int age, int id) {
		this.title = fname;
		this.body = lname;
		this.UserId = age;
		this.id = id;
	}

	
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return new StringBuffer(" First Name : ").append(this.title)
				.append(" Last Name : ").append(this.body)
				.append(" Age : ").append(this.UserId).append(" ID : ")
				.append(this.id).toString();
	}

}