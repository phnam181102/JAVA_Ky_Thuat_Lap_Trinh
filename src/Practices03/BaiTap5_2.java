package Practices03;

import java.util.Scanner;

public class BaiTap5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri muon tim kiem: ");
        int check = sc.nextInt();

        System.out.print(check+" nam o vi tri: ");
        for (int i = 0; i < n; i++) {
            if(check == a[i]) {
                System.out.print((i) + " ");
            }
        }

    }
}
