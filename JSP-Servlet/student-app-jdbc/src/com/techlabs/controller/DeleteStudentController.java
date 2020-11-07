package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.StudentService;

/**
 * Servlet implementation class DeleteStudentController
 */
@WebServlet("/deleteController")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentController() {
        super();
        // TODO Auto-generated constructor stub
        studentService= StudentService.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In delete controller");
		studentService.deleteStudent(request.getParameter("delete"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/StudentController");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
