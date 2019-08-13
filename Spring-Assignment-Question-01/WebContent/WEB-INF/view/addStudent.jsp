<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h1>Enter Details of a new Student</h1>
	<form action="processAddStudent" >
		<label for="Name" > Name: <input type="text" id="Name"
				name="Name"  />
		</label>
		<br />
		<br />
		<label for="section" > Section: <input type="text"
				id="section" name="section"  />
		</label>
		<br />
		<br />
		<label for="fatherName" > Father Name: <input type="text"
				id="fatherName" name="fatherName" />
		</label>
		<br />
		<br />
		<label for="address" > Address: <input type="text"
				id="address" name="address"  />
		</label>
		<br />
		<br />
		<button type="submit">Submit</button>
	</form>
</body>
</html>