<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<fieldset>
		<legend>Create Profile</legend>
		<form action="./createprofile" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><select name="gender">
							<option>-----Select-----</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
							<option value="O">Others</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="create"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./login">Click here to login</a>
</body>
</html>