package bai5;

public class Test {
	public static void main(String[] args) {
		Truong a=new Truong("daihoccongnghiepHaNoi","Nhon",".");
		SinhVien b=new SinhVien("Tran Duc Quan", 19, 'M', "2023DHCNTT01", "CNTT", a);
		System.out.println(b);
		a.setTen("HAUI");System.out.println(b.getTruong());
	}
}
