<%@page import="com.ustglobal.retailermaintenanceproject.dto.ProductBean"%>
<%@page
	import="com.ustglobal.retailermaintenanceproject.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	ProductBean bean = (ProductBean) session.getAttribute("bean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./changepassword">Change Password</a>
	<a href="./createprofile">Update Profile</a>
	<a href="./delete">Delete</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=bean.getProductName()%></h2>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" name="search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
		ProductBean retailerBean = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (retailerBean != null) {
	%>
	<table>
		<tr>
			<th>OrderId</th>
			<th>productName</th>
			<th>price</th>
			<th>quantity</th>
			<th>amountPay</th>
			<th>rid</th>
		</tr>
		<tr>
			<td><%=retailerBean.getOrderId()%></td>
			<td><%=retailerBean.getPrice()%></td>
			<td><%=retailerBean.getQuantity()%></td>
			<td><%=retailerBean.getAmountPay()%></td>
			
		</tr>
	</table>
	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>