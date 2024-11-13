package bai3;

public class Test {
	public static void main(String[] args) {
		DiaChi a=new DiaChi("Due Dong","ttLim","Tien Du","Bac Ninh");
		DiaChi a1=new DiaChi("Due Dong","ttLim","Tien Du","Bac Ninh");
		NhanVien b=new NhanVien("tran duc quan", "05/05/2005",'M',a);
		System.out.println(b);
		b.setName("tran duc hung");System.out.println(b.getName());
		b.setDoc("24/10/2009");System.out.println(b.getDoc());
		b.setGender('F');System.out.println(b.getGender());
		b.setAddress(a1);System.out.println(b.getAddress());
	}

}
