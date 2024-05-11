package com.shopgiay.dao.imple;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.COLORS;
import com.shopgiay.model.IMAGES;

public class daoImages implements Idao<IMAGES>{
	MySQLDataAccess con = null;
	public static daoImages getDaoImages() {
		return new daoImages();
	}
	public daoImages() {
		con = new MySQLDataAccess();
	}
	@Override
	public int Insert(IMAGES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(IMAGES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(IMAGES t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<IMAGES> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMAGES SelectByID(IMAGES t) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<IMAGES> selectByID(int id){
		ArrayList<IMAGES> arr = new ArrayList<IMAGES>();
		String sql = "SELECT * FROM IMAGES WHERE ID_DETAIL_SHOE = ? LIMIT 3";
		ResultSet rs = con.getResultSet(sql,id);
		
		try {
			while (rs.next()) {
				IMAGES images = new IMAGES(rs.getString("ID"),rs.getInt("ID_DETAIL_SHOE"));
				arr.add(images);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}
}
