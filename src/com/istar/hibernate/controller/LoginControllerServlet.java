package com.istar.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import com.istar.hibernate.bean.ContactBook;

import com.istar.hibernate.dao.ContactBookDAO;
import com.istar.hibernate.dao.UserDAO;

@WebServlet("/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		/* 1. Get the username and password and store in into a string variable.
		 * 2. Check whether the data exists or not.
		 * 3. If it does not exist then call the saveUserDetails method and pass the username and password value.
		 * 4. Otherwise call searchUserDetails method and print login success message.
		 * 5. Enclose the code under try/catch block. 
		 */
		String userNameInput = request.getParameter("userName");
		String passwordInput = request.getParameter("password");
		Boolean Datareq = Boolean.parseBoolean(request.getParameter("Data1"));
		try {
			UserDAO userDAO = new UserDAO();
			
			if(Datareq== false){
				
			  userDAO.saveUserDetails(userNameInput, passwordInput);
			  PrintWriter out = response.getWriter();
              out.print("<p> Signup successful!!</p>");  
			  RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	            rd.include(request,response);
			//User user = new User();
			}
			if(Datareq== true)
			{
			boolean isLoginSucess = userDAO.searchUserDetails(userNameInput, passwordInput);
			System.out.println("Login Status "+isLoginSucess);
		
			if(isLoginSucess)
			{ 
		      //call for contact book page
			}
			
			else
			{
				//call for login page with error
	        	
			}
			
		}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}