package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.DETAIL_SHOES;
import com.shopgiay.model.SHOES;
import com.shopgiay.model.SIZES;

public class daoDetail_Shoes implements Idao<DETAIL_SHOES>{
	MySQLDataAccess con = null;
	public static daoDetail_Shoes getdaoDetail_Shoes() {
		return new daoDetail_Shoes();
	}
	public daoDetail_Shoes() {
		con = new MySQLDataAccess();
	}
	
	@Override
	public int Insert(DETAIL_SHOES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(DETAIL_SHOES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(DETAIL_SHOES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DETAIL_SHOES> SelectAll() {
		ArrayList<DETAIL_SHOES> arr = new ArrayList<DETAIL_SHOES>();
		String sql = "SELECT \r\n"
				+ "	   DS.ID AS Ma_Detail,\r\n"
				+ "    DS.ID_SHOE AS Ma_giay,\r\n"
				+ "    DS.PRICE AS Gia,\r\n"
				+ "    DS.COUNTT AS So_luong,\r\n"
				+ "    SH.NAMEE AS Ten_giay,\r\n"
				+ "    SZ.SIZE AS Size,\r\n"
				+ "    C.NAMEE AS Mau\r\n"
				+ "FROM \r\n"
				+ "    DETAIL_SHOES DS\r\n"
				+ "JOIN \r\n"
				+ "    DETAIL_COLORS DC ON DS.ID = DC.ID_DETAIL_SHOE\r\n"
				+ "JOIN \r\n"
				+ "    DETAIL_SIZES DZ ON DS.ID = DZ.ID_DETAIL_SHOE\r\n"
				+ "JOIN \r\n"
				+ "    COLORS C ON DC.ID_COLOR = C.ID\r\n"
				+ "JOIN \r\n"
				+ "    SIZES SZ ON DZ.ID_SIZE = SZ.ID\r\n"
				+ "JOIN\r\n"
				+ "    SHOES SH ON DS.ID_SHOE = SH.ID;\r\n"
				+ "";
		ResultSet rs = con.getResultSet(sql);
		
		try {
			while (rs.next()) {
				DETAIL_SHOES detail_SHOES = new DETAIL_SHOES(rs.getString("Size"), rs.getString("Mau"), rs.getString("Ten_giay"), rs.getInt("Ma_Detail"), rs.getInt("Ma_giay"), rs.getDouble("Gia"), rs.getInt("So_luong"));
				arr.add(detail_SHOES);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}

	@Override
	public DETAIL_SHOES SelectByID(DETAIL_SHOES t) {
		// TODO Auto-generated method stub
		return null;
	}

}