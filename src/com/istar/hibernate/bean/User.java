package com.istar.hibernate.bean;


public class User 
{	

	/* 1. Define varaibles like userId,userName,password as private variables.
	 * 2. Create a constructor for User class.
	 * 3. Create a getters and setters for the variables.
	 * 4. Create a override method.
	 */
	
	private int userId;
	private String userName;
	private String password;
	
	
	public User(String userName, String password)
	{
			super();		
		
        this.userName=userName;
		this.password = password;
		
    }
	public User()
	{
			super();		
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	@Override
	public String toString(){
		return "ID->" + this.userId + " UserName: " + this.userName + " Password: " + this.password;
	}


	
}