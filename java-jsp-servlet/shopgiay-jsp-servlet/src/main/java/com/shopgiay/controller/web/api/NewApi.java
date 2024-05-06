package com.shopgiay.controller.web.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import com.shopgiay.dao.imple.daoColos;
import com.shopgiay.dao.imple.daoShoes;
import com.shopgiay.dao.imple.daoSizes;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.SHOES;
import com.shopgiay.model.SIZES;
import com.shopgiay.model.UserModel;
import com.shopgiay.util.HttpUtil;
import com.shopgiay.util.JsonUtil;
import com.shopgiay.util.SessionUtil;

@WebServlet("/api-web-new")
public class NewApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		ACCOUNTS acc = (ACCOUNTS) SessionUtil.getSessionUtil().getValue(request, "ACC");
		System.out.println(acc);

		Map<String, Object> obMap = new HashMap<String, Object>();
		obMap.put("ACC", acc);

		if (acc == null) {
			mapper.writeValue(response.getOutputStream(), obMap);
		} else {
			JSONObject object = JsonUtil.of(request.getReader()).getObject();
			String action = object.getString("ACTION");
			if (action.equals("ClickGioHang")) {
				System.out.println("ClickGioHang");
			}
			if (action.equals("ClickQuickView")) {
				System.out.println("ClickQuickView");
				
				int id = object.getInt("ID");
				int idShoe = object.getInt("ID_SHOE");
				String name = object.getString("NAME");
				double price = object.getDouble("PRICE");
				
				DETAIL_SHOES df = new DETAIL_SHOES(null, null, name, id, idShoe, price, 0);
				// màu
				ArrayList<COLORS> colorsarr = daoColos.getDaoColos().selectByIDColor(df.getID());
				// sizea
				ArrayList<SIZES> sizesarr = daoSizes.getDaoSizes().SelectByID(df.getID());

				obMap.put("colors", colorsarr);
				obMap.put("size", sizesarr);
				obMap.put("nameShoe", df.getNAME());
				obMap.put("price", df.getPRICE());

			}
			mapper.writeValue(response.getOutputStream(), obMap);
		}

	}

}