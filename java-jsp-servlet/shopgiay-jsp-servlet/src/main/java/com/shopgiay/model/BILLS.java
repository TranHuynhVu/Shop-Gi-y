package com.shopgiay.model;

import java.sql.Date;

import com.shopgiay.model.imple.ModelBills;

public class BILLS extends ModelBills{
	private int ID;
	private Date DATECHECKIN;
	private Date DATECHECKOUT;
	private String NOTE;
	private boolean PAYMENT_METHODS;
	private int ID_ACCOUNT;
	private int ID_ADDRESS;
	private int ID_SHIP;
	private int ID_SELL_VOUCHER;
	private int ID_STAFF;
	private int ID_STATUS_BILL;
	public BILLS(int iD, Date dATECHECKIN, Date dATECHECKOUT, String nOTE, boolean pAYMENT_METHODS, int iD_ACCOUNT,
			int iD_ADDRESS, int iD_SHIP, int iD_SELL_VOUCHER, int iD_STAFF, int iD_STATUS_BILL) {
		super();
		ID = iD;
		DATECHECKIN = dATECHECKIN;
		DATECHECKOUT = dATECHECKOUT;
		NOTE = nOTE;
		PAYMENT_METHODS = pAYMENT_METHODS;
		ID_ACCOUNT = iD_ACCOUNT;
		ID_ADDRESS = iD_ADDRESS;
		ID_SHIP = iD_SHIP;
		ID_SELL_VOUCHER = iD_SELL_VOUCHER;
		ID_STAFF = iD_STAFF;
		ID_STATUS_BILL = iD_STATUS_BILL;
	}
	public BILLS() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getDATECHECKIN() {
		return DATECHECKIN;
	}
	public void setDATECHECKIN(Date dATECHECKIN) {
		DATECHECKIN = dATECHECKIN;
	}
	public Date getDATECHECKOUT() {
		return DATECHECKOUT;
	}
	public void setDATECHECKOUT(Date dATECHECKOUT) {
		DATECHECKOUT = dATECHECKOUT;
	}
	public String getNOTE() {
		return NOTE;
	}
	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}
	public boolean isPAYMENT_METHODS() {
		return PAYMENT_METHODS;
	}
	public void setPAYMENT_METHODS(boolean pAYMENT_METHODS) {
		PAYMENT_METHODS = pAYMENT_METHODS;
	}
	public int getID_ACCOUNT() {
		return ID_ACCOUNT;
	}
	public void setID_ACCOUNT(int iD_ACCOUNT) {
		ID_ACCOUNT = iD_ACCOUNT;
	}
	public int getID_ADDRESS() {
		return ID_ADDRESS;
	}
	public void setID_ADDRESS(int iD_ADDRESS) {
		ID_ADDRESS = iD_ADDRESS;
	}
	public int getID_SHIP() {
		return ID_SHIP;
	}
	public void setID_SHIP(int iD_SHIP) {
		ID_SHIP = iD_SHIP;
	}
	public int getID_SELL_VOUCHER() {
		return ID_SELL_VOUCHER;
	}
	public void setID_SELL_VOUCHER(int iD_SELL_VOUCHER) {
		ID_SELL_VOUCHER = iD_SELL_VOUCHER;
	}
	public int getID_STAFF() {
		return ID_STAFF;
	}
	public void setID_STAFF(int iD_STAFF) {
		ID_STAFF = iD_STAFF;
	}
	public int getID_STATUS_BILL() {
		return ID_STATUS_BILL;
	}
	public void setID_STATUS_BILL(int iD_STATUS_BILL) {
		ID_STATUS_BILL = iD_STATUS_BILL;
	}
	@Override
	public String toString() {
		return "BILLS [ID=" + ID + ", DATECHECKIN=" + DATECHECKIN + ", DATECHECKOUT=" + DATECHECKOUT + ", NOTE=" + NOTE
				+ ", PAYMENT_METHODS=" + PAYMENT_METHODS + ", ID_ACCOUNT=" + ID_ACCOUNT + ", ID_ADDRESS=" + ID_ADDRESS
				+ ", ID_SHIP=" + ID_SHIP + ", ID_SELL_VOUCHER=" + ID_SELL_VOUCHER + ", ID_STAFF=" + ID_STAFF
				+ ", ID_STATUS_BILL=" + ID_STATUS_BILL + "]";
	}

}
