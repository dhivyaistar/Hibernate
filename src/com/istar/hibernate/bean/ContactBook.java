package com.istar.hibernate.bean;



public class ContactBook 
{
	
	/* 1. Define varaibles like user,qid,name,telno,dob,address,website,companyname,landlineno,contactId.
	 * 2. Create a constructor for ContactBook.
	 * 3. Create a getters and setters for the variables.
	 * 4. Create a override method.
	 */
	private User user;
	private int qid;
	private String name;
	private String telno;
	private String dob;
	private String address;
	
	private String website;
	private String companyname;
	private String landlineno;
	private int contactId;
	
	
	public ContactBook (  int qid, String name,  String telno, String dob, String address,
			 String website, String companyname, String landlineno ) {
		
		super();
this.qid=qid;
		this.name = name;
		this.telno = telno;
		this.dob = dob;
		this.address = address;
	
		this.website = website;
		this.companyname = companyname;
		this.landlineno = landlineno;
	}

public ContactBook()
{
		super();		
}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLandlineno() {
		return landlineno;
	}

	public void setLandlineno(String landlineno) {
		this.landlineno = landlineno;
	}
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId ) {
		// TODO Auto-generated method stub
		this.contactId= contactId;
	}
	
	   public User getUser()
	   {
		      return user;
		   }
		   public void setUser(User user) 
		   {
		      this.user = user;
		   }


	
	@Override
	public String toString() {
		return "ClassPojo [name = " + name + ", telno = " + telno + ", dob = " + dob + ", address = "
				+ address + " , website = " + website + ", companyname = " + companyname + ", landlineno = " + landlineno + "]";
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qId) {
		this.qid = qId;
	}

	
	
}
