package bai4;

import java.util.Scanner;

public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;
	public Nguoi () {
		this.ten="No Name";
		this.tuoi=0;
		this.gioiTinh='M';
	}
	public Nguoi (String ten, int tuoi, char gioiTinh) {
		this.ten=ten;
		this.tuoi=tuoi;
		this.gioiTinh=gioiTinh;
	}
	public void setTen (String ten) {
		this.ten=ten;
	}
	public void setTuoi (int  tuoi) {
		this.tuoi=tuoi;
	}
	public void setGT (char  gioiTinh) {
		this.gioiTinh=gioiTinh;
	}
	public String getTen() {
		return this.ten;
	}
	public int getTuoi() {
		return this.tuoi;
	}
	public char gioiTinh() {
		return this.gioiTinh;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.println("nhap ten : ");
		this.ten=sc.nextLine();
		System.out.println("nhap tuoi: ");
		this.tuoi=sc.nextInt();
		sc.nextLine();
		System.out.println("nhap gioi tinh : ");
		String input=sc.nextLine();
		this.gioiTinh=input.charAt(0);
	}
	public String toString() {
		return "ten: "+this.ten+"\n"+"tuoi:  "+this.tuoi+"\n"+"gioi tinh:  "+this.gioiTinh+"\n";
	}
	
}
