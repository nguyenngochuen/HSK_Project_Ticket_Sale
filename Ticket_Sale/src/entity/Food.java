package entity;

import java.util.Objects;

public class Food {
	private String maFood;
	private String giaFood;
	private String tenFood;
	private int soLuong;
	
	public Food(String maFood, String giaFood, String tenFood, int soLuong) {
		super();
		this.maFood = maFood;
		this.giaFood = giaFood;
		this.tenFood = tenFood;
		this.soLuong = soLuong;
	}
	
	public String getMaFood() {
		return maFood;
	}
	public void setMaFood(String maFood) {
		this.maFood = maFood;
	}
	public String getGiaFood() {
		return giaFood;
	}
	public void setGiaFood(String giaFood) {
		this.giaFood = giaFood;
	}
	public String getTenFood() {
		return tenFood;
	}
	public void setTenFood(String tenFood) {
		this.tenFood = tenFood;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maFood);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(maFood, other.maFood);
	}

	@Override
	public String toString() {
		return "Food [maFood=" + maFood + ", giaFood=" + giaFood + ", tenFood=" + tenFood + ", soLuong=" + soLuong
				+ "]";
	}
	
	
}
