<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,com.example.stockspring.model.Company"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./jsp/style.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<%
		List<Company> companyList = (List) request.getAttribute("companyList");
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(companyList);
	%>
	<div class="header">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid" style="background: black">
				<div class="navbar-header">
					<img alt="logo" src="./jsp/logo.png">
				</div>
				<div class="navbar-header">
					<a class="navbar-brand" href="#" style="color: white"><b>&nbsp;Stock
							Exchange Chart</b></a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="importData.html">Import Data</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Manage Company<span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="insertCompany.html" style="color: white;">Add
									Company</a></li>
							<li><a href="#" style="color: white;">Update Company</a></li>
							<li><a href="listCompanyPage.html" style="color: white;">List
									of all Companies</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown">Manage Exchange<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="importStockPage.html" style="color: white;">Register
									New Stock Exchange</a></li>
							<li><a href="stockDetails.html" style="color: white;">List
									Stock Exchange</a></li>
						</ul></li>
					<li><a href="updateIPODetails.html">Update IPO details</a></li>

				</ul>
				<div class="nav navbar-nav navbar-right" id="logout">
					<button class="btn navbar-btn">Logout</button>
				</div>
			</div>
		</nav>
	</div>
	<div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<img class="aligncenter" alt="userphoto" src="./jsp/Profilepicture.jfif"
			width="200px" height="200px" style="padding-left: 40px;"><br>
		<hr>
		<p class="aligncenter" style="color: white;">Steve Rogers</p>
		<hr>
		<p class="aligncenter" style="color: white;">Address: Washington
			DC</p>
		<hr>
		<p class="aligncenter" style="color: white;">Contact: 123456789</p>
		<hr>
	</div>
	<span style="font-size: 30px; color: white; cursor: pointer"
		onclick="openNav()">&#9776;</span>
	<script>
		function openNav() {
			document.getElementById("mySidenav").style.width = "250px";
		}

		function closeNav() {
			document.getElementById("mySidenav").style.width = "0";
		}
	</script>
	<div class="container">
		<!-- Code starts from here -->
		<div class="row">
		
				<div class="col-sm-10">
					<div class="card">
						<div class="card-body">
							<h3 class="card-title text-center" align="center">List of
								Companies</h3>
							<hr>
							<table>
								<thead>
									<tr>
										<th>Company Code</th>
										<th>Company Name</th>
										<th>Turnover</th>
										<th>CEO</th>
										<th>Board of Directors</th>
										<th>Sector Id</th>
										<th>Brief WriteUp</th>
										<th style="border-right: none;">Stock Code</th>
									</tr>
								</thead>
								<tbody id="myTable">
									<%
										for (int i = 0; i < companyList.size(); i++) {
											Company e = (Company) companyList.get(i);
									%>
									<tr>
										<td><%=e.getCompany_code()%></td>
										<td><%=e.getCompany_Name()%></td>
										<td><%=e.getTurnover()%></td>
										<td><%=e.getCeo()%></td>
										<td><%=e.getBoardOfDirectors()%></td>
										<td><%=e.getSector().getSector_id()%></td>
										<td><%=e.getSector().getBreifwriteup()%></td>
										<td style="border-right: none;"><%=e.getSector().getStock_Code()%></td>
									</tr>
									<%}%>
									
								</tbody>
							</table>
						</div>
					</div>
				</div>
				
			
		</div>
		<!-- Code ends here -->
	</div>
	<div class="footer">
		<h4>Copyright © 2019 Stock Exchange Chart-All Rights Reserved</h4>
	</div>

</body>
</html>