<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
		<spring:message code="result.titre"/></title>
	</head>
	<body>
		<p>
			<spring:message code="result.label"/>
			
			<c:out value="${resultat}" />
		</p>
	</body>
</html>