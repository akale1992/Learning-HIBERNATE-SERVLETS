package com.spring.di.map;

public class User {
	private int userId;
	private String userName;
	
	public User(int id, String name) {
		// TODO Auto-generated constructor stub
		userId=id;
		userName=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User Id:"+userId+"  User Name:"+ userName;
	}

}
