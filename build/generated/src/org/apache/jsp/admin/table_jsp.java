package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class table_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <li><a href=\"index.jsp\">Dashboard</a></li>\n");
      out.write("                    <li><a href=\"tabel.jsp\">Tabel</a></li>\n");
      out.write("                    <li><a href=\"form.jsp\">Form</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"rightContent\">\n");
      out.write("                <h3>Tabel</h3>\n");
      out.write("\n");
      out.write("                <div class=\"informasi\">\n");
      out.write("                    ini adalah notifikasi pertanda informasi\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"gagal\">\n");
      out.write("                    ini adalah notifikasi pertanda gagal\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"sukses\">\n");
      out.write("                    ini adalah notifikasi pertanda sukses\n");
      out.write("                </div>\n");
      out.write("                <table class=\"data\">\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <th class=\"data\" width=\"30px\">No</th>\n");
      out.write("                        <th class=\"data\">Nama</th>\n");
      out.write("                        <th class=\"data\">Email</th>\n");
      out.write("                        <th class=\"data\">Telepon</th>\n");
      out.write("                        <th class=\"data\" width=\"75px\">Pilihan</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">1</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">2</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">3</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">4</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">5</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">6</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">7</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">8</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">9</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">10</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">11</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">12</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">13</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">14</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">15</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">16</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\">Data Anda</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
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
