package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu ban phim: ");
        int n = sc.nextInt();
        int dem = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            System.out.println(n + " la so nguyen to");
        } else System.out.println(n + " khong phai la so nguyen to");
    }
}
