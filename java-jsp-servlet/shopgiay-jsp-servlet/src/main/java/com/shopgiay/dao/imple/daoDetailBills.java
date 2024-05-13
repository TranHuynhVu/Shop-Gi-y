package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.DETAIL_BILLS;

public class daoDetailBills implements Idao<DETAIL_BILLS> {
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

	public double TongDanhThuTheoNam(int nam) {
		double tong=0;
		String sql = "SELECT YEAR(DATECHECKIN) AS YEAR,\r\n"
				+ "       SUM(COUNTT * PRICE) AS TOTAL\r\n"
				+ "FROM DETAIL_BILLS\r\n"
				+ "JOIN BILLS ON DETAIL_BILLS.ID_BILL = BILLS.ID\r\n"
				+ "WHERE YEAR(DATECHECKIN) = ?\r\n"
				+ "GROUP BY YEAR(DATECHECKIN)";
		ResultSet rs = con.getResultSet(sql, nam);
		try {
			while (rs.next()) {
				tong = rs.getDouble("TOTAL");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return tong;
	}
	
	public Map<Integer, Double> chart_Data_TongDanhThuTheoThang(int nam){
		Map<Integer, Double> data = data = new HashMap<Integer, Double>();;
		String sql = "SELECT MONTH(DATECHECKIN) AS MONTH,\r\n"
				+ "       SUM(COUNTT * PRICE) AS TOTAL\r\n"
				+ "FROM DETAIL_BILLS\r\n"
				+ "JOIN BILLS ON DETAIL_BILLS.ID_BILL = BILLS.ID\r\n"
				+ "WHERE YEAR(DATECHECKIN) = ?\r\n"
				+ "GROUP BY YEAR(DATECHECKIN), MONTH(DATECHECKIN);";
		ResultSet rs = con.getResultSet(sql, nam);
		try {
			while (rs.next()) {
				
				data.put(Integer.parseInt(rs.getString("MONTH")), Double.parseDouble(rs.getString("TOTAL")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		
		return data;
	}
	
	

}
