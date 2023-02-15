package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HospitalDao;

@WebServlet("/bbb")
public class Update extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		int id= Integer.parseInt(req.getParameter("id"));
		long ph= Long.parseLong(req.getParameter("ph"));
		
		HospitalDao hd= new HospitalDao();
		hd.update(id, ph);
	}
}
