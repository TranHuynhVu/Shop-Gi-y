package com.shopgiay.controller.admin.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopgiay.service.NewServiceAdmin;
import com.shopgiay.util.HttpUtil;
import com.shopgiay.util.JsonUtil;


@WebServlet("/api-admin-new")
public class NewApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		
		Map<String, Object> obMap = new HashMap<String, Object>();
		
		JSONObject object = JsonUtil.of(request.getReader()).getObject();
		String action = object.getString("ACTION");
		
		if(action.equals("LOADTRANG_DATACHART")) {
			System.out.println("LOADTRANG_DATACHART");
			
			//Tổng doanh thu theo tháng (tính theo năm 2024)
			Map<Integer, Double> chart_Data_TongDanhThuTheoThang = NewServiceAdmin.getNewServiceAdmin().chart_Data_TongDanhThuTheoThang(2024);
			for (Map.Entry<Integer, Double> entry : chart_Data_TongDanhThuTheoThang.entrySet()) {
	            Integer month = entry.getKey();
	            Double revenue = entry.getValue();
	            System.out.println("Tháng " + month + ": " + revenue);
	        }
			obMap.put("Data_Chart", chart_Data_TongDanhThuTheoThang);
		}
		mapper.writeValue(response.getOutputStream(), obMap);	
	}

}
