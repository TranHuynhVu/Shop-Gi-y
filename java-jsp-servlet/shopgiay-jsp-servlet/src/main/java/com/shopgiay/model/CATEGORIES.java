package com.shopgiay.model;

public class CATEGORIES {
	 private int IDCATE;
	 private String NAMEECATE;
	 private boolean STATUSSCATE;
	public CATEGORIES(int iDCATE, String nAMEECATE, boolean sTATUSSCATE) {
		super();
		IDCATE = iDCATE;
		NAMEECATE = nAMEECATE;
		STATUSSCATE = sTATUSSCATE;
	}
	public CATEGORIES() {
		super();
	}
	public int getIDCATE() {
		return IDCATE;
	}
	public void setIDCATE(int iDCATE) {
		IDCATE = iDCATE;
	}
	public String getNAMEECATE() {
		return NAMEECATE;
	}
	public void setNAMEECATE(String nAMEECATE) {
		NAMEECATE = nAMEECATE;
	}
	public boolean isSTATUSSCATE() {
		return STATUSSCATE;
	}
	public void setSTATUSSCATE(boolean sTATUSSCATE) {
		STATUSSCATE = sTATUSSCATE;
	}
	@Override
	public String toString() {
		return "CATEGORIES [IDCATE=" + IDCATE + ", NAMEECATE=" + NAMEECATE + ", STATUSSCATE=" + STATUSSCATE + "]";
	}
	 
}
