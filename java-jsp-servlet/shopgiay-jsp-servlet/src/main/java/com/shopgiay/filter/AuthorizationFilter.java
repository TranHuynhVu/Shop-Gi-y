package com.shopgiay.filter;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.util.SessionUtil;

public class AuthorizationFilter implements Filter{
	private ServletContext context;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}

	@Override
	public void doFilter(ServletRequest Servletrequest, ServletResponse Servletresponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request =  (HttpServletRequest) Servletrequest;
		HttpServletResponse response = (HttpServletResponse) Servletresponse;
		String url = request.getRequestURI();
		if(url.startsWith("/shopbangiay-jsp-servlet/admin")) {
			ACCOUNTS accounts = (ACCOUNTS) SessionUtil.getSessionUtil().getValue(request,"ACC");
			System.out.println(accounts);
			if(accounts != null) {
				if(accounts.getPOSITION().equals("Admin")) {
					filterChain.doFilter(Servletrequest, Servletresponse);
				}else if (accounts.getPOSITION().equals("User")) {
					response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=not_permission&alert=danger");
				}
			}else {
				response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=not_login&alert=danger");
			}
		}else {
			filterChain.doFilter(Servletrequest, Servletresponse);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
