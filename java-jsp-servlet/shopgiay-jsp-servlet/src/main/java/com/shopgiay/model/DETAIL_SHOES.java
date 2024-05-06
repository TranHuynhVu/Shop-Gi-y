package com.shopgiay.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DETAIL_SHOES extends Model_Shoes{
	private int ID;
	private int ID_SHOE;
	private double PRICE;
	private int COUNTT;
 	

	public DETAIL_SHOES(String SIZE, String COLOR, String NAME, int iD, int iD_SHOE, double PRICE, int COUNTT) {
		super(SIZE, COLOR, NAME);
		this.ID = iD;
		this.ID_SHOE = iD_SHOE;
		this.PRICE = PRICE;
		this.COUNTT = COUNTT;
	}

	public DETAIL_SHOES() {
		super();
	}

	public DETAIL_SHOES(int iD, int iD_SHOE, double pRICE, int cOUNTT) {
		ID = iD;
		ID_SHOE = iD_SHOE;
		PRICE = pRICE;
		COUNTT = cOUNTT;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getID_SHOE() {
		return ID_SHOE;
	}
	public void setID_SHOE(int iD_SHOE) {
		ID_SHOE = iD_SHOE;
	}
	public double getPRICE() {
		return PRICE;
	}
	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}
	public int getCOUNTT() {
		return COUNTT;
	}
	public void setCOUNTT(int cOUNTT) {
		COUNTT = cOUNTT;
	}

	@Override
	public String toString() {
		return "DETAIL_SHOES [ID=" + ID + ", ID_SHOE=" + ID_SHOE + ", PRICE=" + PRICE + ", COUNTT=" + COUNTT
				+ ", getSIZE()=" + getSIZE() + ", getCOLOR()=" + getCOLOR() + ", getNAME()=" + getNAME() + "]";
	}
	


	
}