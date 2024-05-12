package com.shopgiay.model;

public class CARTS {
	private int IDCARTS;
	private int ACCOUNTID;
	private int DETAILSHOEID;
	private int QUANTITY;
	private String SIZECARTS;
	private String COLORCARTS;
	
	@Override
	public String toString() {
		return "CARTS [IDCARTS=" + IDCARTS + ", ACCOUNTID=" + ACCOUNTID + ", DETAILSHOEID=" + DETAILSHOEID
				+ ", QUANTITY=" + QUANTITY + ", SIZECARTS=" + SIZECARTS + ", COLORCARTS=" + COLORCARTS + "]";
	}
	public int getIDCARTS() {
		return IDCARTS;
	}
	public void setIDCARTS(int iDCARTS) {
		IDCARTS = iDCARTS;
	}
	public int getACCOUNTID() {
		return ACCOUNTID;
	}
	public void setACCOUNTID(int aCCOUNTID) {
		ACCOUNTID = aCCOUNTID;
	}
	public int getDETAILSHOEID() {
		return DETAILSHOEID;
	}
	public void setDETAILSHOEID(int dETAILSHOEID) {
		DETAILSHOEID = dETAILSHOEID;
	}
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	}
	public String getSIZECARTS() {
		return SIZECARTS;
	}
	public void setSIZECARTS(String sIZECARTS) {
		SIZECARTS = sIZECARTS;
	}
	public String getCOLORCARTS() {
		return COLORCARTS;
	}
	public void setCOLORCARTS(String cOLORCARTS) {
		COLORCARTS = cOLORCARTS;
	}
	public CARTS() {
		super();
	}
	public CARTS(int iDCARTS, int aCCOUNTID, int dETAILSHOEID, int qUANTITY, String sIZECARTS, String cOLORCARTS) {
		super();
		IDCARTS = iDCARTS;
		ACCOUNTID = aCCOUNTID;
		DETAILSHOEID = dETAILSHOEID;
		QUANTITY = qUANTITY;
		SIZECARTS = sIZECARTS;
		COLORCARTS = cOLORCARTS;
	}
	
}