package com.shopgiay.model;

public class IMAGES {
	private String ID;
	private int ID_DETAIL_SHOE;
	public IMAGES(String iD, int iD_DETAIL_SHOE) {
		super();
		ID = iD;
		ID_DETAIL_SHOE = iD_DETAIL_SHOE;
	}
	public IMAGES() {
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getID_DETAIL_SHOE() {
		return ID_DETAIL_SHOE;
	}
	public void setID_DETAIL_SHOE(int iD_DETAIL_SHOE) {
		ID_DETAIL_SHOE = iD_DETAIL_SHOE;
	}
	@Override
	public String toString() {
		return "IMAGES [ID=" + ID + ", ID_DETAIL_SHOE=" + ID_DETAIL_SHOE + "]";
	}
	
}
