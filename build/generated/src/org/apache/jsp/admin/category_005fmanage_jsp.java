package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Category;
import model.Category;
import dao.DaoCategory;

public final class category_005fmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Template</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta http-equiv=\"Copyright\" content=\"arirusmanto.com\">\n");
      out.write("        <meta name=\"description\" content=\"Admin MOS Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Admin Page\">\n");
      out.write("        <meta name=\"author\" content=\"Ari Rusmanto\">\n");
      out.write("        <meta name=\"language\" content=\"Bahasa Indonesia\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"stylesheet/img/devil-icon.png\"> <!--Pemanggilan gambar favicon-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mos-css/mos-style.css\"> <!--pemanggilan file css-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            DaoCategory dao = new DaoCategory();
            ArrayList<Category> list = dao.getListCategory();
        
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"inHeader\">\n");
      out.write("                <div class=\"mosAdmin\">\n");
      out.write("                    Hallo, Mas Administrator<br>\n");
      out.write("                    <a href=\"\">Lihat website</a> | <a href=\"\">Help</a> | <a href=\"login.jsp\">Keluar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"leftBar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"category_manage.jsp\">Category</a></li>\n");
      out.write("                    <li><a href=\"product_manage.jsp\">Product</a></li>\n");
      out.write("                    <li><a href=\"#\">Invoice</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"rightContent\">\n");
      out.write("                <h3>Category</h3>\n");
      out.write("            \n");
      out.write("                <span><a href=\"insert_category.jsp\">Insert category</a></span>\n");
      out.write("                \n");
      out.write("                <table class=\"data\">\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <th class=\"data\" width=\"30px\">No</th>\n");
      out.write("                        <th class=\"data\">Hid</th>\n");
      out.write("                        <th class=\"data\">Category name</th>\n");
      out.write("                        <th class=\"data\">Website</th>\n");
      out.write("                        <th class=\"data\">Status</th>\n");
      out.write("                        <th class=\"data\" width=\"100px\">Option</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <!-- ----- -->\n");
      out.write("                    ");

                        int i = 1;
                        for(Category c: list) {
                    
      out.write("\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">");
      out.print(i++);
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(c.getHid());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(c.getHname());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(c.getWebsite());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(c.getStatus());
      out.write("</td>\n");
      out.write("                        <td class=\"data\" width=\"100px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"update_category.jsp\">Update</a>&nbsp;&nbsp; | &nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\">Delete</a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                &copy; 2012 MOS css template | <a href=\"#\">Nama Website Anda</a> | design <a href=\"http://arirusmanto.com\" target=\"_blank\">arirusmanto.com</a><br>\n");
      out.write("                redesign <a href=\"#\">Tulis nama anda disini</a> | Silahkan baca <a href=\"lisensi.txt\" target=\"_blank\">Lisensi</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
