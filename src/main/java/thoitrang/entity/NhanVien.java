package thoitrang.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "nhanvien")
public class NhanVien {
	@Id
	int idNhanVien;
	String tenNhanVien;
	int tuoi;
	String diaChi;

	
	public int getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public NhanVien( String tenNhanVien, int tuoi, String diaChi) {
		super();
	
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}

	public NhanVien(String tenNhanVien, int tuoi) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
	}
	public NhanVien() {
		super();
	}
	
	

}
