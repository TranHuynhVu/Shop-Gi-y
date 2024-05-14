package com.shopgiay.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopgiay.model.SHOES;
import com.shopgiay.service.NewServiceAdmin;

/**
 * Servlet implementation class QuanLyGiayController
 */
@WebServlet("/admin-quanly-giay")
public class QuanLyGiayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Lấy dữ liệu bảng giày
		ArrayList<SHOES> arr_Giay_Table = NewServiceAdmin.getNewServiceAdmin().Select_Giay_in_Table();
		request.setAttribute("arr_Giay_Table", arr_Giay_Table);
		for (SHOES shoes : arr_Giay_Table) {
			System.out.println(shoes.getID());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/quanlygiay.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}