package com.ashish.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigDemo
 */

public class ConfigDemo extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("un");
		System.out.println(name);

		ServletConfig config = getServletConfig();
		String bran = config.getInitParameter("branch");
		String age = config.getInitParameter("age");

		ServletContext context = getServletContext();
		String college = context.getInitParameter("college");

		PrintWriter pw = response.getWriter();
		pw.println("<html><body><h1> Username :" + name + "<br> Branch :"
				+ bran + "<br> Age :" + age + "<br>" + "College " + college);

	}

}
