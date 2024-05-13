package com.shopgiay.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.service.NewService;
import com.shopgiay.util.SessionUtil;

/**
 * Servlet implementation class AboutController
 */
@WebServlet(urlPatterns = { "/about" })
public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("activeMenu", "about");
		ACCOUNTS acc = (ACCOUNTS) SessionUtil.getSessionUtil().getValue(request, "ACC");
		if (acc != null) {
			int indexIconCart = NewService.getNewService().getSoLuongCartByIdAcc(acc.getID());
			request.setAttribute("indexIconCart", indexIconCart);
		} else {
			request.setAttribute("indexIconCart", 0);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/about.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
