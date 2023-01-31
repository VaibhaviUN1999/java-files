<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send Details of Fav Person</h1>
<form action="fav" method="post">
FirstName:<input type="text" name="fname"><br>
LastName:<input type="text" name="lname"><br>
Gender:Male:<input type="radio" name="gender" value="male">
Female:<input type="radio" name="gender" value="female">
Others:<input type="radio" name="gender" value="others"><br>
Reason:<textarea rows="5" cols="25" name="reason"></textarea><br>
Address:<textarea rows="5" cols="25" name="address"></textarea><br>
<input type="submit" value="send">
</form>
<a href="Display.jsp">JSP PAGE...</a>
</body>
</html>