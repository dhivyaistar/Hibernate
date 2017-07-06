package com.istar.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.util.Random;

import com.istar.hibernate.bean.User;

public class UserDAO extends BaseDAO{
	public void saveUserDetails( String userName, String password) {
		
			/* 1. Create a session.
			 * 2. Begin transaction.
			 * 3. Create a new object of persistent class user.
			 * 4. Set the values of username and password.
			 * 5. Save the session.
			 * 6. Commit transaction.
			 * 7. Include try catch method.
			 */
		
		
	}

	public int getUserID(String userNameInput)
	{	
		/* 1. Create a session.
		 * 2. Set the values of userNameInput using setParamter.
		 * 3. Create a list object and call list.
		 * 4. Return the list if size >0.
		 * 5. else return -1.
		 */
		
		
	}
	
	public boolean searchUserDetails(String userNameInput, String passwordInput)
	{
		/* 1. Create a session.
		 * 2. Create a query for search from user table.
		 * 3. Set the query parameters.
		 * 4. Save the output list into variables.
		 * 5. check if list size is greater than zero return true otherwise false.
		 */
	
}}