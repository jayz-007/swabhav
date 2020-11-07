package com.techlabs.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter(value = { "/AuthController", "/EditController", "/AddStudentPageController","/StudentController" })
public class AuthFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public AuthFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Inside Filter");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		String path = req.getRequestURI().substring(req.getContextPath().length());
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("userName");
		String password = request.getParameter("password");

		if (name != null && password != null) {
			if (name.equals("admin") && password.equals("admin")) {
				session.setAttribute("userName", "admin");
				session.setAttribute("password", "admin");
				System.out.println("in name is valid ");
				req.getRequestDispatcher(path).forward(request, response);
	
			}
		} else if (session.getAttribute("userName") != null && session.getAttribute("password") != null) {
			String sessionAttrubuteUserName = session.getAttribute("userName").toString();
			String sessionAtrributePassword = session.getAttribute("password").toString();
			if (sessionAttrubuteUserName.equals("admin") && sessionAtrributePassword.equals("admin")) {
				System.out.println("session valid");
				req.getRequestDispatcher(path).forward(request, response);

			}else {
				req.getRequestDispatcher("/failure.html");
			}

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/StudentController");
			rd.forward(request, response);
			chain.doFilter(request, response);
		}
		req.getRequestDispatcher("/failure.html").forward(request, response);;
		
		
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
