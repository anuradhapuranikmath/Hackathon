package com.niit.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Dao.RegisterDao;
import com.niit.DaoImpl.RegisterDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   String name=request.getParameter("userName");
	   String cname=request.getParameter("customerName");
	   String emailId=request.getParameter("emailId");
	   String password=request.getParameter("password");
	   
	   RegisterDao registerDao=new RegisterDaoImpl();
	   registerDao.adduser(name, password, emailId, cname);
	   
	
	}

}
