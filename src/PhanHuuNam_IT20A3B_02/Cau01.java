////De 2_Ky thuat lap trinh_Tuan
package PhanHuuNam_IT20A3B_02;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
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
