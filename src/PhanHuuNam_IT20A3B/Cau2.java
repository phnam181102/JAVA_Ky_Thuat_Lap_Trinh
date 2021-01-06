package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a (a>2): ");
        int a = sc.nextInt();
        System.out.print("Nhap b (b>2): ");
        int b = sc.nextInt();
        System.out.print("Nhap c (c>2): ");
        int c = sc.nextInt();
        if (a <= 2 || b <= 2 || c <= 2) {
            System.out.println("a, b, c khong hop le!");
        } else {
            if (a >= b && a >= c) {
                System.out.println(a + " la gia tri lon nhat");
            } else if (b >= a && b >= c) {
                System.out.println(b + " la gia tri lon nhat");
            } else {
                System.out.println(c + " la gia tri lon nhat");
            }
        }
    }
}
