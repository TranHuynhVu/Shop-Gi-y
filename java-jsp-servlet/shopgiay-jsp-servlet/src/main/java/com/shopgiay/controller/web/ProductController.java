package com.shopgiay.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.CATEGORIES;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.SHOES;
import com.shopgiay.service.NewService;
import com.shopgiay.util.SessionUtil;

@WebServlet(urlPatterns = { "/product" })
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ACCOUNTS acc= (ACCOUNTS) SessionUtil.getSessionUtil().getValue(request, "ACC");
	     if(acc != null) {
	    	 int indexIconCart= NewService.getNewService().getSoLuongCartByIdAcc(acc.getID());
	    	 request.setAttribute("indexIconCart", indexIconCart);
	     }else {
	    	 request.setAttribute("indexIconCart", 0);
		}
		String filtersort = request.getParameter("filtersort");
		String filterprice = request.getParameter("filterprice");

		if (filtersort != null && filterprice != null) {
			switch (filtersort) {
			case "Default":
				filtersort = "";
				request.setAttribute("filtersort", "Default");
				break;
			case "Averagerating":
				filtersort = "";
				request.setAttribute("filtersort", "Averagerating");
				break;
			case "PriceLowtoHigh":
				filtersort = "asc";
				request.setAttribute("filtersort", "PriceLowtoHigh");
				break;
			case "PriceHighToLow":
				request.setAttribute("filtersort", "PriceHighToLow");
				filtersort = "desc";
				break;
			}
			switch (filterprice) {
			case "all":
				filterprice = ">0";
				request.setAttribute("filterprice", "all");
				break;
			case "0_100":
				filterprice = "BETWEEN 0 AND 100";
				request.setAttribute("filterprice", "0_100");
				break;
			case "100_200":
				filterprice = "BETWEEN 100 AND 200";
				request.setAttribute("filterprice", "100_200");
				break;
			case "200_300":
				filterprice = "BETWEEN 200 AND 300";
				request.setAttribute("filterprice", "200_300");
				break;
			case "300_1000":
				filterprice = ">300";
				request.setAttribute("filterprice", "300_1000");
				break;
			}
			System.out.println(filtersort + "," + filterprice);
			String sql = "SELECT DISTINCT DS.ID_SHOE, DS.ID AS Ma_Detail, SH.NAMEE AS Ten_shoes, DS.PRICE AS Gia,\r\n"
					+ "(SELECT ID FROM IMAGES WHERE ID_DETAIL_SHOE = DS.ID LIMIT 1) AS images\r\n"
					+ "FROM DETAIL_SHOES DS\r\n" + "JOIN SHOES SH ON DS.ID_SHOE = SH.ID\r\n"
					+ "JOIN DETAIL_COLORS DC ON DS.ID = DC.ID_DETAIL_SHOE\r\n"
					+ "JOIN COLORS C ON DC.ID_COLOR = C.ID\r\n" + "WHERE DS.PRICE " + filterprice + "\r\n"
					+ "ORDER BY DS.PRICE " + filtersort + "";
			System.out.println(sql);
			ArrayList<DETAIL_SHOES> arrShoes = NewService.getNewService().getDFFilter(sql);
			ArrayList<SHOES> arrShoesCate = NewService.getNewService().getShoesSelectAll();
			ArrayList<CATEGORIES> arrCategories = NewService.getNewService().getCategoriesSelectAll();

			request.setAttribute("listShoesCate", arrShoesCate);
			request.setAttribute("listCategories", arrCategories);
			request.setAttribute("listShoes", arrShoes);
			request.setAttribute("activeMenu", "product");
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/product.jsp");
			rd.forward(request, response);
		} else {
			ArrayList<DETAIL_SHOES> arrShoes = NewService.getNewService().getShoes();
			ArrayList<SHOES> arrShoesCate = NewService.getNewService().getShoesSelectAll();
			ArrayList<CATEGORIES> arrCategories = NewService.getNewService().getCategoriesSelectAll();

			request.setAttribute("listShoesCate", arrShoesCate);
			request.setAttribute("listCategories", arrCategories);
			request.setAttribute("listShoes", arrShoes);
			request.setAttribute("activeMenu", "product");
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/product.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nameShoe = request.getParameter("search-product");
		System.out.println(nameShoe);
		if(nameShoe != null) {
			ArrayList<DETAIL_SHOES> arrShoes = NewService.getNewService().SelctByIdNameDF(nameShoe);
			ArrayList<SHOES> arrShoesCate = NewService.getNewService().getShoesSelectAll();
			ArrayList<CATEGORIES> arrCategories = NewService.getNewService().getCategoriesSelectAll();
			
			request.setAttribute("listShoesCate", arrShoesCate);
			request.setAttribute("listCategories", arrCategories);
			request.setAttribute("listShoes", arrShoes);
			request.setAttribute("activeMenu", "product");
			
			
			request.setAttribute("filtersort", "Default");
			request.setAttribute("filterprice", "all");
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/product.jsp");
			rd.forward(request, response);
		}
	}


}
