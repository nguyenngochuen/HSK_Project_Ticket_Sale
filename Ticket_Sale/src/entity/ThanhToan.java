package entity;

import java.util.Objects;

import enums.PhuongThucThanhToan;

public class ThanhToan {
	private String maPhieuTT;
	private boolean tinhTrangThanhToan;
	private PhuongThucThanhToan phuongThucThanhToan;
	public ThanhToan(String maPhieuTT, boolean tinhTrangThanhToan, PhuongThucThanhToan phuongThucThanhToan) {
		super();
		this.maPhieuTT = maPhieuTT;
		this.tinhTrangThanhToan = tinhTrangThanhToan;
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public String getMaPhieuTT() {
		return maPhieuTT;
	}
	public void setMaPhieuTT(String maPhieuTT) {
		this.maPhieuTT = maPhieuTT;
	}
	public boolean isTinhTrangThanhToan() {
		return tinhTrangThanhToan;
	}
	public void setTinhTrangThanhToan(boolean tinhTrangThanhToan) {
		this.tinhTrangThanhToan = tinhTrangThanhToan;
	}
	public PhuongThucThanhToan getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhieuTT);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThanhToan other = (ThanhToan) obj;
		return Objects.equals(maPhieuTT, other.maPhieuTT);
	}
	@Override
	public String toString() {
		return "ThanhToan [maPhieuTT=" + maPhieuTT + ", tinhTrangThanhToan=" + tinhTrangThanhToan
				+ ", phuongThucThanhToan=" + phuongThucThanhToan + "]";
	}
	
	
}
