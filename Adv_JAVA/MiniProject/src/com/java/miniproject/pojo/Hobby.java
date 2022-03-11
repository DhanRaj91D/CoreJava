package com.java.miniproject.pojo;

public class Hobby {
	
	private int hobby_id,hobby_uid;
	private String hobby_name;
	public int getHobby_id() {
		return hobby_id;
	}
	public void setHobby_id(int hobby_id) {
		this.hobby_id = hobby_id;
	}
	public int getHobby_uid() {
		return hobby_uid;
	}
	public void setHobby_uid(int hobby_uid) {
		this.hobby_uid = hobby_uid;
	}
	public String getHobby_name() {
		return hobby_name;
	}
	public void setHobby_name(String hobby_name) {
		this.hobby_name = hobby_name;
	}
	@Override
	public String toString() {
		return "Hobby [hobby_id=" + hobby_id + ", hobby_uid=" + hobby_uid + ", hobby_name=" + hobby_name + "]";
	}
	
	
	

}
