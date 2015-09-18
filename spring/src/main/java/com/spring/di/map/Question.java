package com.spring.di.map;

import java.util.Map;

public class Question {
	
	private int id;
	private String name;
	private Map<Answer, User> answer;
	
	public Question(int id, String name, Map<Answer, User> answer) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.answer=answer;
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub=
		return "Question Id:"+id+"  Question Name:"+ name+"   Answers:"+ answer;
	}

}
