package com.shopgiay.service;

import java.util.ArrayList;

import com.shopgiay.dao.imple.daoCategories;
import com.shopgiay.dao.imple.daoColos;
import com.shopgiay.dao.imple.daoDetail_Shoes;
import com.shopgiay.dao.imple.daoImages;
import com.shopgiay.dao.imple.daoShoes;
import com.shopgiay.dao.imple.daoSizes;
import com.shopgiay.model.CATEGORIES;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.IMAGES;
import com.shopgiay.model.SHOES;
import com.shopgiay.model.SIZES;

public class NewService {
	public static NewService getNewService() {
		return new NewService();
	}

	public ArrayList<DETAIL_SHOES> getShoes(){
		return daoDetail_Shoes.getdaoDetail_Shoes().SelectAll();
	}
	
	public ArrayList<COLORS> getColorsByID(int id){
		return daoColos.getDaoColos().selectByIDColor(id);
	}
	public ArrayList<SIZES> getSizesByID(int id){
		return daoSizes.getDaoSizes().SelectByID(id);
	}
	
	public ArrayList<IMAGES> getImagesByID(int id){
		return daoImages.getDaoImages().selectByID(id);
	}
	
	public ArrayList<CATEGORIES> getCategoriesSelectAll(){
		return daoCategories.getDaoCategories().SelectAll();
	}
	public ArrayList<SHOES> getShoesSelectAll(){
		return daoShoes.getDaoShoes().SelectAll();
	}
	public ArrayList<DETAIL_SHOES> getDFFilter(String sql){
		return daoDetail_Shoes.getdaoDetail_Shoes().SelectAllBySortPriceColor(sql);
	}
	
}
