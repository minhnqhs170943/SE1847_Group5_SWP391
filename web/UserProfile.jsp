<%-- 
    Document   : HomePage
    Created on : May 22, 2024, 8:22:05 AM
    Author     : LAPTOP ASUS
--%>

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
        <header class="header_area sticky-header">
            <div class="main_menu">
                <nav class="navbar navbar-expand-lg navbar-light main_box">
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <a class="navbar-brand logo_h" href="index.html"><img src="img/logo.png" alt=""></a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                            <ul class="nav navbar-nav menu_nav ml-auto">
                                <li class="nav-item active"><a class="nav-link" href="index.html">Home</a></li>
                                <li class="nav-item submenu dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                                       aria-expanded="false">Category</a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-item"><a class="nav-link" href="category.html">Smartphone</a></li>
                                        <li class="nav-item"><a class="nav-link" href="single-product.html">Laptop</a></li>
                                        <li class="nav-item"><a class="nav-link" href="checkout.html">Tablet</a></li>
                                        <li class="nav-item"><a class="nav-link" href="cart.html">Accessory</a></li>
                                    </ul>
                                </li>
                                <li class="nav-item submenu dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                                       aria-expanded="false">Account</a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-item"><a class="nav-link" href="login.html">Login</a></li>
                                        <li class="nav-item"><a class="nav-link" href="tracking.html">User Profile</a></li>
                                        <li class="nav-item"><a class="nav-link" href="elements.html">Change Password</a></li>
                                    </ul>
                                </li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li class="nav-item"><a href="#" class="cart"><span class="ti-bag"></span></a></li>
                                <li class="nav-item">
                                    <button class="search"><span class="lnr lnr-magnifier" id="search"></span></button>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
            <div class="search_input" id="search_input_box">
                <div class="container">
                    <form class="d-flex justify-content-between">
                        <input type="text" class="form-control" id="search_input" placeholder="Search Here">
                        <button type="submit" class="btn"></button>
                        <span class="lnr lnr-cross" id="close_search" title="Close Search"></span>
                    </form>
                </div>
            </div>
        </header>
        <!-- End Header Area -->

        <!-- start banner Area -->
        <section class="banner-area">
            <div class="container">
                <div class="row fullscreen align-items-center justify-content-start">
                    <div class="col-lg-12">
                        <div class="active-banner-slider owl-carousel">
                            <!-- single-slide -->
                            <div class="row single-slide align-items-center d-flex">
                                <div class="col-lg-5 col-md-6">
                                    <div class="banner-content">
                                        <h1>Nike New <br>Collection!</h1>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
                                            dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                                        <div class="add-bag d-flex align-items-center">
                                            <a class="add-btn" href=""><span class="lnr lnr-cross"></span></a>
                                            <span class="add-text text-uppercase">Add to Bag</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-7">
                                    <div class="banner-img">
                                        <img class="img-fluid" src="img/banner/banner-img.png" alt="">
                                    </div>
                                </div>
                            </div>
                            <!-- single-slide -->
                            <div class="row single-slide">
                                <div class="col-lg-5">
                                    <div class="banner-content">
                                        <h1>Nike New <br>Collection!</h1>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et
                                            dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                                        <div class="add-bag d-flex align-items-center">
                                            <a class="add-btn" href=""><span class="lnr lnr-cross"></span></a>
                                            <span class="add-text text-uppercase">Add to Bag</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-7">
                                    <div class="banner-img">
                                        <img class="img-fluid" src="img/banner/banner-img.png" alt="">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End banner Area -->

        <!--================User Profile Area =================-->
        <section class="profile_box_area section_gap">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-8">
                        <div class="profile_form_inner">
                            <h3 class="mb-4 text-center">User Profile</h3>
                            <div class="profile_img text-center mb-4">
                                <img src="img/profile.jpg" alt="User Profile Image" class="img-fluid rounded-circle">
                            </div>
                            <form class="row profile_form" action="profile_update.php" method="post" id="profileForm" novalidate="novalidate">
                                <div class="col-md-12 form-group">
                                    <label for="username">Họ và tên</label>
                                    <input type="text" class="form-control" id="username" name="username" placeholder="Họ và tên" value="John Doe" readonly>
                                </div>
                                <div class="col-md-12 form-group">
                                    <label for="email">Email</label>
                                    <input type="email" class="form-control" id="email" name="email" placeholder="Email" value="john.doe@example.com" readonly>
                                </div>
                                <div class="col-md-12 form-group">
                                    <label for="phone">Số điện thoại</label>
                                    <input type="tel" class="form-control" id="phone" name="phone" placeholder="Số điện thoại" value="123-456-7890" readonly>
                                </div>
                                <div class="col-md-12 form-group">
                                    <label for="address">Địa chỉ</label>
                                    <input type="text" class="form-control" id="address" name="address" placeholder="Địa chỉ" value="123 Main St, Anytown, USA" readonly>
                                </div>
                                <div class="col-md-12 form-group text-center">
                                    <button type="button" class="primary-btn" id="editBtn" onclick="enableEdit()">Edit Profile</button>
                                    <button type="submit" class="primary-btn" id="saveBtn" style="display:none;">Save Changes</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End User Profile Area =================-->

        <!-- start footer Area -->
        <footer class="footer-area section_gap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3  col-md-6 col-sm-6">
                        <div class="single-footer-widget">
                            <h6>About Us</h6>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore dolore
                                magna aliqua.
                            </p>
                        </div>
                    </div>
                    <div class="col-lg-4  col-md-6 col-sm-6">
                        <div class="single-footer-widget">
                            <h6>Newsletter</h6>
                            <p>Stay update with our latest</p>
                            <div class="" id="mc_embed_signup">

                                <form target="_blank" novalidate="true" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
                                      method="get" class="form-inline">

                                    <div class="d-flex flex-row">

                                        <input class="form-control" name="EMAIL" placeholder="Enter Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Email '"
                                               required="" type="email">


                                        <button class="click-btn btn btn-default"><i class="fa fa-long-arrow-right" aria-hidden="true"></i></button>
                                        <div style="position: absolute; left: -5000px;">
                                            <input name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="" type="text">
                                        </div>

                                        <!-- <div class="col-lg-4 col-md-4">
                                                                <button class="bb-btn btn"><span class="lnr lnr-arrow-right"></span></button>
                                                        </div>  -->
                                    </div>
                                    <div class="info"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3  col-md-6 col-sm-6">
                        <div class="single-footer-widget mail-chimp">
                            <h6 class="mb-20">Instragram Feed</h6>
                            <ul class="instafeed d-flex flex-wrap">
                                <li><img src="img/i1.jpg" alt=""></li>
                                <li><img src="img/i2.jpg" alt=""></li>
                                <li><img src="img/i3.jpg" alt=""></li>
                                <li><img src="img/i4.jpg" alt=""></li>
                                <li><img src="img/i5.jpg" alt=""></li>
                                <li><img src="img/i6.jpg" alt=""></li>
                                <li><img src="img/i7.jpg" alt=""></li>
                                <li><img src="img/i8.jpg" alt=""></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-6 col-sm-6">
                        <div class="single-footer-widget">
                            <h6>Follow Us</h6>
                            <p>Let us be social</p>
                            <div class="footer-social d-flex align-items-center">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-dribbble"></i></a>
                                <a href="#"><i class="fa fa-behance"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="footer-bottom d-flex justify-content-center align-items-center flex-wrap">
                    <p class="footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </p>
                </div>
            </div>
        </footer>
        <!-- End footer Area -->

        <script>
            function enableEdit() {
                document.getElementById('username').readOnly = false;
                document.getElementById('email').readOnly = false;
                document.getElementById('phone').readOnly = false;
                document.getElementById('address').readOnly = false;
                document.getElementById('saveBtn').style.display = 'inline-block';
            }
        </script>

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