package com.shopgiay.controller.web.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopgiay.model.CATEGORIES;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.SHOES;
import com.shopgiay.service.NewService;
import com.shopgiay.util.JsonUtil;

/**
 * Servlet implementation class ProductApi
 */
@WebServlet("/api-web-product")
public class ProductApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		Map<String, Object> obMap = new HashMap<String, Object>();
		JSONObject object = JsonUtil.of(request.getReader()).getObject();
		String sort = object.getString("filter0");
		String price = object.getString("filter1");
		if (sort != null) {
			switch (sort) {
			case "Default":
				sort = "";
				break;
			case "Average rating":
				sort = "";
				break;
			case "Price: Low to High":
				sort = "asc";
				break;
			case "Price: High to Low":
				sort = "desc";
				break;
			}
		}
		if (price != null) {
			switch (price) {
			case "All":
				price = ">0";
				break;
			case "$0 - $100":
				price = "BETWEEN 0 AND 100";
				break;
			case "$100 - $200":
				price = "BETWEEN 100 AND 200";
				break;
			case "$200 - $300":
				price = "BETWEEN 200 AND 300";
				break;
			case "$300+":
				price = ">300";
				break;
			}
		}

		System.out.println(sort + "," + price);
		String sql = "SELECT DISTINCT  DS.ID_SHOE, DS.ID AS Ma_Detail, SH.NAMEE AS Ten_shoes, DS.PRICE AS Gia,\r\n"
				+ "    (SELECT ID FROM IMAGES WHERE ID_DETAIL_SHOE = DS.ID LIMIT 1) AS images\r\n"
				+ "FROM DETAIL_SHOES DS\r\n" + "JOIN SHOES SH ON DS.ID_SHOE = SH.ID\r\n"
				+ "JOIN DETAIL_COLORS DC ON DS.ID = DC.ID_DETAIL_SHOE\r\n" + "JOIN COLORS C ON DC.ID_COLOR = C.ID\r\n"
				+ "WHERE DS.PRICE " + price + "\r\n" + "ORDER BY DS.PRICE " + sort + "";
		
		ArrayList<DETAIL_SHOES> arrShoes = NewService.getNewService().getDFFilter(sql);
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
