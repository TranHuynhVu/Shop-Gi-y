package com.shopgiay.dao.imple;

import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;

public class daoDetailBills implements Idao<DETAIL_BILLS>{
	MySQLDataAccess con = null;

	public static daoDetailBills getDaoDetailBills() {
		return new daoDetailBills();
	}

	public daoDetailBills() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(DETAIL_BILLS t) {
		int k = 0;
	    String sql = "INSERT INTO DETAIL_BILLS (ID_BILL, ID_DETAIL_SHOE, COUNTT, PRICE) VALUES (?,?,?,?)";
		k = con.ExecuteUpdateSQL(sql, t.getID_BILL(), t.getID_DETAIL_SHOE(), t.getCOUNTT(), t.getPRICE());
	    System.out.println("Insert detail bill thành công");

	    return k;
	}

	@Override
	public int Update(DETAIL_BILLS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(DETAIL_BILLS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DETAIL_BILLS> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DETAIL_BILLS SelectByID(DETAIL_BILLS t) {
		// TODO Auto-generated method stub
		return null;
	}

}
