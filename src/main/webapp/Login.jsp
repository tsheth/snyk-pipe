<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html> 
	<head> 
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<title>Login Page</title> 
	</head> 
	<body> 
		<h1>User Details</h1> 
		<%-- The form data will be passed to acceptuser.jsp 
			for validation on clicking submit 
		--%> 
		<form method ="get" action="validate.jsp"> 
			Enter Username : <input id="username" type="text" name="user"><br/><br/> 
			Enter Password : <input id="passwd" type="password" name ="pass"><br/> 
				<input id="SubmitLogin" type ="submit" value="SUBMIT">	 
		</form> 
	</body> 
</html> 
	
