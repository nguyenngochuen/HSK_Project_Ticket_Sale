package entity;

import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

public class Ve {
	private String maVe;
	private Date ngayLayVe;
	private Date ngayNhanVe;
	private String maKhachHang;
	private String tenPhim;
	private String suatChieu;
	private Ghe[] danhSachGhe;
	private PhongChieu phongChieu;
	
	public Ve(String maVe, Date ngayLayVe, Date ngayNhanVe, String maKhachHang, String tenPhim, String suatChieu,
			Ghe[] danhSachGhe, PhongChieu phongChieu) {
		super();
		this.maVe = maVe;
		this.ngayLayVe = ngayLayVe;
		this.ngayNhanVe = ngayNhanVe;
		this.maKhachHang = maKhachHang;
		this.tenPhim = tenPhim;
		this.suatChieu = suatChieu;
		this.danhSachGhe = danhSachGhe;
		this.phongChieu = phongChieu;
	}
	
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public Date getNgayLayVe() {
		return ngayLayVe;
	}
	public void setNgayLayVe(Date ngayLayVe) {
		this.ngayLayVe = ngayLayVe;
	}
	public Date getNgayNhanVe() {
		return ngayNhanVe;
	}
	public void setNgayNhanVe(Date ngayNhanVe) {
		this.ngayNhanVe = ngayNhanVe;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getSuatChieu() {
		return suatChieu;
	}
	public void setSuatChieu(String suatChieu) {
		this.suatChieu = suatChieu;
	}
	public Ghe[] getDanhSachGhe() {
		return danhSachGhe;
	}
	public void setDanhSachGhe(Ghe[] danhSachGhe) {
		this.danhSachGhe = danhSachGhe;
	}
	public PhongChieu getPhongChieu() {
		return phongChieu;
	}
	public void setPhongChieu(PhongChieu phongChieu) {
		this.phongChieu = phongChieu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maVe);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ve other = (Ve) obj;
		return Objects.equals(maVe, other.maVe);
	}
	@Override
	public String toString() {
		return "Ve [maVe=" + maVe + ", ngayLayVe=" + ngayLayVe + ", ngayNhanVe=" + ngayNhanVe + ", maKhachHang="
				+ maKhachHang + ", tenPhim=" + tenPhim + ", suatChieu=" + suatChieu + ", danhSachGhe="
				+ Arrays.toString(danhSachGhe) + ", phongChieu=" + phongChieu + "]";
	}
	
	
}
