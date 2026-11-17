<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CRM Application</title>

    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/style.css">
</head>

<body>

    <div id="wrapper">
        <div id="header">
            <h1>Customer Relationship Management Application</h1>
        </div>
    </div>

    <div id="container">
        <div id="content">

            <input type="button"
                   value="Register Customer"
                   onclick="window.location.href='${pageContext.request.contextPath}/showform'"
                   class="add-button"/>

            <table border="1">

                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>City</th>
                    <th>Update Data</th>
                    <th>delete data</th>
                </tr>

<c:forEach var="customer" items="${customers}">
<c:url var="UpdateLink" value="updateform">
<c:param name="cxid" value="${customer.id}"></c:param>
</c:url>

<c:url var="DeleteLink" value="deletedata">
<c:param name="cxid" value="${customer.id}"></c:param>
</c:url>

    <tr>
        <td>${customer.firstname}</td>
        <td>${customer.lastName}</td>
        <td>${customer.city}</td>
        
        <td>
        <a href="${UpdateLink}">Update Information</a>
        </td>
           <td>
        <a href="${DeleteLink}">Delete Information</a>
        </td>
    
    </tr>
</c:forEach>
            </table>

        </div>
    </div>

</body>
</html>