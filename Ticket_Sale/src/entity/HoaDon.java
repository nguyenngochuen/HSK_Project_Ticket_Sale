package entity;

import java.sql.Date;
import java.util.Objects;

public class HoaDon {
	private String maHoaDon;
	private String gia;
	private Date ngayXuatHD;
	public HoaDon(String maHoaDon, String gia, Date ngayXuatHD) {
		super();
		this.maHoaDon = maHoaDon;
		this.gia = gia;
		this.ngayXuatHD = ngayXuatHD;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public Date getNgayXuatHD() {
		return ngayXuatHD;
	}
	public void setNgayXuatHD(Date ngayXuatHD) {
		this.ngayXuatHD = ngayXuatHD;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHoaDon);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHoaDon, other.maHoaDon);
	}
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", gia=" + gia + ", ngayXuatHD=" + ngayXuatHD + "]";
	}
	
	
}
