<%-- 
    Document   : single
    Created on : Oct 20, 2018, 4:52:06 PM
    Author     : Duong
--%>

<%@page import="model.Product"%>
<%@page import="dao.DaoProduct"%>
<%@page import="model.Cart"%>
<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Customer"%>
<%@page import="dao.DaoCategory"%>
<%@page import="model.Category"%>
<%@page import="model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Single :: w3layouts</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <!--theme-style-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <!--//fonts-->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <link rel="stylesheet" href="css/etalage.css">
        <script src="js/jquery.etalage.min.js"></script>
        <script>
                            jQuery(document).ready(function ($) {

                                $('#etalage').etalage({
                                    thumb_image_width: 300,
                                    thumb_image_height: 400,
                                    source_image_width: 900,
                                    source_image_height: 1200,
                                    show_hint: true,
                                    click_callback: function (image_anchor, instance_id) {
                                        alert('Callback example:\nYou clicked on an image with the anchor: "' + image_anchor + '"\n(in Etalage instance: "' + instance_id + '")');
                                    }
                                });

                            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>
        <%
            DaoCategory daoCategory = new DaoCategory();
            Customer customer = null;
            if (session.getAttribute("customer") != null) {
                customer = (Customer) session.getAttribute("customer");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
        <!--header-->
        <div class="header">
            <div class="header-top">
                <div class="container">	
                    <div class="header-top-in">			
                        <div class="logo">
                            <span>Duongpmse05785</span></br>
                            <span>SE1215</span>
                            <a href="login_admin.jsp"><span>Admin page</span></a>
                        </div>
                        <div class="header-in">
                            <ul class="icon1 sub-icon1">
                                <%
                                    if (customer != null) {
                                %>
                                <li><a href="CustomerInfo.jsp?cid=<%= customer.getCid() %>"> Welcome: <%=customer.getCname()%></a> </li>
                                <li><a href="logout.jsp"> Logout </a></li>
                                <%}%>
                                <% 
                                    if(customer == null) {                                       
                                %>                              
                                <li><a href="account.jsp"> Login</a></li>
                                <%}%>
                                <li><a href="checkout.jsp" >Checkout</a> </li>	
                                <li><div class="cart">
                                        <a href="#" class="cart-in"> </a>
                                        <span>(<%=cart.countProduct()%>)</span>
                                    </div>
                                    <!-- cart -->
                                    <ul class="sub-icon1 list">
                                        <!-- product count -->
                                        <h3>Recently added items</h3>
                                        <% for(Map.Entry<String,Item> list : cart.getCartItems().entrySet()) {%>
                                        <!-- product information -->
                                        <div class="shopping_cart">
                                            <div class="cart_box">
                                                <div class="message">
                                                    
                                                    <div class="list_img"><img src="<%= list.getValue().getProduct().getPicture() %>" class="img-responsive" alt=""></div>
                                                    <div class="list_desc"><h4><a href="CartServlet?service=remove&sid=<%=list.getValue().getProduct().getSid()%>"><%=list.getValue().getProduct().getSname()%></a></h4><%=list.getValue().getQuantity()%> x<span>
                                                            $<%=list.getValue().getProduct().getPrice()%></span></div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                        <%}%>
                                        <!-- total price -->
                                        <div class="total">
                                            <div class="total_left">CartSubtotal : </div>
                                            <div class="total_right">$<%=cart.total()%></div>
                                            <div class="clearfix"> </div>
                                        </div>
                                        <div class="login_buttons">
                                            <div class="check_button"><a href="checkout.jsp">Check out</a></div>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="clearfix"></div>
                                        
                                    </ul>
                                    <!-- end cart -->
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
            <div class="header-bottom">
                <div class="container">
                    <div class="h_menu4">
                        <a class="toggleMenu" href="#">Menu</a>
                        <ul class="nav">
                            <li class="active"><a href="index.jsp"><i> </i>Home</a></li>
                            <li ><a href="#" >Product brands</a>
                                <ul class="drop"> 
                                <%
                                                for (Category c : daoCategory.getListCategory()) {
                                %>
                                
                                    <li><a href="products.jsp?hid=<%=c.getHid()%>"><%=c.getHname()%></a></li>
                                <%}%>
                               </ul>
                            </li> 						
                        </ul>
                        <script type="text/javascript" src="js/nav.js"></script>
                    </div>
                </div>
            </div>
            <div class="header-bottom-in">
                <div class="container">
                    <div class="header-bottom-on">
                        <p class="wel"><a href="register.jsp">Create account here.</a></p>
                        <div class="header-can">
                            <ul class="social-in">
                                <li><a href="#"><i> </i></a></li>
                                <li><a href="#"><i class="facebook"> </i></a></li>
                                <li><a href="#"><i class="twitter"> </i></a></li>					
                                <li><a href="#"><i class="skype"> </i></a></li>
                            </ul>	
                            <div class="search">
                                <form>
                                    <input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                this.value = '';}" >
                                    <input type="submit" value="">
                                </form>
                            </div>

                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>
        <!---->
        <%
            DaoProduct daoProduct = new DaoProduct();
            Product product = new Product();
            String sid = "";
            if(request.getParameter("sid")!=null) {
                sid = request.getParameter("sid");
                product = daoProduct.getProductInfo(sid);
            }
        %>
        <div class="container">
            <div class="single">
                <div class="col-md-9 top-in-single">
                    <div class="col-md-5 single-top">	
                        <ul id="etalage">
                            <li>
                                <a href="optionallink.jsp">
                                    <img class="etalage_thumb_image img-responsive" src="<%= product.getPicture() %>" alt="pics" >
                                    <img class="etalage_source_image img-responsive" src="<%= product.getPicture() %>" alt="pics" >
                                </a>
                            </li>
                        </ul>

                    </div>	
                    <div class="col-md-7 single-top-in">
                        <div class="single-para">
                            <h4><%= product.getSname() %></h4>
                            <div class="para-grid">
                                <span  class="add-to">$<%= product.getPrice() %></span>
                                <div class="clearfix"></div>
                            </div>
                            <h5><%= product.getQuantity() %> item(s) in stock</h5>
                            </br>
                            <h3>Description</h3>
                            <p><%= product.getDescription() %></p>
                            <a href="CartServlet?service=plus&sid=<%= product.getSid() %>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
                        </div>
                    </div>
                    <div class="clearfix"> </div>
                    <div class="content-top-in">    


                        <div class="clearfix"></div>
                    </div>
                </div>
                
                <div class="clearfix"> </div>
            </div>
        </div>
        <!---->
        <div class="footer">
            
            <!---->
            <div class="footer-middle">
                <div class="container">
                    <div class="footer-middle-in">
                        <h6>About us</h6>
                        <p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Information</h6>
                        <ul>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Delivery Information</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Terms & Conditions</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Customer Service</h6>
                        <ul>
                            <li><a href="contact.jsp">Contact Us</a></li>
                            <li><a href="#">Returns</a></li>
                            <li><a href="#">Site Map</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>My Account</h6>
                        <ul>
                            <li><a href="account.jsp">My Account</a></li>
                            <li><a href="#">Order History</a></li>
                            <li><a href="wishlist.jsp">Wish List</a></li>
                            <li><a href="#">Newsletter</a></li>
                        </ul>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Extras</h6>
                        <ul>
                            <li><a href="#">Brands</a></li>
                            <li><a href="#">Gift Vouchers</a></li>
                            <li><a href="#">Affiliates</a></li>
                            <li><a href="#">Specials</a></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <p class="footer-class">Copyright © 2015 Bonfire Template by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
            <script type="text/javascript">
                $(document).ready(function () {
                    /*
                     var defaults = {
                     containerID: 'toTop', // fading element id
                     containerHoverID: 'toTopHover', // fading element hover id
                     scrollSpeed: 1200,
                     easingType: 'linear' 
                     };
                     */

                    $().UItoTop({easingType: 'easeOutQuart'});

                });
            </script>
            <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

        </div>
    </body>
</html>