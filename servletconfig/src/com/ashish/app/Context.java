package com.ashish.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String lname = req.getParameter("lname");
		System.out.println(lname);
		ServletContext context = getServletContext();
		String college = context.getInitParameter("college");
		System.out.println(college);
		
		PrintWriter pw = resp.getWriter();
		*/
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
//		rd.forward(req, resp);
		rd.include(req, resp);
		
		
		
//		pw.write("<html><body><h1> Lastname :" + lname + "<br>   College " + college);
		
		
		
	}

}