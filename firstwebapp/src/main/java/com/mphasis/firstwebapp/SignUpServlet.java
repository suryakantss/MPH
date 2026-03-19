package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String email = req.getParameter("email");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (email.contains("gmail")) {
			// out.print("<h3>Sign up with official email id</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("failurepage.html");
			rd.forward(req, resp);
		} else {
			out.print("<h3>Thank You for Signing Up!!");
			out.print("<h3>Full Name : " + fname + "</h3>");
			out.print("<h3>Email : " + email + "</h3>");
		}
	}
}
