package com.shopgiay.model;

public class Model_Shoes {
	private String SIZE;
	private String COLOR;
	private String NAME;
	private String IMAGE;
	

	public String getIMAGE() {
		return IMAGE;
	}
	public void setIMAGE(String image) {
		this.IMAGE = image;
	}
	public Model_Shoes() {
		super();
	}


	public Model_Shoes(String sIZE, String cOLOR, String nAME, String iMAGE) {
		super();
		SIZE = sIZE;
		COLOR = cOLOR;
		NAME = nAME;
		IMAGE = iMAGE;

	}
	public String getSIZE() {
		return SIZE;
	}
	public void setSIZE(String sIZE) {
		SIZE = sIZE;
	}
	public String getCOLOR() {
		return COLOR;
	}
	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
}
