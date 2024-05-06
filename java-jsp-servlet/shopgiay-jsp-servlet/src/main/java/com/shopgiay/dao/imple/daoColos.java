package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.DETAIL_SHOES;

public class daoColos implements Idao<COLORS>{
	MySQLDataAccess con = null;
	public static daoColos getDaoColos() {
		return new daoColos();
	}
	public daoColos() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(COLORS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(COLORS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(COLORS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<COLORS> SelectAll() {
		return null;
	}

	@Override
	public COLORS SelectByID(COLORS t) {
		return null;
	}
	
	public ArrayList<COLORS> selectByIDColor(int id){
		ArrayList<COLORS> arr = new ArrayList<COLORS>();
		String sql = "SELECT C.NAMEE AS Color\r\n"
					+ "FROM DETAIL_SHOES DS\r\n"
					+ "JOIN DETAIL_COLORS DC ON DS.ID = DC.ID_DETAIL_SHOE\r\n"
					+ "JOIN COLORS C ON DC.ID_COLOR = C.ID\r\n"
					+ "WHERE DS.ID = ?";
		ResultSet rs = con.getResultSet(sql,id);
		
		try {
			while (rs.next()) {
				COLORS colors = new COLORS(rs.getString("Color"));
				arr.add(colors);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}


	
	
}
