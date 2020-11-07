package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.UserService;

/**
 * Servlet implementation class auth
 */
@WebServlet("/auth")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService adminService;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
		adminService= new UserService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("logout.jsp");
		dispatcher.forward(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession currentSession = request.getSession();
		response.setContentType("text/html");
		String name = request.getParameter("userName");
		String passsword = request.getParameter("password");
		String  status =adminService.getStatus(name, passsword,(String) currentSession.getAttribute("userName"), (String)currentSession.getAttribute("password"));
		if(status.equals("session")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/StudentController");
			dispatcher.forward(request, response);
		}else if (status.equals("normal")) {
			currentSession.setAttribute("userName", name);
			currentSession.setAttribute("password", passsword);
			currentSession.setAttribute("role", adminService.getRole(name, passsword));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/StudentController");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Failure.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}
}
