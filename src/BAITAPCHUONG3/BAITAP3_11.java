package BaiTapChuong3;

import java.util.Scanner;

public class BAITAP3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu ban phim: ");
        int n = sc.nextInt();
        int check = 0;
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                check++;
            }
        }
        if (check != 0) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }
}
