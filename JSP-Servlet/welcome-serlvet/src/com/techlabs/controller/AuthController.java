package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static java.lang.System.out;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/AuthController")
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if (name != (null) && password != (null)) {
			if (name.equals("admin") && password.equals("admin")) {
				request.getSession().setAttribute("userName", name);
				request.getSession().setAttribute("password", password);
				RequestDispatcher rd = request.getRequestDispatcher("/login.html");
				rd.forward(request, response);
			} else if (request.getSession().getAttribute("userName") != null
					&& request.getSession().getAttribute("password") != null) {
				if (request.getSession().getAttribute("userName").equals("admin")
						&& request.getSession().getAttribute("password").equals("admin"))
					;
				RequestDispatcher rd = request.getRequestDispatcher("/login.html");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/form.html");
				rd.forward(request, response);
			}
		}

		else {

			out.println("Login failed "+request.getSession().getAttribute("usrName"));
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
