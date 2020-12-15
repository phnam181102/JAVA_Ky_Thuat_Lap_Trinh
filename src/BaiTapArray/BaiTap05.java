package BaiTapArray;

import java.util.Scanner;

public class BaiTap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            a[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Cac so nguyen to trong mang a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(a[i] + " ");
            }
            count = 0;
        }
    }
}
