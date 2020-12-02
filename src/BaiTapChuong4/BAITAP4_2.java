package BaiTapChuong4;

import java.util.Scanner;

public class BAITAP4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong cua mang: ");
        int n = sc.nextInt();
        System.out.print("\nNhap so cot cua mang: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + i + "]" + "[" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Tong gia tri cua hang " + i + " la: ");
            for (int a = 0; a < m; a++) {
                sum += arr[i][a];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
