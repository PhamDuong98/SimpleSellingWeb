package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Admin;

public final class index_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Panelo - Free Admin Template</title>\n");
      out.write("        <link href=\"style1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>\n");
      out.write("            <!-- jQuery file -->\n");
      out.write("            <script src=\"js/jquery.min1.js\"></script>\n");
      out.write("            <script src=\"js/jquery.tabify.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("            \n");
      out.write("            <script src=\"js/jquery.tabify.js\" type=\"text/javascript\"></script>\n");
      out.write("            \n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                var $ = jQuery.noConflict();\n");
      out.write("                $(function () {\n");
      out.write("                    $('#tabsmenu').tabify();\n");
      out.write("                    $(\".toggle_container\").hide();\n");
      out.write("                    $(\".trigger\").click(function () {\n");
      out.write("                        $(this).toggleClass(\"active\").next().slideToggle(\"slow\");\n");
      out.write("                        return false;\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Admin admin = null;
            if (session.getAttribute("admin") != null) {
                admin = (Admin) session.getAttribute("admin");
            }
        
      out.write("\n");
      out.write("        <div id=\"panelwrap\">\n");
      out.write("\n");
      out.write("            <div class=\"header\">\n");
      out.write("                \n");
      out.write("                <div class=\"title\"><a href=\"#\">Adminstrator</a></div>\n");
      out.write("                \n");
      out.write("                ");
 
                    if(admin != null) {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"header_right\">Welcome ");
      out.print( admin.getUsername() );
      out.write(", <a href=\"logout_admin.jsp\" class=\"logout\">Logout</a> </div>\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                    if(admin == null) {
                
      out.write("\n");
      out.write("                <div class=\"header_right\"><a href=\"login_admin.jsp\" >Login</a> </div>\n");
      out.write("                \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\" class=\"selected\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Admin settings</a></li>\n");
      out.write("                        <li><a href=\"#\">Help</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"center_content\">  \n");
      out.write("\n");
      out.write("                <div id=\"right_wrap\">\n");
      out.write("                    <div id=\"right_content\">             \n");
      out.write("                        <h2>Tables section</h2> \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <table id=\"rounded-corner\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th>Product</th>\n");
      out.write("                                    <th>Details</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Date</th>\n");
      out.write("                                    <th>Category</th>\n");
      out.write("                                    <th>User</th>\n");
      out.write("                                    <th>Edit</th>\n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tfoot>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"12\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tfoot>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"\" /></td>\n");
      out.write("                                    <td>Box Software</td>\n");
      out.write("                                    <td>Lorem ipsum dolor sit amet consectetur</td>\n");
      out.write("                                    <td>45$</td>\n");
      out.write("                                    <td>10/04/2011</td>\n");
      out.write("                                    <td>web design</td>\n");
      out.write("                                    <td>Alex</td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"even\">\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"\" /></td>\n");
      out.write("                                    <td>Trial Software</td>\n");
      out.write("                                    <td>Lorem ipsum dolor sit amet consectetur</td>\n");
      out.write("                                    <td>155$</td>\n");
      out.write("                                    <td>12/04/2011</td>\n");
      out.write("                                    <td>web design</td>\n");
      out.write("                                    <td>Carrina</td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"\" /></td>\n");
      out.write("                                    <td>Hosting Pack</td>\n");
      out.write("                                    <td>Lorem ipsum dolor sit amet consectetur</td>\n");
      out.write("                                    <td>45$</td>\n");
      out.write("                                    <td>10/04/2011</td>\n");
      out.write("                                    <td>web design</td>\n");
      out.write("                                    <td>Alex</td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"even\">\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"\" /></td>\n");
      out.write("                                    <td>Duo Software</td>\n");
      out.write("                                    <td>Lorem ipsum dolor sit amet consectetur</td>\n");
      out.write("                                    <td>745$</td>\n");
      out.write("                                    <td>10/04/2011</td>\n");
      out.write("                                    <td>web design</td>\n");
      out.write("                                    <td>Alex</td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"\" /></td>\n");
      out.write("                                    <td>Alavasti Software</td>\n");
      out.write("                                    <td>Lorem ipsum dolor sit amet consectetur</td>\n");
      out.write("                                    <td>45$</td>\n");
      out.write("                                    <td>10/04/2011</td>\n");
      out.write("                                    <td>web design</td>\n");
      out.write("                                    <td>John</td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"even\">\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"\" /></td>\n");
      out.write("                                    <td>Box Software</td>\n");
      out.write("                                    <td>Lorem ipsum dolor sit amet consectetur</td>\n");
      out.write("                                    <td>45$</td>\n");
      out.write("                                    <td>10/04/2011</td>\n");
      out.write("                                    <td>web design</td>\n");
      out.write("                                    <td>Doe</td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <div class=\"form_sub_buttons\">\n");
      out.write("                            <a href=\"#\" class=\"button green\">Edit selected</a>\n");
      out.write("                            <a href=\"#\" class=\"button red\">Delete selected</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <ul id=\"tabsmenu\" class=\"tabsmenu\">\n");
      out.write("                            <li class=\"active\"><a href=\"#tab1\">Form Design Structure</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div id=\"tab1\" class=\"tabcontent\">\n");
      out.write("                            <h3>Tab one title</h3>\n");
      out.write("                            <div class=\"form\">\n");
      out.write("\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <label>Name:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form_input\" name=\"\" />\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <label>Email:</label>\n");
      out.write("                                    <input type=\"text\" class=\"form_input\" name=\"\" />\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <label>Subject:</label>\n");
      out.write("                                    <select class=\"form_select\" name=\"\">\n");
      out.write("                                        <option>Select one</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <label>Message:</label>\n");
      out.write("                                    <textarea class=\"form_textarea\" name=\"\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form_row\">\n");
      out.write("                                    <input type=\"submit\" class=\"form_submit\" value=\"Submit\" />\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"tab2\" class=\"tabcontent\">\n");
      out.write("                            <h3>Tab two title</h3>\n");
      out.write("                            <ul class=\"lists\">\n");
      out.write("                                <li>Consectetur adipisicing elit  error sit voluptatem accusantium doloremqu sed</li>\n");
      out.write("                                <li>Sed do eiusmod tempor incididunt</li>\n");
      out.write("                                <li>Ut enim ad minim veniam is iste natus error sit</li>\n");
      out.write("                                <li>Consectetur adipisicing elit sed</li>\n");
      out.write("                                <li>Sed do eiusmod tempor  error sit voluptatem accus antium dolor emqu incididunt</li>\n");
      out.write("                                <li>Ut enim ad minim veniam</li>\n");
      out.write("                                <li>Consectetur adipisi  error sit voluptatem accusantium doloremqu cing elit sed</li>\n");
      out.write("                                <li>Sed do eiusmod tempor in is iste natus error sit cididunt</li>\n");
      out.write("                                <li>Ut enim ad minim ve is iste natus error sitniam</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"tab3\" class=\"tabcontent\">\n");
      out.write("                            <h3>Tab three title</h3>\n");
      out.write("                            <p>\n");
      out.write("                                Lorem ipsum <a href=\"#\">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. <br /><br />Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\n");
      out.write("                            </p>\n");
      out.write("                        </div> \n");
      out.write("\n");
      out.write("                        <div id=\"tab4\" class=\"tabcontent\">\n");
      out.write("                            <h3>Tab four title</h3>\n");
      out.write("                            <p>\n");
      out.write("                                Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, ad <br /><br />Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\n");
      out.write("                            </p>\n");
      out.write("                        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"toogle_wrap\">\n");
      out.write("                            <div class=\"trigger\"><a href=\"#\">Toggle with text</a></div>\n");
      out.write("\n");
      out.write("                            <div class=\"toggle_container\">\n");
      out.write("                                <p>\n");
      out.write("                                    Lorem ipsum <a href=\"#\">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Lorem ipsum <a href=\"#\">dolor sit amet</a>, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- end of right content-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"sidebar\" id=\"sidebar\">\n");
      out.write("                    <h2>Browse categories</h2>\n");
      out.write("\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index_admin.jsp\" class=\"selected\">Home</a></li>\n");
      out.write("                        <li><a href=\"view_category.jsp\">Category</a></li>\n");
      out.write("                        <li><a href=\"view_product.jsp\">Product</a></li>\n");
      out.write("                        <li><a href=\"view_invoice.jsp\">Invoice</a></li>\n");
      out.write("                        <li><a href=\"view_customer.jsp\">Customer</a></li>\n");
      out.write("                    </ul>    \n");
      out.write(" \n");
      out.write("\n");
      out.write("                </div>             \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div> <!--end of center_content-->\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                Panelo - Free Admin Template by <a href=\"htpp://csstemplatesmarket.com\" target=\"_blank\">CSSTemplatesMarket</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
