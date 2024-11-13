package bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so benh nhan");
        int n=sc.nextInt();
        sc.nextLine();
        BenhNhan a[]=new BenhNhan[n];
        for (int i=0;i<n;i++) {
        a[i] = new BenhNhan();
        System.out.println("Nhập thông tin bệnh nhân:");
        a[i].nhapThongTin(sc);
        System.out.println("\nThông tin bệnh nhân:");
        System.out.println(a[i]);
        }
        sc.close();
        a[0].setTen("Tran Duc Quan");System.out.println(a[0].getTen());
    }
}
