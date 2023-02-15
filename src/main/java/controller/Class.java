package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HospitalDao;
import dto.Hospital;

@WebServlet("/aaa")
public class Class extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		int id= Integer.parseInt( req.getParameter("id"));
		String name= req.getParameter("name");
	    String bg =	req.getParameter("bg");
		String p = req.getParameter("p");
	    long ph= Long.parseLong( req.getParameter("ph"));
	
	Hospital hospital = new Hospital();
	hospital.setId(id);
	hospital.setName(name);
	hospital.setBlood_Group(bg);
	hospital.setPlace(p);
	hospital.setPhone(ph);
	
	
	
	HospitalDao hospitalDao = new HospitalDao();
	hospitalDao.insert(hospital);
	
	
	
	
	}
	
	
}
