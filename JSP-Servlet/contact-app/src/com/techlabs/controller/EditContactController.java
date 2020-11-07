package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

/**
 * Servlet implementation class EditContactController
 */
@WebServlet("/EditContactController")
public class EditContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("ContactController");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String editContact = request.getParameter("editContactEmail");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lnmae");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		ContactService cs = new ContactService().getIntance();
		cs.editContact(fname, lname, mname, phone, email, editContact);
		RequestDispatcher rd = request.getRequestDispatcher("ContactController");
		rd.forward(request, response);
	}

}
