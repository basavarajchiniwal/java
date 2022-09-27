package com.xworkz.detail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.detail.dto.DetailDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/demo")
public class DetailServlet extends HttpServlet {
	
	private ArrayList<DetailDTO> list=new ArrayList<DetailDTO>();
	
	public DetailServlet() {
		System.out.println("Detail default constructor");
		System.out.println(this.getClass().getSimpleName());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name=req.getParameter("Name");
		String mail=req.getParameter("MailId");
		String cont=req.getParameter("Contact");
		String alter=req.getParameter("Alter No");
		String gen=req.getParameter("gender");
		String edu=req.getParameter("Qualification");
		String yr=req.getParameter("Year");
		String un=req.getParameter("University");
		String add=req.getParameter("Address");
		String skil=req.getParameter("Skill");
		String salary=req.getParameter("Salary");
		String proof=req.getParameter("Id");
		String no=req.getParameter("Id No");
		
		System.out.println("Name :"+ name);
		System.out.println("Email :"+ mail);
		System.out.println("Contact :"+ cont);
		System.out.println("Alter :"+ alter);
		System.out.println("Gender :"+ gen);
		System.out.println("Qualification :"+ edu);
		System.out.println("Year :"+ yr);
		System.out.println("University :"+ un);
		System.out.println("Address :"+ add);
		System.out.println("Skill :"+ skil);
		System.out.println("Salary :"+ salary);
		System.out.println("Id :"+ proof);
		System.out.println("Id No :"+ no);
		
		PrintWriter write=resp.getWriter();
		write.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Registration is success,below is the detail")
		.append("</h1>")
		.append("Name :"+ name)
		.append("<br>")
		.append("Email :"+ mail)
		.append("<br>")
		.append("Contact :"+ cont)
		.append("<br>")
		.append("Alter :"+ alter)
		.append("<br>")
		.append("Gender :"+ gen)
		.append("<br>")
		.append("Qualification :"+ edu)
		.append("<br>")
		.append("Year :"+ yr)
		.append("<br>")
		.append("University :"+ un)
		.append("<br>")
		.append("Address :"+ add)
		.append("<br>")
		.append("Skill :"+ skil)
		.append("<br>")
		.append("Salary :"+ salary)
		.append("<br>")
		.append("Id :"+ proof)
		.append("<br>")
		.append("Id No :"+ no)
		.append("</body>")
		.append("</html>");
		
		DetailDTO dto=new DetailDTO();
		dto.setAddress(add);
		dto.setEmail(mail);
		dto.setPhoneNo(Long.parseLong(cont));
		dto.setAlterPhoneNo(Long.parseLong(alter));
		dto.setGender(gen);
		dto.setQualification(edu);
		dto.setYearOfPassOut(Integer.parseInt(yr));
		dto.setUniversity(un);
		dto.setAddress(add);
		dto.setSkills(skil);
		dto.setExpectedSalary(Double.parseDouble(salary));
		dto.setIdProof(proof);
		dto.setIdProofNumber(Double.parseDouble(no));
			
		list.add(dto);
	}

}
