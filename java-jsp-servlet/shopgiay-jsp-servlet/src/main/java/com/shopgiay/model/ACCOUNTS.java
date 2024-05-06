package com.shopgiay.model;

public class ACCOUNTS {
		private int ID;
	    private String NAMEE;
	    private String PASSWORDD;
	    private String EMAIL;
	    private String PHONE;
	    private int STATUSS; 
	    private String POSITION;
	    private int ID_ADDRESS;
	    
		public ACCOUNTS() {

		}

		public String getPASSWORDD() {
			return PASSWORDD;
		}

		public void setPASSWORDD(String pASSWORDD) {
			PASSWORDD = pASSWORDD;
		}

		public String getPOSITION() {
			return POSITION;
		}

		public void setPOSITION(String pOSITION) {
			POSITION = pOSITION;
		}

		public ACCOUNTS(int iD, String nAMEE, String pASSWORDD, String eMAIL, String pHONE, int sTATUSS,
				String pOSITION, int iD_ADDRESS) {
			super();
			ID = iD;
			NAMEE = nAMEE;
			PASSWORDD = pASSWORDD;
			EMAIL = eMAIL;
			PHONE = pHONE;
			STATUSS = sTATUSS;
			POSITION = pOSITION;
			ID_ADDRESS = iD_ADDRESS;
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

		public String getEMAIL() {
			return EMAIL;
		}

		public void setEMAIL(String eMAIL) {
			EMAIL = eMAIL;
		}

		public String getPHONE() {
			return PHONE;
		}

		public void setPHONE(String pHONE) {
			PHONE = pHONE;
		}

		public int getSTATUSS() {
			return STATUSS;
		}

		public void setSTATUSS(int sTATUSS) {
			STATUSS = sTATUSS;
		}

		public int getID_ADDRESS() {
			return ID_ADDRESS;
		}

		public void setID_ADDRESS(int iD_ADDRESS) {
			ID_ADDRESS = iD_ADDRESS;
		}

		@Override
		public String toString() {
			return "ACCOUNTS [NAMEE=" + NAMEE + ", EMAIL=" + EMAIL + ", PHONE=" + PHONE + ", STATUSS=" + STATUSS
					+ ", ID_ADDRESS=" + ID_ADDRESS + "]";
		}

}
