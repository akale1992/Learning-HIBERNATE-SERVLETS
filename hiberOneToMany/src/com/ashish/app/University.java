package com.ashish.app;

import java.util.List;

public class University {
	private int uid;
	private String uname;
	private List<College> college;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public List<College> getCollege() {
		return college;
	}
	public void setCollege(List<College> college) {
		this.college = college;
	}
	
	

}
