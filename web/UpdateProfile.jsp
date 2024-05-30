<%-- 
    Document   : updateProfile
    Created on : May 30, 2024, 6:07:15 PM
    Author     : dohoa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Header.jsp" %>
       <h1>Update Customer Information</h1>
    <form action="UpdateCustomerServlet" method="post">
        <label for="accountID">Account ID:</label>
        <input type="number" id="accountID" name="accountID" required><br><br>

        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" maxlength="45"><br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" maxlength="45"><br><br>

        <label for="DOB">Date of Birth:</label>
        <input type="date" id="DOB" name="DOB"><br><br>

        <label for="addressID">Address ID:</label>
        <input type="number" id="addressID" name="addressID"><br><br>

        <label for="gmail">Gmail:</label>
        <input type="email" id="gmail" name="gmail" maxlength="45"><br><br>

        <input type="submit" value="Update">
    </form>
</html>
