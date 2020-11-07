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
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactService contactService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
        super();
        // TODO Auto-generated constructor stub
        contactService=contactService.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("contact", contactService.getContactUsingId(request.getParameter("edit")));
		RequestDispatcher dispatcher = request.getRequestDispatcher("EditContacts.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		contactService.updateContact(request.getParameter("id"),request.getParameter("firstName") ,request.getParameter("middleName"), request.getParameter("lastName"), request.getParameter("phone"), request.getParameter("email"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DisplayController");
		dispatcher.forward(request, response);
	}

}
