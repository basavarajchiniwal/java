package com.xworkz.detail;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Switch")
public class DetailServlet extends HttpServlet {
	
	public DetailServlet() {
		System.out.println("Detail Default Constructor");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This Is Running");
		
		String name=req.getParameter("Alias");
		String com=req.getParameter("Company");
		String salary=req.getParameter("Salary");
		System.out.println("Name" .concat(name));
		System.out.println("Company" .concat(com));
		System.out.println("pack" .concat(salary));
		
		resp.setContentType("text/html");
		resp.getWriter()
		.append("<html>")
		.append("<body>")
		.append(name)
		.append("/br")
		.append(com)
		.append("/br")
		.append(salary)
		.append("<h1>")
		.append("It Gives the Response")
		.append("</h1>")
		.append("</body>")
		.append("</html>");
		
		

	}
	private PrintStream append(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
