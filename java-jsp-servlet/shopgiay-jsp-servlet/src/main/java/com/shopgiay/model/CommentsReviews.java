package com.shopgiay.model;

public class CommentsReviews extends ACCOUNTS{
	private int IDCR;
	private int RATE;
	private String DETAILCR;
	private int IDDFSHOE;
	private int IDACC;
	public CommentsReviews(int iDCR, int rATE, String dETAILCR, int iDDFSHOE, int iDACC) {
		super();
		IDCR = iDCR;
		RATE = rATE;
		DETAILCR = dETAILCR;
		IDDFSHOE = iDDFSHOE;
		IDACC = iDACC;
	}
	public CommentsReviews() {
		super();
	}
	public int getIDCR() {
		return IDCR;
	}
	public void setIDCR(int iDCR) {
		IDCR = iDCR;
	}
	public int getRATE() {
		return RATE;
	}
	public void setRATE(int rATE) {
		RATE = rATE;
	}
	public String getDETAILCR() {
		return DETAILCR;
	}
	public void setDETAILCR(String dETAILCR) {
		DETAILCR = dETAILCR;
	}
	public int getIDDFSHOE() {
		return IDDFSHOE;
	}
	public void setIDDFSHOE(int iDDFSHOE) {
		IDDFSHOE = iDDFSHOE;
	}
	public int getIDACC() {
		return IDACC;
	}
	public void setIDACC(int iDACC) {
		IDACC = iDACC;
	}
	@Override
	public String toString() {
		return "CommentsReviews [IDCR=" + IDCR + ", RATE=" + RATE + ", DETAILCR=" + DETAILCR + ", IDDFSHOE=" + IDDFSHOE
				+ ", IDACC=" + IDACC + "]";
	}
	
}
