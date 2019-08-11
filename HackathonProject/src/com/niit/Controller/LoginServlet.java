package com.niit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Dao.LoginDao;
import com.niit.DaoImpl.LoginDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("userName");
		String password=request.getParameter("password");
		
		LoginDao loginDao=new LoginDaoImpl();
		boolean b=loginDao.validateCredentials(username, password);
		if(b==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
		rd.forward(request, response);
		}
		else
		{
			PrintWriter pw=response.getWriter();
			pw.print(" INVALID CREDENTIALS ");
			
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
		
		
	}

}
