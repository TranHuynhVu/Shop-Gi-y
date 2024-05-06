package com.shopgiay.model;

public class COLORS {
	private int ID;
	private String NAMEE;
	private String CODECOLOR;
	private boolean STATUSS;
	public COLORS(int iD, String nAMEE, String cODECOLOR, boolean sTATUSS) {
		super();
		ID = iD;
		NAMEE = nAMEE;
		CODECOLOR = cODECOLOR;
		STATUSS = sTATUSS;
	}
	public COLORS() {
		super();
	}
	public COLORS(String nAMEE) {
		NAMEE = nAMEE;
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
	public String getCODECOLOR() {
		return CODECOLOR;
	}
	public void setCODECOLOR(String cODECOLOR) {
		CODECOLOR = cODECOLOR;
	}
	public boolean isSTATUSS() {
		return STATUSS;
	}
	public void setSTATUSS(boolean sTATUSS) {
		STATUSS = sTATUSS;
	}
	
}
