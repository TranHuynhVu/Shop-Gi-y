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
import com.shopgiay.model.CARTS;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.CommentsReviews;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.IMAGES;
import com.shopgiay.model.SHOES;
import com.shopgiay.model.SIZES;
import com.shopgiay.model.UserModel;
import com.shopgiay.service.NewService;
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
		
		JSONObject object = JsonUtil.of(request.getReader()).getObject();
		String action = object.getString("ACTION");
		
		if (action.equals("ClickQuickView")) {
			System.out.println("ClickQuickView");
			int id = object.getInt("ID");
			int idshoes = object.getInt("ID_SHOES");
			String name = object.getString("NAME");
			double price = object.getDouble("PRICE");
			
			DETAIL_SHOES df = new DETAIL_SHOES();
			df.setID(id);
			df.setID_SHOE(idshoes);
			df.setNAME(name);
			df.setPRICE(price);
			// màu
			ArrayList<COLORS> colorsarr = NewService.getNewService().getColorsByID(df.getID());
			// sizea
			ArrayList<SIZES> sizesarr = NewService.getNewService().getSizesByID(df.getID());
			
			ArrayList<IMAGES> imageArr = NewService.getNewService().getImagesByID(df.getID());
			
			for (IMAGES images : imageArr) {
				System.out.println(images.toString());
			}
			obMap.put("colors", colorsarr);
			obMap.put("size", sizesarr);
			obMap.put("images", imageArr);
			obMap.put("detall_shoes", df);		
		}
		
		if (acc == null) {
			mapper.writeValue(response.getOutputStream(), obMap);
		} else {
			
			if (action.equals("ClickGioHang")) {
				System.out.println("ClickGioHang");
			}
			if(action.equals("ClickTym")) {
				System.out.println("ClickTym");
				
//				int id = object.getInt("ID");
//				int idShoe = object.getInt("ID_SHOE");
//				String name = object.getString("NAME");
//				double price = object.getDouble("PRICE");
//				
//				DETAIL_SHOES df = new DETAIL_SHOES(null, null, name, id, idShoe, price, 0);
//				obMap.put("shoe", df);
			}
			
			if(action.equals("AddCart")) {
				String ID = object.getString("ID");
				String COLOR = object.getString("COLOR");
				String QUANTITY = object.getString("QUANTITY");
				String SIZES = object.getString("SIZES");
				
				CARTS carts = new CARTS();
				carts.setDETAILSHOEID(Integer.parseInt(ID));
				carts.setACCOUNTID(acc.getID());
				carts.setQUANTITY(Integer.parseInt(QUANTITY));
				carts.setCOLORCARTS(COLOR);
				carts.setSIZECARTS(SIZES);
				
				System.out.println(carts);
				NewService.getNewService().InsertCart(carts);	
			}
			if(action.equals("COMMENT")) {
				int IDACC = object.getInt("IDACC");
				int IDDF = object.getInt("IDDF");
				String COMMENT = object.getString("COMMENT");
				int RATE = object.getInt("RATE");
				
				CommentsReviews commentsReviews = new CommentsReviews();
				commentsReviews.setIDACC(IDACC);
				commentsReviews.setIDDFSHOE(IDDF);
				commentsReviews.setDETAILCR(COMMENT);
				commentsReviews.setRATE(RATE);

				
				System.out.println(commentsReviews);
				NewService.getNewService().InsertComment(commentsReviews);
	
			}
			
			mapper.writeValue(response.getOutputStream(), obMap);
		}

	}

}
