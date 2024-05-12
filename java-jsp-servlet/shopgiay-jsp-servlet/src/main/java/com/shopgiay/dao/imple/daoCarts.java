package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.CARTS;

public class daoCarts implements Idao<CARTS> {
	MySQLDataAccess con = null;

	public static daoCarts getDaocarts() {
		return new daoCarts();
	}

	public daoCarts() {
		con = new MySQLDataAccess();
	}

	@Override
	public int Insert(CARTS t) {
		int result = 0;
		String sql = "INSERT INTO CARTS (ID_ACCOUNT, ID_DETAIL_SHOE, QUANTITY, SIZE, COLOR) VALUES (?, ?, ?, ?, ?)";
		result = con.ExecuteUpdateSQL(sql, t.getACCOUNTID(), t.getDETAILSHOEID(), t.getQUANTITY(), t.getSIZECARTS(),
				t.getCOLORCARTS());
		System.out.println("Insert carts thanh cong");
		return result;
	}

	@Override
	public int Update(CARTS t) {
		int result = 0;
		String sql = "UPDATE CARTS SET ACCOUNTID = ?, DETAILSHOEID = ?, QUANTITY = ?, SIZECARTS = ?, COLORCARTS = ? WHERE IDCARTS = ?";
		result = con.ExecuteUpdateSQL(sql, t.getACCOUNTID(), t.getDETAILSHOEID(), t.getQUANTITY(), t.getSIZECARTS(),
				t.getCOLORCARTS(), t.getIDCARTS());
		return result;
	}

	@Override
	public int Delete(CARTS t) {
		int result = 0;
		String sql = "DELETE FROM CARTS WHERE IDCARTS = ?";
		result = con.ExecuteUpdateSQL(sql, t.getIDCARTS());
		return result;
	}

	@Override
	public ArrayList<CARTS> SelectAll() {
		ArrayList<CARTS> arr = new ArrayList<CARTS>();
		String sql = "SELECT * FROM CARTS";
		ResultSet rs = con.getResultSet(sql);
		try {
			while (rs.next()) {
				CARTS cart = new CARTS(rs.getInt("IDCARTS"), rs.getInt("ACCOUNTID"), rs.getInt("DETAILSHOEID"),
						rs.getInt("QUANTITY"), rs.getString("SIZECARTS"), rs.getString("COLORCARTS"));
				arr.add(cart);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}

	@Override
	public CARTS SelectByID(CARTS t) {
		CARTS cart = null;
		String sql = "SELECT * FROM CARTS WHERE IDCARTS = ?";
		ResultSet rs = con.getResultSet(sql, t.getIDCARTS());
		try {
			while (rs.next()) {
				cart = new CARTS(rs.getInt("IDCARTS"), rs.getInt("ACCOUNTID"), rs.getInt("DETAILSHOEID"),
						rs.getInt("QUANTITY"), rs.getString("SIZECARTS"), rs.getString("COLORCARTS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cart;
	}
}
