package com.servlet;

import java.io.IOException;

import com.servlet.entity.User;
import com.servlet.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("Service Method Called");
		// resp.getWriter().println("Registration Successfull");
		resp.setContentType("text/html");
		String name = req.getParameter("fullname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println(name);
		System.out.println(email);
		System.out.println(password);

		User user = new User(name, email, password);
		UserService userservice = new UserService();

		String msg = userservice.saveUser(user);
		
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("register.jsp").include(req, resp);
		//resp.getWriter().println("<h2 style='color:green'>" + msg + "<h2>");
		//req.getRequestDispatcher("register.html").include(req, resp);

	}

}
