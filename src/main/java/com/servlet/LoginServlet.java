package com.servlet;

import java.io.IOException;

import com.servlet.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
	String password=req.getParameter("password");
	
	
	
	UserService userservice = new UserService();
	
	boolean result=userservice.loginUser(name, password);
	
	if(result==true) {
		
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
		
	}else {
		req.setAttribute("msg", "Invalid Credintials ! Please Try Again..");
		req.getRequestDispatcher("login.jsp").include(req, resp);
	}
	
	}
	

}
