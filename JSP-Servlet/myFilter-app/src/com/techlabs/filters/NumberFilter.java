package com.techlabs.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class NumberFilter
 */
@WebFilter("/AddNumber")
public class NumberFilter implements Filter {

    /**
     * Default constructor. 
     */
    public NumberFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("numberOne"));
		int num2 = Integer.parseInt(request.getParameter("numberTwo"));
		System.out.println("hello filter");
		if(num1 >0 && num2>0)
		chain.doFilter(request, response);
		else
			out.print("Enter positive number");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
