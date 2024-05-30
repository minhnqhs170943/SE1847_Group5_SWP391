<%-- 
    Document   : HomePage
    Created on : May 22, 2024, 8:22:05 AM
    Author     : LAPTOP ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx" class="no-js">

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

        <!-- Start Header Area -->
        <%@include file="Header.jsp" %>
        <!-- End Header Area -->
        
        <!--================User Profile Area =================-->
        
<section class="profile_box_area section_gap">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-8" id="UserProfile">
                    <div class="profile_form_inner">
                        <h3 class="mb-4 text-center">User Profiles</h3>
                        <c:choose>
                            <c:when test="${empty userProfiles}">
                                <p>No user profiles found.</p>
                            </c:when>
                            <c:otherwise>
                                <c:forEach var="userProfile" items="${userProfiles}">
                                    <form class="row profile_form" action="UserProfile.jsp" method="get" id="profileForm" novalidate="novalidate">
                                        <div class="col-md-12 form-group">
                                            <label for="username">Họ và tên</label>
                                            <input type="text" class="form-control" id="username" name="username" placeholder="Họ và tên" value="${userProfile.firstName} ${userProfile.lastName}" readonly>
                                        </div>
                                        <div class="col-md-12 form-group">
                                            <label for="email">Email</label>
                                            <input type="email" class="form-control" id="email" name="email" placeholder="Email" value="${userProfile.gmail}" readonly>
                                        </div>
                                        <div class="col-md-12 form-group">
                                            <label for="dob">Ngày sinh</label>
                                            <input type="text" class="form-control" id="dob" name="dob" placeholder="Ngày sinh" value="${userProfile.dob}" readonly>
                                        </div>
                                        <div class="col-md-12 form-group">
                                            <label for="address">Địa chỉ</label>
                                            <input type="text" class="form-control" id="address" name="address" placeholder="Địa chỉ" value="${userProfile.description}, ${userProfile.commune}, ${userProfile.district}, ${userProfile.city}" readonly>
                                        </div>
                                        </c:forEach>
                                        </c:otherwise>
                                        </c:choose>
                                        <div class="col-md-12 form-group text-center">
                                       <button><a class="nav-link" href="UpdateProfile.jsp">Edit Profile</a></button>
                                </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
        <script>
    
</script>
        <!--================End User Profile Area =================-->

        <!-- start footer Area -->
        <%@include file="Footer.jsp" %>
        <!-- End footer Area -->

       

        <script src="js/vendor/jquery-2.2.4.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
        crossorigin="anonymous"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.sticky.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/countdown.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <!--gmaps Js-->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
        <script src="js/gmaps.min.js"></script>
        <script src="js/main.js"></script>
        
    </body>
       
</html>

