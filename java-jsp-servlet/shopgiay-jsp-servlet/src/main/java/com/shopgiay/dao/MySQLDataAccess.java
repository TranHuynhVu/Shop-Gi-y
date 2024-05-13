package com.shopgiay.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class MySQLDataAccess {
	Connection con;
	ResultSet rs = null;
	Statement stm = null;
	PreparedStatement pstm = null;
	CallableStatement cstm = null;

	public void CloseConetion() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public MySQLDataAccess() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://127.0.0.1:3306/SHOPGIAY";
			String username = "root";
			String password = "1234567890";

			con = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {
			System.out.println("Loi ket noi sql");
			e.printStackTrace();
		}
	}

	// SELECT * FROM // SELECT * FROM WHERE
	public ResultSet getResultSet(String sql, Object... param) {
		if (param == null) {
			try {
				stm = con.createStatement();
				rs = stm.executeQuery(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			try {
				pstm = con.prepareStatement(sql);
				int i = 1;
				for (Object ob : param) {
					pstm.setObject(i, ob);
					i++;
				}
				rs = pstm.executeQuery();
			} catch (SQLException e) {
				System.out.println("Lỗi");
				e.printStackTrace();
			}
		}
		return rs;
	}

	// INSERT UPDATE
	public int ExecuteUpdateSQL(String sql, Object... param) {
		int k = 0;
		try {
			pstm = con.prepareStatement(sql);
			int i = 1;
			for (Object ob : param) {
				pstm.setObject(i, ob);
				i++;
			}
			k = pstm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Lỗi");
			e.printStackTrace();
		}
		return k;
	}

	// Dùng Procedure trong mySQL
	public int Execute_StoredProcedures(String NameStoredProcedures, Object...param) {
		int k = 0;
		try {
			cstm = con.prepareCall("{call " + NameStoredProcedures + "}");
			int i = 1;
			for (Object ob : param) {
				cstm.setObject(i, ob);
				i++;
			}
			k = cstm.executeUpdate();
//			cstm.close();
			
		} catch (SQLException e) {
		}
		return k;
	}
	
	public ResultSet getResultSet_StoredProcedures(String NameStoredProcedures, Object...param) {
		try {
			cstm = con.prepareCall("{call " + NameStoredProcedures + "}");
			int i = 1;
			for (Object ob : param) {
				cstm.setObject(i, ob);
				i++;
			}
			rs = cstm.executeQuery();
//			cstm.close();

		} catch (SQLException e) {
		}
		return rs;
	}
}
