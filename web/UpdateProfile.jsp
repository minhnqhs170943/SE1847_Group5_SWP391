<%-- 
    Document   : UpdateProfile
    Created on : May 30, 2024, 12:13:13 PM
    Author     : dohoa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="CodePixar">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>Karma Shop</title>
        <!--
                CSS
                ============================================= -->
        <link rel="stylesheet" href="css/linearicons.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="css/nouislider.min.css">
        <link rel="stylesheet" href="css/ion.rangeSlider.css" />
        <link rel="stylesheet" href="css/ion.rangeSlider.skinFlat.css" />
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/main.css">
        <style>
            body {
                background-color: #f8f9fa;
                font-family: Arial, sans-serif;
            }

            h2, h3 {
                color: #343a40;
            }

            form {
                background-color: #ffffff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            form .btn-primary {
                background-color: #ff6600;
                border-color: #ff6600;
                transition: background-color 0.3s ease, border-color 0.3s ease;
            }

            form .btn-primary:hover {
                background-color: #e65c00;
                border-color: #e65c00;
            }

            form .btn-secondary {
                background-color: #6c757d;
                border-color: #6c757d;
                transition: background-color 0.3s ease, border-color 0.3s ease;
            }

            form .btn-secondary:hover {
                background-color: #5a6268;
                border-color: #545b62;
            }

            form .form-group label {
                font-weight: bold;
            }

            form .form-control {
                margin-bottom: 15px;
            }

            .img-fluid {
                border-radius: 8px;
            }

            .text-center a, .login_form_inner a {
                color: #ff6600;
                text-decoration: none;
            }

            .text-center a:hover, .login_form_inner a:hover {
                text-decoration: underline;
            }

            .login_box_img {
                position: relative;
            }

            .login_box_img .hover {
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                text-align: center;
                color: #fff;
            }

            .login_box_img .primary-btn {
                background-color: #ff6600;
                border: none;
                padding: 10px 20px;
                color: #fff;
                transition: background-color 0.3s ease;
            }

            .login_box_img .primary-btn:hover {
                background-color: #e65c00;
            }

            .profile_form_inner {
                background-color: #ffffff;
                padding: 30px;
                border-radius: 10px;
                box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            }

            .profile_img {
                margin-bottom: 20px;
            }

            .primary-btn {
                background-color: #ff6600;
                border-color: #ff6600;
                transition: background-color 0.3s ease, border-color 0.3s ease;
            }

            .primary-btn:hover {
                background-color: #e65c00;
                border-color: #e65c00;
            }

            #saveBtn {
                display: none;
            }
        </style>
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
       <%@include file="Footer.jsp" %>
    </body>
</html>
