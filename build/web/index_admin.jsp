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
        %>
        <div id="panelwrap">

            <div class="header">
                
                <div class="title"><a href="#">Adminstrator</a></div>
                
                <% 
                    if(admin != null) {
                %>
                
                <div class="header_right">Welcome <%= admin.getUsername() %>, <a href="logout_admin.jsp" class="logout">Logout</a> </div>
                
                <%}%>
                
                <%
                    if(admin == null) {
                %>
                <div class="header_right"><a href="login_admin.jsp" >Login</a> </div>
                
                <%
                    }
                %>
                <div class="menu">
                    <ul>
                        <li><a href="#" class="selected">Home</a></li>
                        <li><a href="#">Admin settings</a></li>
                        <li><a href="#">Help</a></li>
                    </ul>
                </div>

            </div>

            <div class="center_content">  

                <div id="right_wrap">
                    <div id="right_content">             
                        <h2>Tables section</h2> 


                        <table id="rounded-corner">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Product</th>
                                    <th>Details</th>
                                    <th>Price</th>
                                    <th>Date</th>
                                    <th>Category</th>
                                    <th>User</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <tfoot>
                                <tr>
                                    <td colspan="12">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</td>
                                </tr>
                            </tfoot>
                            <tbody>
                                <tr class="odd">
                                    <td><input type="checkbox" name="" /></td>
                                    <td>Box Software</td>
                                    <td>Lorem ipsum dolor sit amet consectetur</td>
                                    <td>45$</td>
                                    <td>10/04/2011</td>
                                    <td>web design</td>
                                    <td>Alex</td>
                                    <td><a href="#"><img src="images/edit.png" alt="" title="" border="0" /></a></td>
                                    <td><a href="#"><img src="images/trash.gif" alt="" title="" border="0" /></a></td>
                                </tr>
                                <tr class="even">
                                    <td><input type="checkbox" name="" /></td>
                                    <td>Trial Software</td>
                                    <td>Lorem ipsum dolor sit amet consectetur</td>
                                    <td>155$</td>
                                    <td>12/04/2011</td>
                                    <td>web design</td>
                                    <td>Carrina</td>
                                    <td><a href="#"><img src="images/edit.png" alt="" title="" border="0" /></a></td>
                                    <td><a href="#"><img src="images/trash.gif" alt="" title="" border="0" /></a></td>
                                </tr>
                                <tr class="odd">
                                    <td><input type="checkbox" name="" /></td>
                                    <td>Hosting Pack</td>
                                    <td>Lorem ipsum dolor sit amet consectetur</td>
                                    <td>45$</td>
                                    <td>10/04/2011</td>
                                    <td>web design</td>
                                    <td>Alex</td>
                                    <td><a href="#"><img src="images/edit.png" alt="" title="" border="0" /></a></td>
                                    <td><a href="#"><img src="images/trash.gif" alt="" title="" border="0" /></a></td
                                </tr>
                                <tr class="even">
                                    <td><input type="checkbox" name="" /></td>
                                    <td>Duo Software</td>
                                    <td>Lorem ipsum dolor sit amet consectetur</td>
                                    <td>745$</td>
                                    <td>10/04/2011</td>
                                    <td>web design</td>
                                    <td>Alex</td>
                                    <td><a href="#"><img src="images/edit.png" alt="" title="" border="0" /></a></td>
                                    <td><a href="#"><img src="images/trash.gif" alt="" title="" border="0" /></a></td
                                </tr>
                                <tr class="odd">
                                    <td><input type="checkbox" name="" /></td>
                                    <td>Alavasti Software</td>
                                    <td>Lorem ipsum dolor sit amet consectetur</td>
                                    <td>45$</td>
                                    <td>10/04/2011</td>
                                    <td>web design</td>
                                    <td>John</td>
                                    <td><a href="#"><img src="images/edit.png" alt="" title="" border="0" /></a></td>
                                    <td><a href="#"><img src="images/trash.gif" alt="" title="" border="0" /></a></td
                                </tr>
                                <tr class="even">
                                    <td><input type="checkbox" name="" /></td>
                                    <td>Box Software</td>
                                    <td>Lorem ipsum dolor sit amet consectetur</td>
                                    <td>45$</td>
                                    <td>10/04/2011</td>
                                    <td>web design</td>
                                    <td>Doe</td>
                                    <td><a href="#"><img src="images/edit.png" alt="" title="" border="0" /></a></td>
                                    <td><a href="#"><img src="images/trash.gif" alt="" title="" border="0" /></a></td
                                </tr>


                            </tbody>
                        </table>

                        <div class="form_sub_buttons">
                            <a href="#" class="button green">Edit selected</a>
                            <a href="#" class="button red">Delete selected</a>
                        </div>

                        <ul id="tabsmenu" class="tabsmenu">
                            <li class="active"><a href="#tab1">Form Design Structure</a></li>
                        </ul>
                        <div id="tab1" class="tabcontent">
                            <h3>Tab one title</h3>
                            <div class="form">

                                <div class="form_row">
                                    <label>Name:</label>
                                    <input type="text" class="form_input" name="" />
                                </div>

                                <div class="form_row">
                                    <label>Email:</label>
                                    <input type="text" class="form_input" name="" />
                                </div>

                                <div class="form_row">
                                    <label>Subject:</label>
                                    <select class="form_select" name="">
                                        <option>Select one</option>
                                    </select>
                                </div>

                                <div class="form_row">
                                    <label>Message:</label>
                                    <textarea class="form_textarea" name=""></textarea>
                                </div>
                                <div class="form_row">
                                    <input type="submit" class="form_submit" value="Submit" />
                                </div> 
                                <div class="clear"></div>
                            </div>
                        </div>
                        <div id="tab2" class="tabcontent">
                            <h3>Tab two title</h3>
                            <ul class="lists">
                                <li>Consectetur adipisicing elit  error sit voluptatem accusantium doloremqu sed</li>
                                <li>Sed do eiusmod tempor incididunt</li>
                                <li>Ut enim ad minim veniam is iste natus error sit</li>
                                <li>Consectetur adipisicing elit sed</li>
                                <li>Sed do eiusmod tempor  error sit voluptatem accus antium dolor emqu incididunt</li>
                                <li>Ut enim ad minim veniam</li>
                                <li>Consectetur adipisi  error sit voluptatem accusantium doloremqu cing elit sed</li>
                                <li>Sed do eiusmod tempor in is iste natus error sit cididunt</li>
                                <li>Ut enim ad minim ve is iste natus error sitniam</li>
                            </ul>
                        </div>

                        <div id="tab3" class="tabcontent">
                            <h3>Tab three title</h3>
                            <p>
                                Lorem ipsum <a href="#">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. <br /><br />Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?
                            </p>
                        </div> 

                        <div id="tab4" class="tabcontent">
                            <h3>Tab four title</h3>
                            <p>
                                Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, ad <br /><br />Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?
                            </p>
                        </div> 




                        <div class="toogle_wrap">
                            <div class="trigger"><a href="#">Toggle with text</a></div>

                            <div class="toggle_container">
                                <p>
                                    Lorem ipsum <a href="#">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Lorem ipsum <a href="#">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                </p>
                            </div>
                        </div>

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