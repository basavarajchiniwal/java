package com.xworkz.minister;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/example")
public class PrimeMinisterServlet extends HttpServlet {
	
	
	public PrimeMinisterServlet() {
		System.out.println("PrimeMinisterServlet is running");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String marriage=req.getParameter("marriage");
		String party=req.getParameter("party");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String period=req.getParameter("period");
		String represented=req.getParameter("represented");
		
		req.setAttribute("nam", name);
		req.setAttribute("coun", country);
		req.setAttribute("mar", marriage);
		req.setAttribute("par", party);
		req.setAttribute("ag", age);
		req.setAttribute("gen", gender);
		req.setAttribute("per", period);
		req.setAttribute("time", represented);
		req.setAttribute("msg", "Save Success page");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/Success.jsp");
		dispatcher.forward(req, resp);
	}

}
