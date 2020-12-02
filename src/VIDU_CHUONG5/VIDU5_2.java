package VIDU_CHUONG5;

import java.util.Scanner;

public class VIDU5_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println("");
        int[] a = new int[n];
        for (int i = 0; i<n ; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            a[i] = sc.nextInt();
        }

        int min = a[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (min > a[j]) {
                    min = a[j];
                }
            }
        }
    }
}
