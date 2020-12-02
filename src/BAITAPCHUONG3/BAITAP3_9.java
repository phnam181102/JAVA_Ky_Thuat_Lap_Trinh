package BaiTapChuong3;

import java.util.Scanner;

public class BAITAP3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap 1 so nguyen: ");
        int n = sc.nextInt();

        float sum = 1;
        int giai_thua = 1;
        int mau = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j > 1 ; j--) {
                giai_thua *= j;
            }
            mau += giai_thua;
            giai_thua = 1;
            sum += (float)1/(mau);
        }
        System.out.println("S = " + sum);
    }
}
