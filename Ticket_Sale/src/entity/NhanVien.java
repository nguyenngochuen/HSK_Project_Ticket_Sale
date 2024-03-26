package entity;

import java.sql.Date;
import java.util.Objects;

public class NhanVien {
	private String ma;
	private String ten;
	private Date ngaySinh;
	private String CCCD;
	private String noiCuTru;
	private String soDienThoai;
	private String trinhDo;
	private String email;
	private Date ngayTuyenDung;
	private Double luong;
	private String boPhan;
	
	
	
	public NhanVien(String ma, String ten, Date ngaySinh, String cCCD, String noiCuTru, String soDienThoai,
			String trinhDo, String email, Date ngayTuyenDung, Double luong, String boPhan) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		CCCD = cCCD;
		this.noiCuTru = noiCuTru;
		this.soDienThoai = soDienThoai;
		this.trinhDo = trinhDo;
		this.email = email;
		this.ngayTuyenDung = ngayTuyenDung;
		this.luong = luong;
		this.boPhan = boPhan;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getCCCD() {
		return CCCD;
	}
	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}
	public String getNoiCuTru() {
		return noiCuTru;
	}
	public void setNoiCuTru(String noiCuTru) {
		this.noiCuTru = noiCuTru;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNgayTuyenDung() {
		return ngayTuyenDung;
	}
	public void setNgayTuyenDung(Date ngayTuyenDung) {
		this.ngayTuyenDung = ngayTuyenDung;
	}
	public Double getLuong() {
		return luong;
	}
	public void setLuong(Double luong) {
		this.luong = luong;
	}
	public String getBoPhan() {
		return boPhan;
	}
	public void setBoPhan(String boPhan) {
		this.boPhan = boPhan;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ma);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(ma, other.ma);
	}
	@Override
	public String toString() {
		return "NhanVien [ma=" + ma + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", CCCD=" + CCCD + ", noiCuTru="
				+ noiCuTru + ", soDienThoai=" + soDienThoai + ", trinhDo=" + trinhDo + ", email=" + email
				+ ", ngayTuyenDung=" + ngayTuyenDung + ", luong=" + luong + ", boPhan=" + boPhan + "]";
	}
	
	
}
