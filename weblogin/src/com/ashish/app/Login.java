package com.ashish.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String p = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if (p.equals("admin")) {
		RequestDispatcher req =	request.getRequestDispatcher("servlet2");
		req.forward(request, response);
			
		} else {
			out.println("Enter right password");
			RequestDispatcher req =	request.getRequestDispatcher("login.jsp");
			req.include(request, response);
			

		}
	}

}
