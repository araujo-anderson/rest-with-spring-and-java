package com.example.demo;

public class Greeting {
	
	private long id;
	private String content;
	
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
