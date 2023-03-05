<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank X</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="saveDetails" method="get">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="firstname"></td>
</tr>
<tr>
<td>Middle Name</td>
<td><input type="text" name="middlename"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastname"></td>
</tr>
<tr>
<td>Date of Birth</td>
<td><input type="text" name="dob"></td>
</tr>
<tr>
<td>Enter Address</td>
<td><input type="text" name="address"></td>
</tr>
<tr>
<td>User Email ID</td>
<td><input type="text" name="emailID"></td>
</tr>
<tr>
<td>Enter Account Number</td>
<td><input type="text" name="accountno"></td>
</tr>
<tr>
<td><input type="submit" name="REGISTER"></td>
</tr>
</table>
</form>
</body>
</html>