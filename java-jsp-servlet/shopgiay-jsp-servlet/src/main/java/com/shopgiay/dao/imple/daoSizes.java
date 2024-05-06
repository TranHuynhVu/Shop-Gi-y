package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.SIZES;

public class daoSizes implements Idao<SIZES>{
	MySQLDataAccess con = null;
	public static daoSizes getDaoSizes() {
		return new daoSizes();
	}
	public daoSizes() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(SIZES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(SIZES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(SIZES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SIZES> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SIZES SelectByID(SIZES t) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<SIZES> SelectByID(int t) {
		ArrayList<SIZES> arr = new ArrayList<SIZES>();
		String sql = "SELECT S.SIZE\r\n"
				+ "FROM DETAIL_SHOES DS\r\n"
				+ "JOIN DETAIL_SIZES DSZ ON DS.ID = DSZ.ID_DETAIL_SHOE\r\n"
				+ "JOIN SIZES S ON DSZ.ID_SIZE = S.ID\r\n"
				+ "WHERE DS.ID = ?";
		ResultSet rs = con.getResultSet(sql,t);
		
		try {
			while (rs.next()) {
				SIZES sizes = new SIZES(rs.getString("SIZE"));
				arr.add(sizes);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}
}
