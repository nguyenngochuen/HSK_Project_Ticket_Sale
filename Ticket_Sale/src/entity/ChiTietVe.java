package entity;

public class ChiTietVe {
	private double giamGia;

	public ChiTietVe(double giamGia) {
		super();
		this.giamGia = giamGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	@Override
	public String toString() {
		return "ChiTietVe [giamGia=" + giamGia + "]";
	}
	
	
}
