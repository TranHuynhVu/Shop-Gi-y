/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-05-09 15:16:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>About</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<section class=\"bg-img1 txt-center p-lr-15 p-tb-92\"\r\n");
      out.write("		style=\"background-image: url('");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("');\">\r\n");
      out.write("		<h2 class=\"ltext-105 cl0 txt-center\">About</h2>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Content page -->\r\n");
      out.write("	<section class=\"bg0 p-t-75 p-b-120\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row p-b-148\">\r\n");
      out.write("				<div class=\"col-md-7 col-lg-8\">\r\n");
      out.write("					<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n");
      out.write("						<h3 class=\"mtext-111 cl2 p-b-16\">Our Story</h3>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"stext-113 cl6 p-b-26\">Lorem ipsum dolor sit amet,\r\n");
      out.write("							consectetur adipiscing elit. Mauris consequat consequat enim, non\r\n");
      out.write("							auctor massa ultrices non. Morbi sed odio massa. Quisque at\r\n");
      out.write("							vehicula tellus, sed tincidunt augue. Orci varius natoque\r\n");
      out.write("							penatibus et magnis dis parturient montes, nascetur ridiculus\r\n");
      out.write("							mus. Maecenas varius egestas diam, eu sodales metus scelerisque\r\n");
      out.write("							congue. Pellentesque habitant morbi tristique senectus et netus\r\n");
      out.write("							et malesuada fames ac turpis egestas. Maecenas gravida justo eu\r\n");
      out.write("							arcu egestas convallis. Nullam eu erat bibendum, tempus ipsum\r\n");
      out.write("							eget, dictum enim. Donec non neque ut enim dapibus tincidunt\r\n");
      out.write("							vitae nec augue. Suspendisse potenti. Proin ut est diam. Donec\r\n");
      out.write("							condimentum euismod tortor, eget facilisis diam faucibus et.\r\n");
      out.write("							Morbi a tempor elit.</p>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"stext-113 cl6 p-b-26\">Donec gravida lorem elit, quis\r\n");
      out.write("							condimentum ex semper sit amet. Fusce eget ligula magna. Aliquam\r\n");
      out.write("							aliquam imperdiet sodales. Ut fringilla turpis in vehicula\r\n");
      out.write("							vehicula. Pellentesque congue ac orci ut gravida. Aliquam erat\r\n");
      out.write("							volutpat. Donec iaculis lectus a arcu facilisis, eu sodales\r\n");
      out.write("							lectus sagittis. Etiam pellentesque, magna vel dictum rutrum,\r\n");
      out.write("							neque justo eleifend elit, vel tincidunt erat arcu ut sem. Sed\r\n");
      out.write("							rutrum, turpis ut commodo efficitur, quam velit convallis ipsum,\r\n");
      out.write("							et maximus enim ligula ac ligula.</p>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"stext-113 cl6 p-b-26\">Any questions? Let us know in\r\n");
      out.write("							store at 8th floor, 379 Hudson St, New York, NY 10018 or call us\r\n");
      out.write("							on (+1) 96 716 6879</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n");
      out.write("					<div class=\"how-bor1 \">\r\n");
      out.write("						<div class=\"hov-img0\">\r\n");
      out.write("							<img src=\"images/about-01.jpg\" alt=\"IMG\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n");
      out.write("					<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n");
      out.write("						<h3 class=\"mtext-111 cl2 p-b-16\">Our Mission</h3>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"stext-113 cl6 p-b-26\">Mauris non lacinia magna. Sed\r\n");
      out.write("							nec lobortis dolor. Vestibulum rhoncus dignissim risus, sed\r\n");
      out.write("							consectetur erat. Pellentesque habitant morbi tristique senectus\r\n");
      out.write("							et netus et malesuada fames ac turpis egestas. Nullam maximus\r\n");
      out.write("							mauris sit amet odio convallis, in pharetra magna gravida.\r\n");
      out.write("							Praesent sed nunc fermentum mi molestie tempor. Morbi vitae\r\n");
      out.write("							viverra odio. Pellentesque ac velit egestas, luctus arcu non,\r\n");
      out.write("							laoreet mauris. Sed in ipsum tempor, consequat odio in, porttitor\r\n");
      out.write("							ante. Ut mauris ligula, volutpat in sodales in, porta non odio.\r\n");
      out.write("							Pellentesque tempor urna vitae mi vestibulum, nec venenatis nulla\r\n");
      out.write("							lobortis. Proin at gravida ante. Mauris auctor purus at lacus\r\n");
      out.write("							maximus euismod. Pellentesque vulputate massa ut nisl hendrerit,\r\n");
      out.write("							eget elementum libero iaculis.</p>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n");
      out.write("							<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just\r\n");
      out.write("								connecting things. When you ask creative people how they did\r\n");
      out.write("								something, they feel a little guilty because they didn't really\r\n");
      out.write("								do it, they just saw something. It seemed obvious to them after\r\n");
      out.write("								a while.</p>\r\n");
      out.write("\r\n");
      out.write("							<span class=\"stext-111 cl8\"> - Steve Job’s </span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n");
      out.write("					<div class=\"how-bor2\">\r\n");
      out.write("						<div class=\"hov-img0\">\r\n");
      out.write("							<img src=\"images/about-02.jpg\" alt=\"IMG\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
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
      // /views/web/about.jsp(12,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/template/web/images/images/bg-01.jpg");
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
}
