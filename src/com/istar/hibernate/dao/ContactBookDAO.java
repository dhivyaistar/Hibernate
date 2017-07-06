package com.istar.hibernate.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.istar.hibernate.bean.ContactBook;


public class ContactBookDAO extends BaseDAO
{
	Transaction transaction = null;
	public void saveRecord(ContactBook acc)
	{
		
		/* 1. Create a session.
		 * 2. Begin a transaction.
		 * 3. Create an object of contact book class with name Newrecord.
		 * 4. Get the values from contact book and set the value in new record.
		 * 5. save the session wth object Newrecord.
		 * 6. Commit transaction.
		 */
			
			
	 
	
	}
	public void updateData(int editId, ContactBook acc) {
		 
		/* 1. Create a session.
		 * 2. Create a query string to update the data.
		 * 3. Execute the query string.
		 * 4. Close the connection.
		 */
           
            
	}
    
    

	public List<ContactBook> retrive(int qid)
	 
    {
			
		/* 1. Create a session.
		 * 2. Begin a transaction.
		 * 3. Write a query which can fetch data where Qid value equals to input qid.
		 * 4. Set the query parameter.
		 * 5. Add query result into list.
		 * 6. Commit transaction.
		 * 7. return list.
		 */

            
        }
	public ContactBook retriveeditrecord(int editId)
	 
    {	
		
		/* 1. Create a session.
		 * 2. Begin a transaction.
		 * 3. Write a query which can fetch data where editid1 value equals to input editId.
		 * 4. Set the query parameter.
		 * 5. Add query result into list.
		 * 6. Commit transaction.
		 * 7. return list.
		 */

        }
	 public void deleteData(int deleteId) {
		 
		 /* 1. Create a session.
			 * 2. Create a query string to update the data.
			 * 3. Execute the query string.
			 * 4. Close the connection.
			 */
	           
	    	}
        

		public List<ContactBook> searchByName(String searchdata, int qid)
		 
	    {
			
			/* 1. Create a session.
			 * 2. Begin a transaction.
			 * 3. Create a queryString.
			 * 4. Fetch the details in the list.
			 * 5. Set the values of all the variables.
			 * 6. Commit transaction.
			 * 7. return list.
			 */
		

	            
	        }

		public List<ContactBook> searchByTelNo(String searchdata, int qid)
		 
	    {			
			/* 1. Create a session.
			 * 2. Begin a transaction.
			 * 3. Create a queryString.
			 * 4. Fetch the details in the list.
			 * 5. Set the values of all the variables.
			 * 6. Commit transaction.
			 * 7. return list.
			 */
		

	            
	        }
	 }
 

