package com.spring.di.map;

public class Answer {
	
	private int ansId;
	private String ansName;
	
	public Answer(int id, String name) {
		// TODO Auto-generated constructor stub
		ansId=id;
		ansName=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Answer Id:"+ansId+"  Answer Name:"+ ansName;
	}

}
