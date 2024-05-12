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

	public ArrayList<CARTS> SelectAllByID(int id) {
		ArrayList<CARTS> arr = new ArrayList<CARTS>();
		String sql = "SELECT \r\n"
				+ "    carts.ID AS cart_id,\r\n"
				+ "    (SELECT ID FROM IMAGES WHERE ID_DETAIL_SHOE = detail_shoes.ID LIMIT 1) AS image_url,\r\n"
				+ "    shoes.NAMEE AS shoe_name,\r\n"
				+ "    carts.QUANTITY AS quantity_in_cart,\r\n"
				+ "    detail_shoes.PRICE AS price,\r\n"
				+ "    detail_shoes.ID AS detail_shoe_id\r\n"
				+ "FROM \r\n"
				+ "    carts\r\n"
				+ "JOIN \r\n"
				+ "    detail_shoes ON carts.ID_DETAIL_SHOE = detail_shoes.ID\r\n"
				+ "JOIN \r\n"
				+ "    shoes ON detail_shoes.ID_SHOE = shoes.ID\r\n"
				+ "WHERE carts.ID_ACCOUNT = ?";
		ResultSet rs = con.getResultSet(sql, id);
		try {
			while (rs.next()) {
				CARTS cart = new CARTS();
				cart.setImage_url(rs.getString("image_url"));	
				cart.setShoe_name(rs.getString("shoe_name"));	
				cart.setQUANTITY(rs.getInt("quantity_in_cart"));;	
				cart.setPrice(rs.getDouble("price"));	
				cart.setDETAILSHOEID(rs.getInt("detail_shoe_id"));;	
				arr.add(cart);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}
}
