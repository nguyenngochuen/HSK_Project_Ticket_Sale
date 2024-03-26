package entity;

import java.util.Objects;

import enums.TrangThai;

public class Phim {
	private String maPhim;
	private String tenPhim;
	private TrangThai trangThai;
	private double gia;
	private String theLoai;
	
	public Phim(String maPhim, String tenPhim, TrangThai trangThai, double gia, String theLoai) {
		super();
		this.maPhim = maPhim;
		this.tenPhim = tenPhim;
		this.trangThai = trangThai;
		this.gia = gia;
		this.theLoai = theLoai;
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public TrangThai getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(maPhim);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phim other = (Phim) obj;
		return Objects.equals(maPhim, other.maPhim);
	}
	@Override
	public String toString() {
		return "Phim [maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", trangThai=" + trangThai + ", gia=" + gia
				+ ", theLoai=" + theLoai + "]";
	}
	
	
	
}
