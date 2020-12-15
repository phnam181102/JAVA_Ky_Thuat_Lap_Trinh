package BaiTapArray;

import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nCac phan tu co gia tri chan la: ");
        for (int i = 0; i < n; i++) {
            if (a[i]%2==0) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
