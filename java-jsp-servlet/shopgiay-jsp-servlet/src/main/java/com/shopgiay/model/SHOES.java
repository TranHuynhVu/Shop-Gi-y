package com.shopgiay.model;

public class SHOES {
	private int ID ;
	private String NAMEE;
	private String DETAIL;
	private boolean STATUSS;
	private int ID_TRADEMARK;

	public SHOES(String nAMEE) {
		NAMEE = nAMEE;
	}
	
	public SHOES() {
		super();
	}
	
	public SHOES(int iD, String nAMEE, String dETAIL, boolean sTATUSS, int iD_TRADEMARK) {
		super();
		ID = iD;
		NAMEE = nAMEE;
		DETAIL = dETAIL;
		STATUSS = sTATUSS;
		ID_TRADEMARK = iD_TRADEMARK;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAMEE() {
		return NAMEE;
	}

	public void setNAMEE(String nAMEE) {
		NAMEE = nAMEE;
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

	public int getID_TRADEMARK() {
		return ID_TRADEMARK;
	}

	public void setID_TRADEMARK(int iD_TRADEMARK) {
		ID_TRADEMARK = iD_TRADEMARK;
	}
	
}
