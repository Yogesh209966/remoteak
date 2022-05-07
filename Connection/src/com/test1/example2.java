package com.test1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class example2
 */
@WebServlet("/demo")
public class example2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public example2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		System.out.println("usrname>>"+username);
		String password=request.getParameter("password");
		System.out.println("password>>"+password);
		if ("velocity".equals(username)&&"pune".equals(password)){
			System.out.println("correct info");
			RequestDispatcher rd=request.getRequestDispatcher("NewFile1.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("incorrect info");
			RequestDispatcher rd=request.getRequestDispatcher("NewFile2.jsp");
			rd.forward(request, response);
		}
	
	}

}
