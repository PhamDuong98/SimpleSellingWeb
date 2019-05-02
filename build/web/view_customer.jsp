<%@page import="model.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DaoCustomer"%>
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
            DaoCustomer dao = new DaoCustomer();
            ArrayList<Customer> list = dao.getCustomerInfo();
        %>
        <div id="panelwrap">

            <div class="header">

                <div class="title"><a href="#">Adminstrator</a></div>

                <%
                    if (admin != null) {
                %>

                <div class="header_right">Welcome <%= admin.getUsername()%>, <a href="logout_admin.jsp" class="logout">Logout</a> </div>

                <%}%>

                <div class="menu">
                    <ul>
                        <li><a href="#" class="selected">Home</a></li>
                        <li><a href="#">Admin settings</a></li>
                        <li><a href="#">Help</a></li>
                    </ul>
                </div>

                <div class="center_content">  

                    <div id="right_wrap">
                        <div id="right_content">             
                            <h2>Tables section</h2> 

                            
                                <table id="rounded-corner">
                                    <thead>
                                        <tr>                                 
                                            <th>No</th>
                                            <th>Cid</th>
                                            <th>Cname</th>
                                            <th>Address</th>
                                            <th>Phone</th>
                                            <th>Username</th>                                   
                                            <th>Status</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>

                                    <!-- table footer -->
                                    <tfoot>
                                        <tr>

                                        </tr>
                                    </tfoot>
                                    <!-- end footer -->

                                    <%
                                        int i = 1;
                                        for (Customer c : list) {
                                    %>
                                    <tbody>
                                        <tr class="odd">
                                            <td> <%= i++%></td>
                                            <td><%= c.getCid()%></td>
                                            <td><%= c.getCname()%></td>
                                            <td><%= c.getAddress()%></td>
                                            <td><%= c.getPhone()%></td>
                                            <td><%= c.getUsername()%></td>
                                            <td><%= c.getStatus()%></td>
                                            <td><a href="ChangeStatusCustomer?username=<%= c.getUsername()%>&status=<%= c.getStatus() %>"><img src="images/trash.gif" alt="" title="" border="0" /></a></td>
                                        </tr>

                                    </tbody>
                                    <%}%>
                                </table>
                            
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