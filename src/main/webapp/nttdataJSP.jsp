<%@page import="com.nttdata.tomcat.NttDataJPS"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NTT Data | JSP</title>
</head>
<body>
	<h2>Bienvenidos a NTT Data | Contar</h2>

	<%
	
	for(int i=0; i < 10; i++) {
		out.println("A la de ... " + i + " | ");
	}
	
	%>

	<h2>Elemento llamado desde clase java.</h2>

	<%
	
	out.print(NttDataJPS.helloNttData("Javier"));
	
	%>
</body>
</html>