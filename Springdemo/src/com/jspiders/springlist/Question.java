package com.jspiders.springlist;

import java.util.List;

public class Question {
	private int qnsno;
	private String question;
	private List<Answer> list ;
    public Question(int qnsno, String question ,List<Answer> list) {
		// TODO Auto-generated constructor stub
		this.qnsno=qnsno;
		this.question = question;
		this.list = list;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "For question no "+qnsno+" "+question +"    "+list;
	}

}
