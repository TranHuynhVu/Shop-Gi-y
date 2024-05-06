package com.shopgiay.model;

public class SIZES {
	private int ID;
	private String SIZE;
	private String DETAIL;
	private boolean STATUSS;
	public SIZES(int iD, String sIZE, String dETAIL, boolean sTATUSS) {
		super();
		ID = iD;
		SIZE = sIZE;
		DETAIL = dETAIL;
		STATUSS = sTATUSS;
	}
	public SIZES() {
		super();
	}
	public SIZES(String sIZE) {
		SIZE = sIZE;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSIZE() {
		return SIZE;
	}
	public void setSIZE(String sIZE) {
		SIZE = sIZE;
	}
	public String getDETAIL() {
		return DETAIL;
	}
	public void setDETAIL(String dETAIL) {
		DETAIL = dETAIL;
	}
	public boolean isSTATUSS() {
		return STATUSS;
	}
	public void setSTATUSS(boolean sTATUSS) {
		STATUSS = sTATUSS;
	}
	
}
