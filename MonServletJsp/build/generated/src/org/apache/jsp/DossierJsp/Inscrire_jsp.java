package org.apache.jsp.DossierJsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inscrire_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"./dossierCss/style.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <fieldset >\n");
      out.write("<legend>Gestion des cours</legend>\n");
      out.write("     < <form action=\"../monServlet\" method=\"post\">\n");
      out.write("        <div id=\"sp\">\n");
      out.write("            <label for=\"\">nom</label>\n");
      out.write("            <input type=\"text\" name=\"nom\" value=\"\" size=\"30\"/>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"sp\">\n");
      out.write("        <label for=\"\">prenom</label>\n");
      out.write("            <input type=\"text\" name=\"prenom\" value=\"\" size=\"30\"/>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"sp\">\n");
      out.write("            <label for=\"\">pseudo</label>\n");
      out.write("            <input type=\"text\" name=\"pseudo\" value=\"\" size=\"30\"/>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"sp\">\n");
      out.write("            <label for=\"\">email</label>\n");
      out.write("            <input type=\"text\" name=\"email\" value=\"\" size=\"30\"/>\n");
      out.write("        </div>\n");
      out.write("         <div id=\"sp\">\n");
      out.write("            <label for=\"\">mot2passe</label>\n");
      out.write("            <input type=\"password\" name=\"mot2passe\" value=\"\" size=\"30\"/>\n");
      out.write("        </div>\n");
      out.write("         <div id=\"sp\">\n");
      out.write("            <label for=\"\">mot2passe2</label>\n");
      out.write("            <input type=\"password\" name=\"mot2passe2\" value=\"\" size=\"30\"/>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"sp\">\n");
      out.write("            <label for=\"\">&nbsp;</label>\n");
      out.write("            <input type=\"submit\" name=\"valider\" value=\"Valider\" />\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    </fieldset>\n");
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
