package com.spring.di.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("question.xml");
		Question question = (Question) context.getBean("question");
		System.out.println(question);

	}

}
