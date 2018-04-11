<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="base.Pais" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>País Cadastrado</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">  
</head>
<body  style="background-image:url('backgroundmundo.jpg')">
<h1 style= "color:blue">Países</h1>
    <fieldset>
        <legend style="color:white">País Cadastrado</legend>
		<br>
		<p style="color:blue">
 			<%Pais pais = (Pais)request.getAttribute("pais"); %>  
 			Id: <%=pais.getId() %><br>  
 			<br>
 			Nome: <%=pais.getNome() %><br>
 			<br>  
 			População: <%=pais.getPopulacao() %><br>
 			<br>  
 			Área: <%=pais.getArea() %><br> 
		</p>
	</fieldset>
</body>
</html>