package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.ACCOUNTS;

public class daoAccounts implements Idao<ACCOUNTS>{
	MySQLDataAccess con = null;
	public static daoAccounts getDaoAccounts() {
		return new daoAccounts();
	}
	public daoAccounts() {
		con = new MySQLDataAccess();
	}
	
	@Override
	public int Insert(ACCOUNTS t) {
		int ketqua = 0;
		String sql = "INSERT INTO ACCOUNTS (NAMEE, PASSWORDD, EMAIL, PHONE, STATUSS, POSITION, ID_ADDRESS)" + 
					 " VALUES(?,?,?,?,?,?,?)";
		ketqua = con.ExecuteUpdateSQL(sql, t.getNAMEE(), t.getPASSWORDD(),t.getEMAIL(), t.getPHONE(), t.getSTATUSS(), t.getPOSITION(), t.getID_ADDRESS());
		con.CloseConetion();
		return ketqua;
	}

	@Override
	public int Update(ACCOUNTS t) {
		int ketqua = 0;
		String sql = "UPDATE ACCOUNTS" + " PASSWORDD = ?, EMAIL = ?, PHONE = ?, STATUSS = ?, POSITION = ?, ID_ADDRESS = ?" + " WHERE NAMEE = ?";
		ketqua = con.ExecuteUpdateSQL(sql, t.getPASSWORDD(), t.getEMAIL(),t.getPHONE(), t.getSTATUSS(), t.getID_ADDRESS(), t.getID_ADDRESS(), t.getNAMEE());
		con.CloseConetion();
		return ketqua;
	}

	@Override
	public int Delete(ACCOUNTS t) {
		int ketqua = 0;
		String sql = "DELETE ACCOUNTS" + " WHERE NAMEE = ?";
		ketqua = con.ExecuteUpdateSQL(sql, t.getNAMEE());
		con.CloseConetion();
		return ketqua;
	}

	@Override
	public ArrayList<ACCOUNTS> SelectAll() {
		ArrayList<ACCOUNTS> arr = new ArrayList<ACCOUNTS>();
		String sql = "SELECT * FROM ACCOUNTS";
		ResultSet rs = con.getResultSet(sql);
		
		try {
			while (rs.next()) {
				ACCOUNTS accounts = new ACCOUNTS(rs.getInt("ID"), rs.getString("NAMEE"), rs.getString("PASSWORDD"), rs.getString("EMAIL"), rs.getString("PHONE"), rs.getInt("STATUSS")
						, rs.getString("POSITION"), rs.getInt("ID_ADDRESS"));
				arr.add(accounts);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}

	@Override
	public ACCOUNTS SelectByID(ACCOUNTS t) {
		ACCOUNTS accounts = null;
		String sql = "SELECT * FROM ACCOUNTS WHERE NAMEE = ? AND PASSWORDD = ?";
		ResultSet rs = con.getResultSet(sql, t.getNAMEE(), t.getPASSWORDD());
		
		try {
			while (rs.next()) {
				accounts = new ACCOUNTS(rs.getInt("ID"), rs.getString("NAMEE"), rs.getString("PASSWORDD"), rs.getString("EMAIL"), rs.getString("PHONE"), rs.getInt("STATUSS")
						, rs.getString("POSITION"), rs.getInt("ID_ADDRESS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return accounts;
	}

}
