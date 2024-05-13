package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.BILLS;
import com.shopgiay.model.CARTS;

public class daoBills implements Idao<BILLS>{
	MySQLDataAccess con = null;

	public static daoBills getDaoBills() {
		return new daoBills();
	}

	public daoBills() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(BILLS t) {
		int k = 0;
	    String sql = "INSERT INTO BILLS (DATECHECKIN, DATECHECKOUT, NOTE, PAYMENT_METHODS, ID_ACCOUNT, ID_ADDRESS, ID_SHIP, ID_SELL_VOUCHER, ID_STAFF, ID_STATUS_BILL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		k = con.ExecuteUpdateSQL(sql, t.getDATECHECKIN(), t.getDATECHECKOUT(), t.getNOTE(), t.isPAYMENT_METHODS(), t.getID_ACCOUNT(), 1, 1, 1,
					1, 1);
		
	    System.out.println("Insert bill thành công");

	    return k;
	}

	@Override
	public int Update(BILLS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(BILLS t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<BILLS> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BILLS SelectByID(BILLS t) {
		// TODO Auto-generated method stub
		return null;
	}
	public BILLS Select_Top1_ByIDACC(int idacc) {
		BILLS bills= null;
		String sql= "SELECT * FROM BILLS WHERE ID_ACCOUNT = ? ORDER BY ID DESC limit 1";
		ResultSet rs = con.getResultSet(sql, idacc);
		try {
			while (rs.next()) {
				bills = new BILLS();
				bills.setID(rs.getInt("ID"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bills;
	}

}