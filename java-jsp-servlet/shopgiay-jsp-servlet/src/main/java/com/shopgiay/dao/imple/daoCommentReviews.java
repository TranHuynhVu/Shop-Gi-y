package com.shopgiay.dao.imple;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shopgiay.dao.Idao;
import com.shopgiay.dao.MySQLDataAccess;
import com.shopgiay.model.ACCOUNTS;
import com.shopgiay.model.CommentsReviews;

public class daoCommentReviews implements Idao<CommentsReviews>{
	MySQLDataAccess con = null;
	public static daoCommentReviews getCommentReviews() {
		return new daoCommentReviews();
	}
	public daoCommentReviews() {
		con = new MySQLDataAccess();
	}
	
	@Override
	public int Insert(CommentsReviews t) {
		int ketqua = 0;
		String sql = "INSERT INTO COMMENTS_REVIEWS (RATE, DETAIL, ID_DETAIL_SHOE, ID_ACCOUNT)" + 
					 " VALUES(?,?,?,?)";
		ketqua = con.ExecuteUpdateSQL(sql, t.getRATE(), t.getDETAILCR(), t.getIDDFSHOE(), t.getIDACC());
		con.CloseConetion();
		return ketqua;
	}

	@Override
	public int Update(CommentsReviews t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(CommentsReviews t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<CommentsReviews> SelectAll() {
		
		return null;
	}
	
	public ArrayList<CommentsReviews> SelectAllByID(int id) {
		ArrayList<CommentsReviews> arr = new ArrayList<CommentsReviews>();
		String sql = "SELECT comments_reviews.*, accounts.NAMEE AS account_name\r\n"
				+ "FROM comments_reviews\r\n"
				+ "INNER JOIN accounts ON comments_reviews.ID_ACCOUNT = accounts.ID\r\n"
				+ "WHERE comments_reviews.ID_DETAIL_SHOE = ? limit 5 \r\n"
				+ "";
		ResultSet rs = con.getResultSet(sql, id);
		
		try {
			while (rs.next()) {
				CommentsReviews commentsReviews = new CommentsReviews();
				commentsReviews.setIDCR(rs.getInt("ID"));
				commentsReviews.setRATE(rs.getInt("RATE"));
				commentsReviews.setIDDFSHOE(rs.getInt("ID_DETAIL_SHOE"));
				commentsReviews.setIDACC(rs.getInt("ID_ACCOUNT"));
				commentsReviews.setNAMEE(rs.getString("account_name"));
				commentsReviews.setDETAILCR(rs.getString("DETAIL"));
				arr.add(commentsReviews);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.CloseConetion();
		return arr;
	}

	@Override
	public CommentsReviews SelectByID(CommentsReviews t) {
		// TODO Auto-generated method stub
		return null;
	}

}
