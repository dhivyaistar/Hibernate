package com.istar.hibernate.controller;


import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;

import com.istar.hibernate.bean.ContactBook;

import com.istar.hibernate.dao.ContactBookDAO;


@WebServlet("/create_update_personaldetail")
public class CreateOrUpdatePersonalDetail extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public CreateOrUpdatePersonalDetail() {
		super();
	}
	
	
	private int qid;
	String searchdata;
	List<ContactBook> searchPersonalDetails = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/* To create an entry in contact book table,
		 * 1. Get all the parameters like name,address,telno,landlineno,dob,websitecompanyname, with the 
		 * request.getparameter method.
		 * 2. Get qid value from the session variable.
		 * 3. Use contact book POJO class to set the variables.
		 * 4. Call saverecord method of contact book table.
		 * 5. Retrieve and send the new list of contacts.
		 */
         RequestDispatcher rd =request.getRequestDispatcher("address_book.jsp"); 
         rd.forward(request, response);
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}