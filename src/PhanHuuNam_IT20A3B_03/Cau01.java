//De 2_Ky thuat lap trinh_Khuong
package PhanHuuNam_IT20A3B_03;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
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
