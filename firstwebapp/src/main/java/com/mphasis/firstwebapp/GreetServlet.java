package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("This is init....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Hello " + name +"," + city + "</h2>");
	}
	
	@Override
	public void destroy() {
		System.out.println("This is destroy....");

	}
}
