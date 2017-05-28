<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>  
</head>
<body>
	<h1>Registration Page</h1>
	<form:form  action="./registration.controller" commandName="cmdCus">
	<table>
		<tr>
			<td>First Name:</td>
			<td><input type="text" name="firstName"/></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><input type="text" name="lastName"/></td>
		</tr>
		<tr>
			<td>Customer ID:</td>
			<td><input type="text" name="customerID"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password"/></td>
		</tr>
		
		<tr>
			<td>DOB:</td>
			<td><input type="text" name="dob"/></td>
		</tr>
		<tr>
			<td>Address:</td>
			<td><textarea rows="4" cols="30" name="address"></textarea></td>
		</tr>
		<tr>
			<td>State:</td>
			<td><select name="state">
				<option>Andhra Pradesh</option>
				<option>Telangana</option>
				<option>TamilNadu</option>
			    </select></td>
		</tr>
		<tr>
			<td>Nationality:</td>
			<td><input type="text" name="nationality"/></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><input type="radio" name="gender" value="Female" checked='checked'>Female
			    <input type="radio" name="gender" value="Male">Male</td>
		</tr>
		<tr>
			<td>From Date:</td>
			<td><input type="text" name="fromDate"/></td>
		</tr>
		<tr>
			<td>To Date:</td>
			<td><input type="text" name="toDate"/></td>
		</tr>
		<tr>
			<td>Status:</td>
			<td><input type="text" name="status"/></td>
		</tr>
		<tr>
			<td>Type Of Card:</td>
			<td><input type="text" name="typeOfCard"/></td>
		</tr>
		<tr>
			<td>Bank Name:</td>
			<td><select name="bankName">
				<option>HDFC</option>
				<option>SBI</option>
				<option>INDIAN BANK</option>
			    </select></td>
		</tr>
		<tr>
			<td>Card Exp Date:</td>
			<td><input type="text" name="cardExpDate"/></td>
		</tr>
		<tr>
			<td>Email-ID:</td>
			<td><input type="text" name="emailID"/></td>
		</tr>
		<tr>
			<td>Contact No:</td>
			<td><input type="text" name="contactNo"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit">
				<input type="reset" value="Reset"/>
			</td>
		</tr>
	</table>
	</form:form>
</body>
</html>