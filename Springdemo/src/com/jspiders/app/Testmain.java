package com.jspiders.app;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Testmain {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Pojoclass.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Pojoclass p = (Pojoclass)factory.getBean("poj");
        System.out.println(p);
	}

}
