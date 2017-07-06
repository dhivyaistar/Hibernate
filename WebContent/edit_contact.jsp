<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.HashMap"%>
<%@ page import="com.istar.hibernate.bean.ContactBook" %>
<%@ page import="com.istar.hibernate.dao.ContactBookDAO" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String url = request.getRequestURL().toString();
	String baseURL = url.substring(0, url.length() - request.getRequestURI().length())
			+ request.getContextPath() + "/";
%>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>PhoneBook | Edit Form</title>
<link href="<%=baseURL%>css/bootstrap.min.css" rel="stylesheet">
<link href="<%=baseURL%>font-awesome/css/font-awesome.css"
	rel="stylesheet">
<link href="<%=baseURL%>css/animate.css" rel="stylesheet">
<link href="<%=baseURL%>css/style.css" rel="stylesheet">
<link href="css/plugins/dataTables/datatables.min.css" rel="stylesheet">
<%

boolean newData = true;
ContactBookDAO rs = new ContactBookDAO();
int id1 = 0;

ContactBook pdetails = new ContactBook();
System.out.println("hhhhhhhhhh" +request.getParameter("editId"));
if (request.getParameterMap().containsKey("editId")&&(request.getParameter("editId").compareTo("0")!= 0))
{
	System.out.println("Hell in edit");
	id1 = Integer.parseInt(request.getParameter("editId"));
 	pdetails = rs.retriveeditrecord(id1);
	newData = false;
}

%>
</head>
<body>
	<div id="wrapper">
		<div id="page-wrapper" class="gray-bg"
			style="min-height: 418px; margin-left: auto;">
			<div class="row">
				<div class="col-lg-12">
					<div class="ibox float-e-margins">
						<div class="ibox-title">
							<h5>Phone Book</h5>

						</div>
						<div class="ibox-content">
							<form class="form-horizontal" method="POST"
								action="<%=baseURL%>create_update_personaldetail">
								
								<div class="form-group">
									<label class="col-lg-2 control-label">Name</label> <input
										type="hidden" name="newData" value="<%=newData%>"> <input
										type="hidden" name="editId" value="<%=id1%>">
									<div class="col-lg-4">
										<input type="text" placeholder="Name" name="name"
											value="<%=!newData ? pdetails.getName() : ""%>"
											class="form-control">
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-2 control-label">Tel No</label>
									<div class="col-lg-4">
										<input type="text" class="form-control" name="telno"
											value="<%=!newData ? pdetails.getTelno() : ""%>"
											data-mask="9999999999" placeholder=""> <span
											class="help-block">9999999999</span>
									</div>
								</div>

								<div class="form-group">
									<label class="col-sm-2 control-label">DOB</label>
									<div class="col-sm-4">
										<input type="text" class="form-control" data-mask="99/99/9999"
											value="<%=!newData ? pdetails.getDob() : ""%>" name="dob"
											placeholder=""> <span class="help-block">dd/mm/yyyy</span>
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-2 control-label">Address</label>

									<div class="col-lg-6">
										<input type="text" placeholder="Address" name="address"
											value="<%=!newData ? pdetails.getAddress() : ""%>"
											class="form-control">
									</div>
								</div>
							
									<div class="form-group">
										<label class="col-lg-2 control-label">Website</label>

										<div class="col-lg-4">
											<input type="text" placeholder="Url"
												value="<%=!newData ? pdetails.getWebsite() : ""%>"
												name="url" class="form-control">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 control-label">Company Name</label>

										<div class="col-lg-4">
											<input type="text" placeholder="company name"
												value="<%=!newData ? pdetails.getCompanyname() : ""%>"
												name="cname" class="form-control">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 control-label">Landline No</label>

										<div class="col-lg-4">
											<input type="number" placeholder="landlineno"
												value="<%=!newData ? pdetails.getLandlineno() : ""%>"
												name="landlineno" class="form-control">
										</div>
									</div>
								</div>

									</div>
								</div>

								<div class="form-group">
									<div class="col-lg-offset-2 col-lg-10">
										<button class="btn btn-sm btn-white" type="submit">Add</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
		