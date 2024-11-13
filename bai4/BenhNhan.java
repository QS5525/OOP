package bai4;

import java.util.Scanner;

public class BenhNhan extends Nguoi{
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;
	public BenhNhan() {
		super();
	}
	public BenhNhan(String ten,int tuoi,char gioiTinh,String tienSu, String chuanDoan,BenhVien benhVien ) {
		super(ten,tuoi,gioiTinh);
		this.tienSu=tienSu;
		this.chuanDoan=chuanDoan;
		this.benhVien=benhVien;
	}
	public void setTienSu(String tienSu) {
		this.tienSu=tienSu;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan=chuanDoan;
	}
	public void setBV(BenhVien benhVien ){
		this.benhVien=benhVien;
	}
	public String getTienSu() {
		return this.tienSu;
	}public String getChuanDoan() {
		return this.chuanDoan;
	}public BenhVien getBV() {
		return this.benhVien;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("nhap tien su : ");
		this.tienSu=sc.nextLine();
		System.out.println("nhap chuan doan : ");
		this.chuanDoan=sc.nextLine();
		this.benhVien=new BenhVien();
		this.benhVien.nhapThongTin(sc);
		
	}
	public String toString() {
        return super.toString() + 
               "\nTiền sử: " + tienSu + 
               "\nChẩn đoán: " + chuanDoan + 
               "\nThông tin bệnh viện:\n" + benhVien.toString();
    }
}
