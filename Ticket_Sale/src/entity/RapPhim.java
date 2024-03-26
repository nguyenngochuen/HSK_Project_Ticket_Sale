package entity;

import java.util.Objects;

public class RapPhim {
	private String maRap;
	private String tenRap;
	private String diaChi;
	private String soDienThoai;
	
	public RapPhim(String maRap, String tenRap, String diaChi, String soDienThoai) {
		super();
		this.maRap = maRap;
		this.tenRap = tenRap;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public String getMaRap() {
		return maRap;
	}

	public void setMaRap(String maRap) {
		this.maRap = maRap;
	}

	public String getTenRap() {
		return tenRap;
	}

	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maRap);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RapPhim other = (RapPhim) obj;
		return Objects.equals(maRap, other.maRap);
	}

	@Override
	public String toString() {
		return "RapPhim [maRap=" + maRap + ", tenRap=" + tenRap + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai
				+ "]";
	}
	
	
	
}
