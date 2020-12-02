package BaiTapChuong4;

import java.util.Scanner;

public class BAITAP4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do rong cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            arr[i] = sc.nextInt();

        }

        System.out.println("\nMang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int test = 0;
        System.out.print("\nCac so chinh phuong cua mang la: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++)
            if(j*j == arr[i]) {
                System.out.print(arr[i] + " ");
                test++;
            }
        }
        if (test == 0) {
            System.out.print("khong co");
        }
    }
}
