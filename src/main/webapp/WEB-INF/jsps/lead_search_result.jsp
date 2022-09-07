<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads</title>
</head>
<body>
<h2>All Leads</h2>
<table>
    <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Mobile</th>
   </tr>
    <c:forEach var = "lead" items="${leads}">   
   <tr>
   <td>${lead.firstName}</td>
   <td>${lead.lastName}</td>
   <td>${lead.email}</td>
   <td>${lead.mobile}</td>
   </tr>
  </c:forEach> 
  </table>
</body>
</html>