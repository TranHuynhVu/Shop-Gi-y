package com.shopgiay.service;

import java.util.ArrayList;
import java.util.Map;

import com.shopgiay.dao.imple.daoAccounts;
import com.shopgiay.dao.imple.daoBills;
import com.shopgiay.dao.imple.daoDetailBills;
import com.shopgiay.dao.imple.daoShoes;
import com.shopgiay.model.BILLS;

public class NewServiceAdmin {
	public static NewServiceAdmin getNewServiceAdmin() {
		return new NewServiceAdmin();
	}
	public double DoanhThuTheoNam(int nam) {
		return daoDetailBills.getDaoDetailBills().TongDanhThuTheoNam(nam);
	}
	public int TongSoLuongGiay() {
		return daoShoes.getDaoShoes().TongSoLuongGiay();
	}
	public int TongSoLuongNguoiDung() {
		return daoAccounts.getDaoAccounts().TongSoLuongNguoiDung();
	}
	
	public Map<Integer, Double> chart_Data_TongDanhThuTheoThang(int nam){
		return daoDetailBills.getDaoDetailBills().chart_Data_TongDanhThuTheoThang(nam);
	}
	
	public ArrayList<BILLS> HoaDon_All(){
		return daoBills.getDaoBills().HoaDon_All();
	}
}
