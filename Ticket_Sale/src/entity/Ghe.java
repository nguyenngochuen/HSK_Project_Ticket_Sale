package entity;

import java.util.Objects;

import enums.LoaiGhe;

public class Ghe {
	private String maGhe;
	private LoaiGhe loaiGhe;
	private double giaGhe;
	public Ghe(String maGhe, LoaiGhe loaiGhe, double giaGhe) {
		super();
		this.maGhe = maGhe;
		this.loaiGhe = loaiGhe;
		this.giaGhe = giaGhe;
	}
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public LoaiGhe getLoaiGhe() {
		return loaiGhe;
	}
	public void setLoaiGhe(LoaiGhe loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	public double getGiaGhe() {
		return giaGhe;
	}
	public void setGiaGhe(double giaGhe) {
		this.giaGhe = giaGhe;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maGhe);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ghe other = (Ghe) obj;
		return Objects.equals(maGhe, other.maGhe);
	}
	@Override
	public String toString() {
		return "Ghe [maGhe=" + maGhe + ", loaiGhe=" + loaiGhe + ", giaGhe=" + giaGhe + "]";
	}
	
	
}
