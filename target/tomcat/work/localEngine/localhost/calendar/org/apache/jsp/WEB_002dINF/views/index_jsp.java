package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/header.jsp", out, false);
      out.write("\r\n");
      out.write("<p>Below you can find some highlights about myCalendar. Each sample will have a slightly different summary depending on what has been done.</p>\r\n");
      out.write("<h2>Chapter 3</h2>\r\n");
      out.write("<ul>\r\n");
      out.write("    <li>This chapter starts off with some additional functionality to get us ready to support custom authentication and logging in after signing up. At this point we have not implemented signup so it will not work</li>\r\n");
      out.write("    <li>We add the ability to use the current user when creating events and viewing my events. Login with admin1@example.com / admin1 and see that the proper events are now displayed. Create an event and see that the owner is assigned to the proper user.</li>\r\n");
      out.write("    <li>We have added the ability to signup for a new account. The user will be automatically loged in after creating the account. Go ahead and try to create a new account.</li>\r\n");
      out.write("    <li>There are no changes from a users perspective. However, we have created a custom UserDetailService which means we no longer need to maintain two different representations of a user.</li>\r\n");
      out.write("    <li>Our calendar UserDetailsService now creates a CalendarUserDetails which allows us to display custom user attributes in our application. Login and you will see that we are now displaying the first and last name of the user.</li>\r\n");
      out.write("    <li><a id=\"eventsLink\" href=\"events/\">All Events</a> - shows all events for all users, but only allows administrators to access the page.</li>\r\n");
      out.write("    <li><a id=\"myEventsLink\" href=\"events/my\">My Events</a> - shows all events that user1@example.com is the owner or attendee. We will discuss in Chapter 3 how to obtain the current user's events.</li>\r\n");
      out.write("    <li><a id=\"createEventLink\" href=\"events/form\">Create Event</a> - will allow creating a new Event with user1@example.com as the owner. We will discuss in Chapter 3 how to make the current user the owner.</li>\r\n");
      out.write("    <li><a id=\"logoutLink\" href=\"j_spring_security_logout\">Logout</a> - we haven't discussed it yet, but you can logout using j_spring_security_logout. Later in in this chapter we will discuss how to customize logout and provide a logout link.</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <a id=\"h2Link\" href=\"admin/h2/\">H2 Database Console</a> - Allows you to interact with the database using a web console. To use it:\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>Click the link above.</li>\r\n");
      out.write("            <li>Ensure that Generic H2 (Embedded) is selected</li>\r\n");
      out.write("            <li>Ensure that org.h2.Driver is the Driver Class</li>\r\n");
      out.write("            <li>Enter <strong>jdbc:h2:mem:dataSource</strong> as the JDBC URL</li>\r\n");
      out.write("            <li>Ensure that the username is sa</li>\r\n");
      out.write("            <li>Ensure the password is left empty</li>\r\n");
      out.write("            <li>Click Connect</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./includes/footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/index.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("pageTitle");
    // /WEB-INF/views/index.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index.jsp(6,0) 'Welcome to myCalendar!'",_el_expressionfactory.createValueExpression("Welcome to myCalendar!",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/index.jsp(6,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("request");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
