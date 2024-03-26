package entity;

import java.sql.Time;
import java.util.Objects;

public class SuatChieu {
	private Time thoiGianBatDau;
	private Time thoiGianKetThuc;
	
	
	public SuatChieu(Time thoiGianBatDau, Time thoiGianKetThuc) {
		super();
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
	public Time getThoiGianBatDau() {
		return thoiGianBatDau;
	}
	public void setThoiGianBatDau(Time thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}
	public Time getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	public void setThoiGianKetThuc(Time thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(thoiGianBatDau, thoiGianKetThuc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuatChieu other = (SuatChieu) obj;
		return Objects.equals(thoiGianBatDau, other.thoiGianBatDau)
				&& Objects.equals(thoiGianKetThuc, other.thoiGianKetThuc);
	}
	@Override
	public String toString() {
		return "SuatChieu [thoiGianBatDau=" + thoiGianBatDau + ", thoiGianKetThuc=" + thoiGianKetThuc + "]";
	}
	
	
	
}
