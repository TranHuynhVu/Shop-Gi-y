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
		
		
	}
}
