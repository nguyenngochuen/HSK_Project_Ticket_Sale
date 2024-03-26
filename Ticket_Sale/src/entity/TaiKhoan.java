package entity;

import java.util.Objects;

public class TaiKhoan {
	private String maTaiKhoan;
	private String useName;
	private String password;
	
	public TaiKhoan() {}
	
	public TaiKhoan(String maTaiKhoan, String useName, String password) {
		super();
		this.maTaiKhoan = maTaiKhoan;
		this.useName = useName;
		this.password = password;
	}
	
	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	public String getuseName() {
		return useName;
	}
	public void setuseName(String useName) {
		this.useName = useName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maTaiKhoan);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		return Objects.equals(maTaiKhoan, other.maTaiKhoan);
	}
	@Override
	public String toString() {
		return "TaiKhoan [maTaiKhoan=" + maTaiKhoan + ", useName=" + useName + ", password=" + password + "]";
	}
	
	
}
