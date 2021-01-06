package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println(a+"x"+" + "+b+" = 0 co nghiem x = "+(float)-b/a);
    }
}
