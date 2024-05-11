package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.CATEGORIES;
import com.shopgiay.model.SIZES;

public class daoCategories implements Idao<CATEGORIES>{
	MySQLDataAccess con = null;
	public static daoCategories getDaoCategories() {
		return new daoCategories();
	}
	public daoCategories() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(CATEGORIES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(CATEGORIES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(CATEGORIES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<CATEGORIES> SelectAll() {
		ArrayList<CATEGORIES> arr = new ArrayList<CATEGORIES>();
		String sql = "select * from CATEGORIES limit 2";
		ResultSet rs = con.getResultSet(sql);
		
		try {
			while (rs.next()) {
				CATEGORIES categories = new CATEGORIES();
				categories.setNAMEECATE(rs.getString("NAMEE"));
				arr.add(categories);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}

	@Override
	public CATEGORIES SelectByID(CATEGORIES t) {
		// TODO Auto-generated method stub
		return null;
	}

}
