package com.jsp.sessapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Pizzaservices
 */
@WebServlet("/Pizzaservices")
public class Pizzaservices extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Pizzaservices() {
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
		String username = request.getParameter("usn");
		HttpSession session = request.getSession(true);
		request.setAttribute("usn",username);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor='pink'>" +"<h3>Welcome Mr:" +
				""+username+"</h3>" +
				"<form method='post' action='Topping'>" +
				"Enter batchname:<input type='text' " +
				"name='btch'><br>" +
				"<input type='submit' value='Proced' >" +
				"</body></html>");
		
		
	}

}
