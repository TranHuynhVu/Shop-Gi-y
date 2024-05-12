package com.shopgiay.controller.web.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.IMAGES;
import com.shopgiay.model.SIZES;
import com.shopgiay.service.NewService;
import com.shopgiay.util.JsonUtil;
import com.shopgiay.util.SessionUtil;

/**
 * Servlet implementation class ProductdetailApi
 */
@WebServlet("/api-web-productdetail")
public class ProductdetailApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		

		
		ACCOUNTS acc = (ACCOUNTS) SessionUtil.getSessionUtil().getValue(request, "ACC");

		Map<String, Object> obMap = new HashMap<String, Object>();
		obMap.put("ACC", acc);
		
		JSONObject object = JsonUtil.of(request.getReader()).getObject();
		
		String action= object.getString("ACTION");
		if (action.equals("productdetail")) {
			System.out.println("productdetail");
			
			int id = object.getInt("ID");
			int idshoes = object.getInt("ID_SHOES");
			String name = object.getString("NAME");
			double price = object.getDouble("PRICE");
			
			DETAIL_SHOES df = new DETAIL_SHOES();
			df.setID(id);
			df.setID_SHOE(idshoes);
			df.setNAME(name);
			df.setPRICE(price);
			System.out.println(df);
			// màu
			ArrayList<COLORS> colorsarr = NewService.getNewService().getColorsByID(df.getID());
			// sizea
			ArrayList<SIZES> sizesarr = NewService.getNewService().getSizesByID(df.getID());
			
			ArrayList<IMAGES> imageArr = NewService.getNewService().getImagesByID(df.getID());

			obMap.put("colors", colorsarr);
			obMap.put("size", sizesarr);
			obMap.put("images", imageArr);
			obMap.put("detall_shoes", df);
		}
		mapper.writeValue(response.getOutputStream(), obMap);
	}

}
