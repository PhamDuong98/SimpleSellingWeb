package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Product;
import dao.DaoProduct;
import model.Admin;

public final class view_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
            
            DaoProduct dao = new DaoProduct();
            ArrayList<Product> list = dao.getListProduct();
        
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
      out.write("                <div class=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\" class=\"selected\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Admin settings</a></li>\n");
      out.write("                        <li><a href=\"#\">Help</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
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
      out.write("                                <tr>                                    \n");
      out.write("                                    <th>No</th>\n");
      out.write("                                    <th>Sid</th>\n");
      out.write("                                    <th>Sname</th>\n");
      out.write("                                    <th>Quantity</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Image</th>\n");
      out.write("                                    <th>Description</th>\n");
      out.write("                                    <th>Status</th>\n");
      out.write("                                    <th>Hid</th>\n");
      out.write("                                    <th>Edit</th>\n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            \n");
      out.write("                            <!-- table footer -->\n");
      out.write("                            <tfoot>\n");
      out.write("                                <tr>\n");
      out.write("                                    \n");
      out.write("                                </tr>\n");
      out.write("                            </tfoot>\n");
      out.write("                            <!-- end footer -->\n");
      out.write("                            \n");
      out.write("                            ");

                                int i=1;
                                for(Product p: list) {
                            
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td> ");
      out.print( i++ );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getSid() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getSname() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getQuantity() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getPrice() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getPicture() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getDescription() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getStatus() );
      out.write("</td>\n");
      out.write("                                    <td> ");
      out.print( p.getHid() );
      out.write("</td>\n");
      out.write("                                    <td><a href=\"update_product.jsp?sid=");
      out.print( p.getSid() );
      out.write("\"><img src=\"images/edit.png\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                    <td><a href=\"#\"><img src=\"images/trash.gif\" alt=\"\" title=\"\" border=\"0\" /></a></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <div class=\"form_sub_buttons\">\n");
      out.write("                            <a href=\"insert_product.jsp\" class=\"button green\">Insert product</a>                      \n");
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
      out.write("\n");
      out.write("                </div>         \n");
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
