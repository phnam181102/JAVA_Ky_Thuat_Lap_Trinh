package BAITAPCHUONG3;

import java.util.Scanner;

public class BAITAP3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        int max = 0;
        if (a<b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
            System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + max);
        } else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
            System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + max);
        }
    }
}
