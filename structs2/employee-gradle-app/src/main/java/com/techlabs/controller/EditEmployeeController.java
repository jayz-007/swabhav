package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeService;

/**
 * Servlet implementation class EditEmployeeController
 */
@WebServlet("/EditEmployeeController")
public class EditEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("Name");
		String role = request.getParameter("Role");
		String id =request.getParameter("id");
		EmployeeService es = new EmployeeService().getInstance();
		for(Employee emp : es.getEmployees()) {
			if(emp.getId().toString().equals(id)) {
				emp.setName(name);
				emp.setRole(role);
				PrintWriter out = response.getWriter();
				RequestDispatcher rd =request.getRequestDispatcher("EmployeeController");
				rd.forward(request, response);
				break;
			}
		}
		
	
		
	}

}
