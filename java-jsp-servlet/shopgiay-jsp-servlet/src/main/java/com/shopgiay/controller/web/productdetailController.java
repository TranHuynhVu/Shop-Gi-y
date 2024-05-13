package com.shopgiay.controller.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.CommentsReviews;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.IMAGES;
import com.shopgiay.model.SIZES;
import com.shopgiay.service.NewService;
import com.shopgiay.util.JsonUtil;
import com.shopgiay.util.SessionUtil;

/**
 * Servlet implementation class productdetailController
 */
@WebServlet("/product-detail")
public class productdetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iddf = request.getParameter("ID");
		int id = Integer.parseInt(iddf);
		
		ACCOUNTS acc = (ACCOUNTS) SessionUtil.getSessionUtil().getValue(request, "ACC");
	     if(acc != null) {
	    	 int indexIconCart= NewService.getNewService().getSoLuongCartByIdAcc(acc.getID());
	    	 request.setAttribute("indexIconCart", indexIconCart);
	     }else {
	    	 request.setAttribute("indexIconCart", 0);
		}
		
		DETAIL_SHOES df = NewService.getNewService().selectByIdDetail_SHOES(id);
		
		ArrayList<COLORS> colorsarr = NewService.getNewService().getColorsByID(id);
		// sizea
		ArrayList<SIZES> sizesarr = NewService.getNewService().getSizesByID(id);
		
		ArrayList<IMAGES> imageArr = NewService.getNewService().getImagesByID(id);
		
		ArrayList<CommentsReviews> commentsReviewsArr = NewService.getNewService().SelectAllByIDComment(id);
		
		for (CommentsReviews item : commentsReviewsArr) {
			System.out.println(item.getIDDFSHOE());
		}
		request.setAttribute("colors", colorsarr);
		request.setAttribute("size", sizesarr);
		request.setAttribute("images", imageArr);
		request.setAttribute("detall_shoes", df); 
		request.setAttribute("comments", commentsReviewsArr); 
		request.setAttribute("iddf", id);
	
		if(acc != null) {
			request.setAttribute("idacc", acc.getID());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/productdetail.jsp");
	    rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
