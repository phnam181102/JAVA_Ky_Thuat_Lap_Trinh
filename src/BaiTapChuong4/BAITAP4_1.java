package BaiTapChuong4;

import java.util.Scanner;

public class BAITAP4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int n = sc.nextInt();

        System.out.print("\nNhap gia tri cho cac phan tu cua mang: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nCac phan tu cua mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nCac phan tu co gia tri le la: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
