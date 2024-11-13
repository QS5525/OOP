package bai2;

public class Test {
	public static void main(String[] args) {
		DiaChi a=new DiaChi("Due Dong","ttLim","Tien DU","Bac Ninh");
		System.out.println(a);
		a.setThon("Due Dong");System.out.println(a.getThon());
		a.setXa("ttLim");System.out.println(a.getXa());
		a.setHuyen("Tien Du");System.out.println(a.getHuyen());
		a.setTinh("Bac Ninh");System.out.println(a.getTinh());
	}
}
