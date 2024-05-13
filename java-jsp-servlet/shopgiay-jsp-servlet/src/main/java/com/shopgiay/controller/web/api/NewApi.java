package com.shopgiay.controller.web.api;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.shopgiay.dao.imple.DETAIL_BILLS;
import com.shopgiay.dao.imple.daoBills;
import com.shopgiay.dao.imple.daoCarts;
import com.shopgiay.dao.imple.daoColos;
import com.shopgiay.dao.imple.daoDetailBills;
import com.shopgiay.dao.imple.daoDetail_Shoes;
import com.shopgiay.dao.imple.daoShoes;
import com.shopgiay.dao.imple.daoSizes;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.BILLS;
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
				ArrayList<CARTS> cartsArr= NewService.getNewService().selectAllByIDCarts(acc.getID());
				String html ="";
				double price = 0;
				for (CARTS carts : cartsArr) {
					System.out.println(carts);
					html += "<li class=\"header-cart-item flex-w flex-t m-b-12\">\n" +
						    "    <div class=\"header-cart-item-img\">\n" +
						    "        <img src=\"/shopbangiay-jsp-servlet/" + carts.getImage_url() + " \" alt=\"IMG\">\n" +
						    "    </div>\n" +
						    "\n" +
						    "    <div class=\"header-cart-item-txt p-t-8\">\n" +
						    "        <a href=\"/shopbangiay-jsp-servlet/product-detail?ID=" + carts.getDETAILSHOEID() + "\" class=\"header-cart-item-name m-b-18 hov-cl1 trans-04\">" + carts.getShoe_name() + "</a>\n" +
						    "        <span class=\"header-cart-item-info\">" + carts.getQUANTITY() + " x $" + carts.getPrice() + "</span>\n" +
						    "    </div>\n" +
						    "</li>";
					
					price += carts.getPrice() * carts.getQUANTITY();
				}
	
				obMap.put("html", html);
				obMap.put("price", price);

			}
			if(action.equals("ClickTym")) {
				System.out.println("ClickTym");
			
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
				
				if(COMMENT.isEmpty() || RATE == 0) {
					obMap.put("commentrate", "commentrate");
				}else {
					CommentsReviews commentsReviews = new CommentsReviews();
					commentsReviews.setIDACC(IDACC);
					commentsReviews.setIDDFSHOE(IDDF);
					commentsReviews.setDETAILCR(COMMENT);
					commentsReviews.setRATE(RATE);

					System.out.println(commentsReviews);
					NewService.getNewService().InsertComment(commentsReviews);
				}
				
			}
			if(action.equals("DELETECART")) {
				System.out.println("Delete Cart");
				int IDCART = object.getInt("IDCART");
				NewService.getNewService().DeleteCart(IDCART);
				
				ArrayList<CARTS> cartsArr= NewService.getNewService().selectAllByIDCarts(acc.getID());
				
				String html ="";
				double tongtien = 0;
				for (CARTS cart : cartsArr) {
					tongtien += cart.getPrice() * cart.getQUANTITY();
					html+="<tr class=\"table_row\">\r\n"
							+ "										<td class=\"column-1\">\r\n"
							+ "											<div class=\"how-itemcart1\">\r\n"
							+ "												<img src=\""+cart.getImage_url()+"\" alt=\"IMG\">\r\n"
							+ "											</div>\r\n"
							+ "										</td>\r\n"
							+ "										<td class=\"column-2\">"+cart.getShoe_name()+"</td>\r\n"
							+ "										<td class=\"column-3\">$"+cart.getPrice()+"</td>\r\n"
							+ "										<td class=\"column-4\">\r\n"
							+ "											<div class=\"wrap-num-product flex-w m-l-auto m-r-0\">\r\n"
							+ "												<div\r\n"
							+ "													onclick = \"btnnumproductdown(this)\" class=\"btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m\">\r\n"
							+ "													<i class=\"fs-16 zmdi zmdi-minus\"></i>\r\n"
							+ "												</div>\r\n"
							+ "\r\n"
							+ "												<input class=\"mtext-104 cl3 txt-center num-product\"\r\n"
							+ "													data-id=\""+cart.getIDCARTS()+" type=\"number\" name=\"num-product1\" value=\""+cart.getQUANTITY()+"\">\r\n"
							+ "\r\n"
							+ "												<div\r\n" 
							+ "													onclick = \"btnnumproductup(this)\" class=\"btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m\">\r\n" 
							+ "													<i class=\"fs-16 zmdi zmdi-plus\"></i>\r\n"
							+ "												</div>\r\n"
							+ "											</div>\r\n"
							+ "										</td>\r\n"
							+ "										<td class=\"column-5\">"+cart.getQUANTITY() * cart.getPrice()+"</td>\r\n"
							+ "										<td class=\"column-6\" onclick = 'DeleteCart(this)'><div data-id=\""+cart.getIDCARTS()+"\" class=\"flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10 btnXoaCart\"><i class=\"fa-solid fa-trash\"></i></div></td>\r\n"
							+ "									</tr>";
				}
				
				obMap.put("html", html);
				obMap.put("tongtien", tongtien);
			}
			if(action.equals("UPDATECART")) {

				JSONArray cartArray = object.getJSONArray("CART");
				  // Lặp qua các phần tử trong mảng "CART"
		        for (int i = 0; i < cartArray.length(); i++) {
		            JSONObject cartItem = cartArray.getJSONObject(i);
		            // Lặp qua các cặp key-value trong từng phần tử
		            for (String key : cartItem.keySet()) {
		            	  String id = key;
		                  int quantity = cartItem.getInt(key);
		                NewService.getNewService().UpdateCart(Integer.parseInt(id), quantity, acc.getID());
		            }
		        }
				ArrayList<CARTS> cartsArr= NewService.getNewService().selectAllByIDCarts(acc.getID());
				String html ="";
				double tongtien = 0;
				for (CARTS cart : cartsArr) {
					tongtien += cart.getPrice() * cart.getQUANTITY();
					html+="<tr class=\"table_row\">\r\n"
							+ "										<td class=\"column-1\">\r\n"
							+ "											<div class=\"how-itemcart1\">\r\n"
							+ "												<img src=\""+cart.getImage_url()+"\" alt=\"IMG\">\r\n"
							+ "											</div>\r\n"
							+ "										</td>\r\n"
							+ "										<td class=\"column-2\">"+cart.getShoe_name()+"</td>\r\n"
							+ "										<td class=\"column-3\">$"+cart.getPrice()+"</td>\r\n"
							+ "										<td class=\"column-4\">\r\n"
							+ "											<div class=\"wrap-num-product flex-w m-l-auto m-r-0\">\r\n"
							+ "												<div\r\n"
							+ "													onclick = \"btnnumproductdown(this)\" class=\"btn-num-product-down cl8 hov-btn3 trans-04 flex-c-m\">\r\n"
							+ "													<i class=\"fs-16 zmdi zmdi-minus\"></i>\r\n"
							+ "												</div>\r\n"
							+ "\r\n"
							+ "												<input class=\"mtext-104 cl3 txt-center num-product\"\r\n"
							+ "													data-id=\""+cart.getIDCARTS()+" type=\"number\" name=\"num-product1\" value=\""+cart.getQUANTITY()+"\">\r\n"
							+ "\r\n"
							+ "												<div\r\n" 
							+ "													onclick = \"btnnumproductup(this)\" class=\"btn-num-product-up cl8 hov-btn3 trans-04 flex-c-m\">\r\n" 
							+ "													<i class=\"fs-16 zmdi zmdi-plus\"></i>\r\n"
							+ "												</div>\r\n"
							+ "											</div>\r\n"
							+ "										</td>\r\n"
							+ "										<td class=\"column-5\"> $"+cart.getQUANTITY() * cart.getPrice()+"</td>\r\n"
							+ "										<td class=\"column-6\" onclick = 'DeleteCart(this)'><div data-id=\""+cart.getIDCARTS()+"\" class=\"flex-c-m stext-101 cl2 size-119 bg8 bor13 hov-btn3 p-lr-15 trans-04 pointer m-tb-10 btnXoaCart\"><i class=\"fa-solid fa-trash\"></i></div></td>\r\n"
							+ "									</tr>";
				}
				
				obMap.put("html", html);
				obMap.put("tongtien", tongtien);
			}
			if(action.equals("MUACARTS")) {
				System.out.println("MUACARTS");
				JSONArray cartArray = object.getJSONArray("CART");
				int trangthai = 0;
				if(cartArray != null) {
					
					// ngày giờ hiện tại
	                  long currentTimeMillis = System.currentTimeMillis();
	                  Date currentDate = new Date(currentTimeMillis);
	                  
	                  BILLS bills= new BILLS();
	                  bills.setDATECHECKIN(currentDate);
	                  bills.setID_ACCOUNT(acc.getID());
	                  
	                  // insert bills
	                  daoBills.getDaoBills().Insert(bills);
	                  
	                  // lấy id bills vừa insert
	                  BILLS idBills= daoBills.getDaoBills().Select_Top1_ByIDACC(acc.getID());
	                  
					
					  // Lặp qua các phần tử trong mảng "CART"
			        for (int i = 0; i < cartArray.length(); i++) {
			            JSONObject cartItem = cartArray.getJSONObject(i);
			                 
			            // Lặp qua các cặp key-value trong từng phần tử
			            for (String key : cartItem.keySet()) {
			            	  String id = key;

			                  CARTS carts = NewService.getNewService().SelectAllBy_ID_IDACC(Integer.parseInt(id), acc.getID());
			                  daoCarts.getDaocarts().Delete(carts);
			                  //insert detail_bills
			                  DETAIL_BILLS detail_BILLS= new DETAIL_BILLS();
			                  detail_BILLS.setID_BILL(idBills.getID());
			                  detail_BILLS.setID_DETAIL_SHOE(carts.getDETAILSHOEID());
			                  detail_BILLS.setCOUNTT(carts.getQUANTITY());
			                  detail_BILLS.setPRICE(carts.getPrice());
			                  daoDetailBills.getDaoDetailBills().Insert(detail_BILLS);	                                    
			            }
			        }
			        trangthai = 1;
				}
				
				obMap.put("trangthai", trangthai);
			}
			
			mapper.writeValue(response.getOutputStream(), obMap);
		}

	}

}
