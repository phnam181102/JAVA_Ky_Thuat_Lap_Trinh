package Assignment_02;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập các input đề yêu cầu
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        int l = n+m;
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[l];
        System.out.print("Nhap p: ");
        int p = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap gia tri cho phan tu b["+i+"]: ");
            b[i] =sc.nextInt();
        }

        //in ra màn hình 2 mảng vừa nhập
        System.out.print("\nMang a: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nMang b: ");
        for (int i = 0; i < m; i++) {
            System.out.print(b[i]+" ");
        }

        for (int i = 0; i < l; i++) {
            if(i<n && i<p) {
                c[i] = a[i];
            } else if (i>=p && i<p+m) {
                c[i] = b[i-p];
            } else {
                c[i] = a[i-m];
            }
        }

        //in ra màn hình kết quả
        System.out.println("");
        for (int i = 0; i < l; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
