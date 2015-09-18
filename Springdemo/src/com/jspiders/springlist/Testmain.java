package com.jspiders.springlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("question.xml");
		Question question = (Question) context.getBean("question");
		System.out.println(question);

	}

}
