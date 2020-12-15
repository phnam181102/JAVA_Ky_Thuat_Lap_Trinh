package BaiTapArray;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }


        int count = 0;
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
                if (a[i][j] % 2 != 0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("So phan tu la so le: " + count);
    }
}
