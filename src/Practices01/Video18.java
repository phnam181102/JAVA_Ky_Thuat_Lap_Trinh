package Practices01;

import java.util.Scanner;

//viet phuong thuc trong lap trinh Java
public class Video18 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        checkSNT(n);
    }
}
