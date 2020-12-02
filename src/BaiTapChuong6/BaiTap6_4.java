package BaiTapChuong6;

import java.util.Scanner;

public class BaiTap6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("n khong hop le !!!");
        } else {
            System.out.print("Dang nhi phan cua "+n+ " la: ");
            NhiPhan(n);
        }
    }
    static void NhiPhan(int n) {
        int phanDu;
        if (n <= 1) {
            System.out.print(n);
            return;
        } else {
            phanDu = n%2;
            NhiPhan(n >> 1);
            System.out.print(phanDu);
        }
    }

}
