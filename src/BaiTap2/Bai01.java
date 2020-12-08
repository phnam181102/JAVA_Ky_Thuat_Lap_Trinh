package BaiTap2;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("");

        for (int i = 0; i <n; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            a[i] = sc.nextInt();
        }

        boolean check = true;

        if(n%2==0) {
            check = false;
        }

        for (int i = 0; i < (n-i); i++) {
            if (a[i] != a[n-1-i]) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Mang vua nhap la mang doi xung");
        } else {
            System.out.println("Mang vua nhap khong phai la mang doi xung!");
        }
    }
}
