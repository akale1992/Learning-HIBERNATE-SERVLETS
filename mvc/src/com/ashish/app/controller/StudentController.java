package com.ashish.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashish.app.dto.Studentdto;

public class StudentController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String city = req.getParameter("city");
		Studentdto dto = new Studentdto();
		dto.setId(id);
		dto.setFname(fname);
		dto.setLname(lname);
		dto.setcity(city);
		
	}

	

}
