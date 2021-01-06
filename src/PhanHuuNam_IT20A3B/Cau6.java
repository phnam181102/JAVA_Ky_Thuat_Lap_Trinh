package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen tu ban phim: ");
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                answer++;
            }
        }
        if (answer != 0) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }
}
