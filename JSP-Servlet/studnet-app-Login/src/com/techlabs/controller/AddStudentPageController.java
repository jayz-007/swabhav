package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddStudentController
 */
@WebServlet("/AddStudentPageController")
public class AddStudentPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentPageController() {
		super();
		System.out.println("Inside add Controller");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		String usr = null;
		String pd = null;
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("userName");
		String password = request.getParameter("password");

		if (name != null && password != null) {
			if (name.equals("admin") && password.equals("admin")) {
				session.setAttribute("userName", "admin");
				session.setAttribute("password", "admin");
				RequestDispatcher rd = request.getRequestDispatcher("AddStudent.jsp");
				rd.forward(request, response);
			}
		} else if (session.getAttribute("userName") != null && session.getAttribute("password") != null) {
			String sessionAttrubuteUserName = session.getAttribute("userName").toString();
			String sessionAtrributePassword = session.getAttribute("password").toString();
			if (sessionAttrubuteUserName.equals("admin") && sessionAtrributePassword.equals("admin")) {
				RequestDispatcher rd = request.getRequestDispatcher("AddStudent.jsp");
				rd.forward(request, response);

			}

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/StudentController");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
