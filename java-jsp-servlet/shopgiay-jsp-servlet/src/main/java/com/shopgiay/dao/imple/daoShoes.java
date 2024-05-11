package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.SHOES;
import com.shopgiay.model.SIZES;

public class daoShoes implements Idao<SHOES>{
	MySQLDataAccess con = null;
	public static daoShoes getDaoShoes() {
		return new daoShoes();
	}
	public daoShoes() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(SHOES t) {
		int ketqua = 0;
		String sql = "INSERT INTO SHOES (NAMEE, DETAIL, STATUSS, ID_TRADEMARK)" + 
					 " VALUES(?,?,?,?)";
		ketqua = con.ExecuteUpdateSQL(sql, t.getNAMEE(), t.getDETAIL(), t.isSTATUSS(), t.getID_TRADEMARK());
		con.CloseConetion();
		return ketqua;
	}

	@Override
	public int Update(SHOES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(SHOES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SHOES> SelectAll() {
		ArrayList<SHOES> arr = new ArrayList<SHOES>();
		String sql = "SELECT \r\n"
				+ "    SH.ID AS Ma_Giay,\r\n"
				+ "    CAT.NAMEE AS Ten_Categories\r\n"
				+ "FROM \r\n"
				+ "    SHOES SH\r\n"
				+ "JOIN \r\n"
				+ "    DETAIL_CATEGORIES DC ON SH.ID = DC.ID_SHOE\r\n"
				+ "JOIN \r\n"
				+ "    CATEGORIES CAT ON DC.ID_CATEGORY = CAT.ID;";
		ResultSet rs = con.getResultSet(sql);
		
		try {
			while (rs.next()) {
				SHOES shoes = new SHOES();
				shoes.setID(rs.getInt("Ma_Giay"));
				shoes.setNAMEECATE(rs.getString("Ten_Categories"));
				arr.add(shoes);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}

	@Override
	public SHOES SelectByID(SHOES t) {
		return null;
	}
	
	public SHOES selectByIDName(int id) {
		SHOES shoes = null;
		String sql = "SELECT * FROM SHOES WHERE id=?";
		ResultSet rs = con.getResultSet(sql,id);
		
		try {
			while (rs.next()) {
				shoes = new SHOES(rs.getString("NAMEE"));
	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return shoes;
	}

}
