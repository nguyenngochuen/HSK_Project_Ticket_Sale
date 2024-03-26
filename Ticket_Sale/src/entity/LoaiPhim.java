package entity;

import java.util.Objects;

import enums.DoiTuong;

public class LoaiPhim {
	private String tenLoai;
	private DoiTuong doiTuong;
	
	
	public LoaiPhim(String tenLoai, DoiTuong doiTuong) {
		super();
		this.tenLoai = tenLoai;
		this.doiTuong = doiTuong;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public DoiTuong getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(DoiTuong doiTuong) {
		this.doiTuong = doiTuong;
	}
	@Override
	public int hashCode() {
		return Objects.hash(tenLoai);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiPhim other = (LoaiPhim) obj;
		return Objects.equals(tenLoai, other.tenLoai);
	}
	@Override
	public String toString() {
		return "LoaiPhim [tenLoai=" + tenLoai + ", doiTuong=" + doiTuong + "]";
	}
	
	
}
