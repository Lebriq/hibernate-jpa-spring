<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
		<spring:message code="acceuil.titre"/></title>
	</head>
	<body>
		<p>
			<spring:message code="accueil.label"/>
			
			
			<form:form method="post" commandName="user"   action="results">
				
				<spring:message code="acceuil.label.id" />
				<form:input path="id" type="text" />
				  
				  
				<spring:message code="acceuil.label.nom" />
				<form:input path="nom" type="text" />
				
				<input type="submit"/>
			</form:form>
		</p>
	</body>
</html>