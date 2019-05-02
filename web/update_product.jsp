<%@page import="model.Product"%>
<%@page import="dao.DaoProduct"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DaoCategory"%>
<%@page import="model.Category"%>
<%@page import="model.Admin"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Panelo - Free Admin Template</title>
        <link href="style1.css" rel="stylesheet" type="text/css"/>
        <link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>
            <!-- jQuery file -->
            <script src="js/jquery.min1.js"></script>
            <script src="js/jquery.tabify.js" type="text/javascript" charset="utf-8"></script>
            
            <script src="js/jquery.tabify.js" type="text/javascript"></script>
            
            <script type="text/javascript">
                var $ = jQuery.noConflict();
                $(function () {
                    $('#tabsmenu').tabify();
                    $(".toggle_container").hide();
                    $(".trigger").click(function () {
                        $(this).toggleClass("active").next().slideToggle("slow");
                        return false;
                    });
                });
            </script>
    </head>
    <body>
        <%
            Admin admin = null;
            if (session.getAttribute("admin") != null) {
                admin = (Admin) session.getAttribute("admin");
            }
            DaoCategory daoCate = new DaoCategory();
            ArrayList<Category> list = daoCate.getListCategory();
        %>
        <div id="panelwrap">

            <div class="header">
                
                <div class="title"><a href="#">Adminstrator</a></div>
                
                <% 
                    if(admin != null) {
                %>
                
                <div class="header_right">Welcome <%= admin.getUsername() %>, <a href="logout_admin.jsp" class="logout">Logout</a> </div>
                
                <%}%>
                
                <div class="menu">
                    <ul>
                        <li><a href="#" class="selected">Home</a></li>
                        <li><a href="#">Admin settings</a></li>
                        <li><a href="#">Help</a></li>
                    </ul>
                </div>

                <%
                    DaoProduct dao = new DaoProduct();
                    String sid = request.getParameter("sid");
                    Product product = dao.getProductInfo(sid);
                %>
            <div class="center_content">  

                <div id="right_wrap">
                    <div id="right_content">             

                        <ul id="tabsmenu" class="tabsmenu">
                            <li class="active"><a href="#tab1">Form Design Structure</a></li>
                        </ul>
                        
                        <form method="post" action="UpdateProductServlet?sid=<%= sid %>">
                        
                        <div id="tab1" class="tabcontent">
                            <h3>Update product</h3>
                            <div class="form">

                                <div class="form_row">
                                    <label hidden>Sid</label>
                                    <input type="text" class="form_input" name="sid" hidden value="<%= sid %>"/>
                                </div>
                                
                                <div class="form_row">
                                    <label>Sname</label>
                                    <input type="text" class="form_input" name="sname" value="<%= product.getSname() %>"/>
                                </div>

                                <div class="form_row">
                                    <label>Quantity</label>
                                    <input type="text" class="form_input" name="quantity" value="<%= product.getQuantity() %>"/>
                                </div>

                                <div class="form_row">
                                    <label>Price</label>
                                    <input type="text" class="form_input" name="price" value="<%= product.getPrice() %>"/>
                                </div>

                                <div class="form_row">
                                    <label>Image</label>
                                    <input type="text" class="form_input" name="picture" value="<%= product.getPicture() %>"/>
                                </div>

                                
                                <div class="form_row">
                                    <label>Description</label>
                                    <textarea class="form_textarea" name="description" value="<%= product.getDescription() %>"></textarea>
                                </div>
                                                          
                                <div class="form_row">
                                    <input type="submit" class="form_submit" value="Update" />
                                </div> 
                                <div class="clear"></div>
                            </div>
                        </div>
                        </form>
                    </div>
                </div><!-- end of right content-->


                <div class="sidebar" id="sidebar">
                    <h2>Browse categories</h2>

                    <ul>
                        <li><a href="index_admin.jsp" class="selected">Home</a></li>
                        <li><a href="view_category.jsp">Category</a></li>
                        <li><a href="view_product.jsp">Product</a></li>
                        <li><a href="view_invoice.jsp">Invoice</a></li>
                        <li><a href="view_customer.jsp">Customer</a></li>
                    </ul>    
     

                </div>             


                <div class="clear"></div>
            </div> <!--end of center_content-->

            <div class="footer">
                Panelo - Free Admin Template by <a href="htpp://csstemplatesmarket.com" target="_blank">CSSTemplatesMarket</a>
            </div>

        </div>


    </body>
</html>