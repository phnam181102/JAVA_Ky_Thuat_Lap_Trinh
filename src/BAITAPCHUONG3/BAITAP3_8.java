package BaiTapChuong3;

import java.util.Scanner;

public class BAITAP3_8 {

    //cau a
    public static void checkSNT(int n) {
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            System.out.println(n + " la so nguyen to");
        } else System.out.println(n + " khong phai la so nguyen to");
    }

    //cau b
    public static void uocSo(int n) {
        int dem1 = 0;
        System.out.print("Cac uoc so cua " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                dem1++;
            }
            if (dem1 == 0 ) System.out.println(dem1);
        }
        System.out.println("\nSo cac uoc so cua " + n + " la: " + dem1);
    }

    //cau c
    public static void print(int n) {
        System.out.print("Cac uoc so la so nguyen to cua " + n + " la: ");
        int dem2 = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (n % j == 0) {
                        dem2++;
                    }
                    if (dem2 == 2 ) {
                        System.out.print(i + " ");
                        break;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        checkSNT(n);
        uocSo(n);
        print(n);
    }
}
