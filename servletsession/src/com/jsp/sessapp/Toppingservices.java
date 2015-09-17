package com.jsp.sessapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Toppingservices
 */
@WebServlet("/Toppingservices")
public class Toppingservices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Toppingservices() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session!=null){
			
			String username = (String) session.getAttribute("un");

			String batchname = request.getParameter("btch");
			PrintWriter pw = response.getWriter();

			pw.println("<h1>Login with : " + username + "</h1>"
					+ "<h2>Your Batchname is:" + batchname + "</h2>");
			session.invalidate();
			session = null;
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request,response);
		}
		
	}
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doGet(req, resp);
}
}
