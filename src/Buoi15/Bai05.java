package Buoi15;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float sum = 1;
        int gt = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                gt *= j;
            }

            sum += (float)i/gt;

            gt = 1;
        }
        System.out.println("S = " + sum);
    }
}
