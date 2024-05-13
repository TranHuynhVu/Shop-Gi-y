package com.shopgiay.model.imple;

public abstract class ModelDetailBills {
	private double tongDoanhThuTheoNam;

	public ModelDetailBills(double tongDoanhThuTheoNam) {
		super();
		this.tongDoanhThuTheoNam = tongDoanhThuTheoNam;
	}

	public ModelDetailBills() {
		super();
	}

	public double getTongDoanhThuTheoNam() {
		return tongDoanhThuTheoNam;
	}

	public void setTongDoanhThuTheoNam(double tongDoanhThuTheoNam) {
		this.tongDoanhThuTheoNam = tongDoanhThuTheoNam;
	}

	@Override
	public String toString() {
		return "ModelDetailBills [tongDoanhThuTheoNam=" + tongDoanhThuTheoNam + "]";
	}
	
}
