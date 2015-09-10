package com.ashish.app;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	// collecting data
		String unm = req.getParameter("username");
		String psw = req.getParameter("password");
		String msg ="";
	//	processing data
		if (unm.equals(psw)) {
			msg ="<h1> Login sucessful <br> Welcome to Jspider";
			
		} else {
			msg ="<h1> Sorry ..Invalid Username or password";
		}
		//printing data
		
		Writer out = res.getWriter();
		out.write(msg);
		
	}

}
