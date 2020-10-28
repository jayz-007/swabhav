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

import com.techlabs.model.Login;

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
		
		Login login = new Login().getInstance();
		String usr = login.getUserName();
		String pd = login.getPassWord();
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if (name != (null) && password != (null)) {
			if (name.equals(usr) && password.equals(pd)) {
				request.getSession().setAttribute("userName", name);
				request.getSession().setAttribute("password", password);
				RequestDispatcher rd = request.getRequestDispatcher("/success.html");
				rd.forward(request, response);
			} else {

				RequestDispatcher rd = request.getRequestDispatcher("failure.html");
				rd.forward(request, response);
			}

		} else if (request.getSession().getAttribute("userName") != null
				&& request.getSession().getAttribute("password") != null) {
			
			if (request.getSession().getAttribute("userName").equals("admin")
					&& request.getSession().getAttribute("password").equals("admin"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("/success.html");
				rd.forward(request, response);

			}
			
		} else {
			
			out.print(request.getSession().getAttribute("userName")+" "+request.getSession().getAttribute("password"));
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
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
