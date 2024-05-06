package com.shopgiay.model;

public class Model_Shoes {
	private String SIZE;
	private String COLOR;
	private String NAME;
	
	public Model_Shoes() {
		super();
	}
	public Model_Shoes(String SIZE, String COLOR, String NAME) {
		this.SIZE = SIZE;
		this.COLOR = COLOR;
		this.NAME = NAME;
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
