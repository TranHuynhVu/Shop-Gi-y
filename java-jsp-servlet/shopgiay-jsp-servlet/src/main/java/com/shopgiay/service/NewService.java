package com.shopgiay.service;

import java.util.ArrayList;

import com.shopgiay.dao.imple.daoDetail_Shoes;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.SHOES;

public class NewService {
	public static NewService getNewService() {
		return new NewService();
	}

	public ArrayList<DETAIL_SHOES> getShoes(){
		ArrayList<DETAIL_SHOES> arrayList = daoDetail_Shoes.getdaoDetail_Shoes().SelectAll();

		return arrayList;
	}
			
}
