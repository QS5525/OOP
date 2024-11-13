package bai9;

import bai8.Shape;
import bai8.Rectangle;
import bai8.Triangle;

public class Test {
	public static void main(String[] args) {
		Shape a[] = new Shape[5];
		a[0] = new Rectangle("xam",12, 14);
		a[1] = new Rectangle("camm",5, 9);
		a[2] = new Rectangle("nau",4, 6);
		a[3] = new Triangle("hong",5, 7);
		for(Shape s: a) {
			if(s instanceof Rectangle)
			{
				System.out.println(s);
				System.out.println(s.getArea());
			}
		}
	}
}
