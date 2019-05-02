package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import java.util.Map;
import java.util.Map;
import model.Item;
import model.Cart;
import model.Cart;
import model.Customer;
import model.Customer;
import dao.DaoCategory;

public final class updateproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home :: w3layouts</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <!--theme-style-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("        <!--//theme-style-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!--fonts-->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//fonts-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 500,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\t\n");
      out.write("                    <div class=\"header-top-in\">\t\t\t\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <span>Duongpmse05785</span></br>\n");
      out.write("                            <span>SE1215</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header-in\">\n");
      out.write("                            <ul class=\"icon1 sub-icon1\">\n");
      out.write("                                ");

                                    if (customer != null) {
                                
      out.write("\n");
      out.write("                                <li><a href=\"#\"> Welcome: ");
      out.print(customer.getCname());
      out.write("</a></li>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                <li><a href=\"account.jsp\"> My account</a></li>\n");
      out.write("                                <li><a href=\"#\"> Shopping cart</a></li>\n");
      out.write("                                <li><a href=\"checkout.jsp\" >Checkout</a> </li>\t\n");
      out.write("                                <li><div class=\"cart\">\n");
      out.write("                                        <a href=\"#\" class=\"cart-in\"> </a>\n");
      out.write("                                        <span>(");
      out.print(cart.countProduct());
      out.write(")</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- cart -->\n");
      out.write("                                    <ul class=\"sub-icon1 list\">\n");
      out.write("                                        <!-- product count -->\n");
      out.write("                                        <h3>Recently added items</h3>\n");
      out.write("                                        ");
 for (Map.Entry<String, Item> list : cart.getCartItems().entrySet()) {
      out.write("\n");
      out.write("                                        <!-- product information -->\n");
      out.write("                                        <div class=\"shopping_cart\">\n");
      out.write("                                            <div class=\"cart_box\">\n");
      out.write("                                                <div class=\"message\">                                  \n");
      out.write("                                                    <div class=\"list_img\"><img src=\"images/14.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                                    <div class=\"list_desc\"><h4><a href=\"CartServlet?service=remove&sid=");
      out.print(list.getValue().getProduct().getSid());
      out.write('"');
      out.write('>');
      out.print(list.getValue().getProduct().getSname());
      out.write("</a></h4>");
      out.print(list.getValue().getQuantity());
      out.write(" x<span>\n");
      out.write("                                                            $");
      out.print(list.getValue().getProduct().getPrice());
      out.write("</span></div>\n");
      out.write("                                                    <div class=\"clearfix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <!-- total price -->\n");
      out.write("                                        <div class=\"total\">\n");
      out.write("                                            <div class=\"total_left\">CartSubtotal : </div>\n");
      out.write("                                            <div class=\"total_right\">$");
      out.print(cart.total());
      out.write("</div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"login_buttons\">\n");
      out.write("                                            <div class=\"check_button\"><a href=\"checkout.jsp\">Check out</a></div>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <!-- end cart -->\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-bottom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"h_menu4\">\n");
      out.write("                        <a class=\"toggleMenu\" href=\"#\">Menu</a>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li class=\"active\"><a href=\"index.jsp\"><i> </i>Home</a></li>\n");
      out.write("                            <li ><a href=\"#\" >Product brands</a>\n");
      out.write("                                <ul class=\"drop\"> \n");
      out.write("                                    ");

                                        for (Category c : daoCategory.getListCategory()) {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <li><a href=\"products.jsp?hid=");
      out.print(c.getHid());
      out.write('"');
      out.write('>');
      out.print(c.getHname());
      out.write("</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li> \t\t\t\t\t\t\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/nav.js\"></script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-bottom-in\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"header-bottom-on\">\n");
      out.write("                        <div class=\"header-can\">\n");
      out.write("                            <ul class=\"social-in\">\n");
      out.write("                                <li><a href=\"#\"><i> </i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"facebook\"> </i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"twitter\"> </i></a></li>\t\t\t\t\t\n");
      out.write("                                <li><a href=\"#\"><i class=\"skype\"> </i></a></li>\n");
      out.write("                            </ul>\t\n");
      out.write("                            <div class=\"search\">\n");
      out.write("                                <form>\n");
      out.write("                                    <input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                this.value = '';\n");
      out.write("                                            }\" >\n");
      out.write("                                    <input type=\"submit\" value=\"\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!---->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"account\">\n");
      out.write("                <h2 class=\"account-in\">Update</h2>\n");
      out.write("                <form action=\"#\" method=\"post\">\t\t\n");
      out.write("                    <capture>");
      out.print((request.getAttribute("mess") != null) ? "" : request.getAttribute("mess"));
      out.write("</capture>\n");
      out.write("                    <div> \t\n");
      out.write("                        <span class=\"mail\">Product name</span>\n");
      out.write("                        <input type=\"text\" name=\"sname\"> \n");
      out.write("                    </div>\n");
      out.write("                    <div> \n");
      out.write("                        <span class=\"word\">Quantity</span>\n");
      out.write("                        <input type=\"text\" name=\"quantity\">\n");
      out.write("                    </div>\n");
      out.write("                    <div> \n");
      out.write("                        <span class=\"name\">Picture</span>\n");
      out.write("                        <input type=\"text\" name=\"picture\">\n");
      out.write("                    </div>\n");
      out.write("                    <div> \n");
      out.write("                        <span class=\"address\">Description</span>\n");
      out.write("                        <input type=\"text\" name=\"description\">\n");
      out.write("                    </div>\n");
      out.write("                    <div> \n");
      out.write("                        <span class=\"phone\">Status</span>\n");
      out.write("                        <input type=\"text\" name=\"status\">\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"Update\"> \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-md-4 footer-in\">\n");
      out.write("                        <h4><i> </i>Suspendisse sed</h4>\n");
      out.write("                        <p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 footer-in\">\n");
      out.write("                        <h4><i class=\"cross\"> </i>Suspendisse sed</h4>\n");
      out.write("                        <p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 footer-in\">\n");
      out.write("                        <h4><i class=\"down\"> </i>Suspendisse sed</h4>\n");
      out.write("                        <p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!---->\n");
      out.write("            <div class=\"footer-middle\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>About us</h6>\n");
      out.write("                        <p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Information</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                            <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Customer Service</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Returns</a></li>\n");
      out.write("                            <li><a href=\"#\">Site Map</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>My Account</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"account.jsp\">My Account</a></li>\n");
      out.write("                            <li><a href=\"#\">Order History</a></li>\n");
      out.write("                            <li><a href=\"wishlist.jsp\">Wish List</a></li>\n");
      out.write("                            <li><a href=\"#\">Newsletter</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Extras</h6>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Brands</a></li>\n");
      out.write("                            <li><a href=\"#\">Gift Vouchers</a></li>\n");
      out.write("                            <li><a href=\"#\">Affiliates</a></li>\n");
      out.write("                            <li><a href=\"#\">Specials</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"footer-class\">Copyright © 2015 Modern Template by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    /*\n");
      out.write("                     var defaults = {\n");
      out.write("                     containerID: 'toTop', // fading element id\n");
      out.write("                     containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                     scrollSpeed: 1200,\n");
      out.write("                     easingType: 'linear' \n");
      out.write("                     };\n");
      out.write("                     */\n");
      out.write("\n");
      out.write("                    $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
