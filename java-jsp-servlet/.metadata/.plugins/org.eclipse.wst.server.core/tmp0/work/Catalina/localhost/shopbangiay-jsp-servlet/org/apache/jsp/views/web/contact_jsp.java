/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-05-09 16:50:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/F:/Project-Java/java-jsp-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopgiay-jsp-servlet/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1711373671945L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1710145615094L));
    _jspx_dependants.put("jar:file:/F:/Project-Java/java-jsp-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopgiay-jsp-servlet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1710851876702L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Contact</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Title page -->\r\n");
      out.write("	<section class=\"bg-img1 txt-center p-lr-15 p-tb-92\"\r\n");
      out.write("		style=\"background-image: url(");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write(")\">\r\n");
      out.write("		<h2 class=\"ltext-105 cl0 txt-center\">Contact</h2>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Content page -->\r\n");
      out.write("	<section class=\"bg0 p-t-104 p-b-116\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"flex-w flex-tr\">\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"size-210 bor10 p-lr-70 p-t-55 p-b-70 p-lr-15-lg w-full-md\">\r\n");
      out.write("					<form>\r\n");
      out.write("						<h4 class=\"mtext-105 cl2 txt-center p-b-30\">Send Us A Message\r\n");
      out.write("						</h4>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"bor8 m-b-20 how-pos4-parent\">\r\n");
      out.write("							<input class=\"stext-111 cl2 plh3 size-116 p-l-62 p-r-30\"\r\n");
      out.write("								type=\"text\" name=\"email\" placeholder=\"Your Email Address\">\r\n");
      out.write("							<img class=\"how-pos4 pointer-none\"\r\n");
      out.write("								src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"ICON\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"bor8 m-b-30\">\r\n");
      out.write("							<textarea class=\"stext-111 cl2 plh3 size-120 p-lr-28 p-tb-25\"\r\n");
      out.write("								name=\"msg\" placeholder=\"How Can We Help?\"></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<button\r\n");
      out.write("							class=\"flex-c-m stext-101 cl0 size-121 bg3 bor1 hov-btn3 p-lr-15 trans-04 pointer\">\r\n");
      out.write("							Submit</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"size-210 bor10 flex-w flex-col-m p-lr-93 p-tb-30 p-lr-15-lg w-full-md\">\r\n");
      out.write("					<div class=\"flex-w w-full p-b-42\">\r\n");
      out.write("						<span class=\"fs-18 cl5 txt-center size-211\"> <span\r\n");
      out.write("							class=\"lnr lnr-map-marker\"></span>\r\n");
      out.write("						</span>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"size-212 p-t-2\">\r\n");
      out.write("							<span class=\"mtext-110 cl2\"> Address </span>\r\n");
      out.write("\r\n");
      out.write("							<p class=\"stext-115 cl6 size-213 p-t-18\">Coza Store Center\r\n");
      out.write("								8th floor, 379 Hudson St, New York, NY 10018 US</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"flex-w w-full p-b-42\">\r\n");
      out.write("						<span class=\"fs-18 cl5 txt-center size-211\"> <span\r\n");
      out.write("							class=\"lnr lnr-phone-handset\"></span>\r\n");
      out.write("						</span>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"size-212 p-t-2\">\r\n");
      out.write("							<span class=\"mtext-110 cl2\"> Lets Talk </span>\r\n");
      out.write("\r\n");
      out.write("							<p class=\"stext-115 cl1 size-213 p-t-18\">+1 800 1236879</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"flex-w w-full\">\r\n");
      out.write("						<span class=\"fs-18 cl5 txt-center size-211\"> <span\r\n");
      out.write("							class=\"lnr lnr-envelope\"></span>\r\n");
      out.write("						</span>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"size-212 p-t-2\">\r\n");
      out.write("							<span class=\"mtext-110 cl2\"> Sale Support </span>\r\n");
      out.write("\r\n");
      out.write("							<p class=\"stext-115 cl1 size-213 p-t-18\">contact@example.com\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Map -->\r\n");
      out.write("	<div class=\"map\">\r\n");
      out.write("		<div class=\"size-303\" id=\"google_map\" data-map-x=\"40.691446\"\r\n");
      out.write("			data-map-y=\"-73.886787\" data-pin=\"images/icons/pin.png\"\r\n");
      out.write("			data-scrollwhell=\"0\" data-draggable=\"1\" data-zoom=\"11\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /views/web/contact.jsp(13,31) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/template/web/images/bg-01.jpg");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /views/web/contact.jsp(32,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/template/web/images/icons/icon-email.png");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
