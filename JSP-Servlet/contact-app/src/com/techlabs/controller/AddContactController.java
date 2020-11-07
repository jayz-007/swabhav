package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.ContactService;

/**
 * Servlet implementation class AddContactController
 */
@WebServlet("/AddContactController")
public class AddContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lnmae");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		ContactService cs = new ContactService().getIntance();
		cs.addContact(fname, lname, mname, phone, email);
		RequestDispatcher rd = request.getRequestDispatcher("ContactController");
		rd.forward(request, response);
	}

}
