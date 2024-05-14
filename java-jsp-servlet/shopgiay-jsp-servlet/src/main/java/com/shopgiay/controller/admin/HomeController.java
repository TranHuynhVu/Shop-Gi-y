package com.shopgiay.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopgiay.model.BILLS;
import com.shopgiay.service.NewServiceAdmin;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns = {"/admin-home"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Lấy doanh thu theo năm
		double doanhThuTheoNam = NewServiceAdmin.getNewServiceAdmin().DoanhThuTheoNam(2024);
		request.setAttribute("doanhThuTheoNam", doanhThuTheoNam);
		
		// Lấy tổng số lượng giày
		int tongSoLuongGiay = NewServiceAdmin.getNewServiceAdmin().TongSoLuongGiay();
		request.setAttribute("tongSoLuongGiay", tongSoLuongGiay);
		
		// Lấy tổng số lượng người dùng (User)
		int tongSoLuongNguoiDung = NewServiceAdmin.getNewServiceAdmin().TongSoLuongNguoiDung();
		request.setAttribute("tongSoLuongNguoiDung", tongSoLuongNguoiDung);
		
		// Lấy All hóa đơn
		ArrayList<BILLS> arr_HoaDon = NewServiceAdmin.getNewServiceAdmin().HoaDon_All_Top5();
		request.setAttribute("arr_HoaDon", arr_HoaDon);
		
		for (BILLS bills : arr_HoaDon) {
			System.out.println(bills.getTongBill());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
