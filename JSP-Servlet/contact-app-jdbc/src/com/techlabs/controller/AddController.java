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
 * Servlet implementation class AddController
 */
@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactService contactService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
        contactService=contactService.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ContactForm.html");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in do post do addCon");
		contactService.addStudent(request.getParameter("firstName"),request.getParameter("middleName"), request.getParameter("lastName"), request.getParameter("phone"), request.getParameter("email"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DisplayController");
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
