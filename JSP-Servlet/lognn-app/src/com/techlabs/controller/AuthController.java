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

import static java.lang.System.out;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.techlabs.model.Login;
import com.techlabs.service.LoginService;

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
		String usr = null;
		String pd = null;
		LoginService ls = new LoginService().getInstance();
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		// added this part
		for (Login user : ls.getUsers()) {
			if (name != null && password != null) {
				if (user.getUserName().equals(name) && user.getPassWord().equals(password)) {
					usr = user.getUserName();
					pd = user.getPassWord();
				}
			} else if (session.getAttribute("userName") != null && session.getAttribute("password") != null) {
				if (user.getUserName().equals(session.getAttribute("userName").toString())
						&& user.getPassWord().equals(session.getAttribute("password").toString())) {
					usr = user.getUserName();
					pd = user.getPassWord();
				}
			}
			/// til here
		}

		if (name != null && password != null) {
			if (name.equals(usr) && password.equals(pd)) {
				session.setAttribute("userName", usr);
				session.setAttribute("password", pd);
				RequestDispatcher rd = request.getRequestDispatcher("/success.html");
				rd.forward(request, response);
			}
		} else if (session.getAttribute("userName") != null && session.getAttribute("password") != null) {
			String sessionAttrubuteUserName = session.getAttribute("userName").toString();
			String sessionAtrributePassword = session.getAttribute("password").toString();
			if (sessionAttrubuteUserName.equals(usr) && sessionAtrributePassword.equals(pd)) {
				System.out.println(sessionAtrributePassword==usr);
				RequestDispatcher rd = request.getRequestDispatcher("/success.html");
				rd.forward(request, response);

			}
			
		}else if(session.getAttribute("userName").equals("empty")&&session.getAttribute("password").equals("empty")) {
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/failure.html");
		rd.forward(request, response);

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
