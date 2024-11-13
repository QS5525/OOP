package bai8;

public class Test {
	public static void main(String[] args) {
		Shape a[]=new Shape [2];
		a[0]=new Rectangle("den",3,5);
		a[1]=new Triangle("xam",3,5);
		System.out.println(a[0]);
		System.out.println(a[0].getArea());
		System.out.println(a[1]);
		System.out.println(a[1].getArea());
	}
}
