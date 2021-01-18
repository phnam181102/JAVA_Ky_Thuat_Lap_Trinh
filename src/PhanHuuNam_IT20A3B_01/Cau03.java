//De 1_Ky thuat lap trinh_Khuong
package PhanHuuNam_IT20A3B_01;

import java.util.Scanner;

public class Cau03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N (N>=2): ");
        int n = sc.nextInt();
        if (n<2) {
            System.out.println("N khong lop le!");
        } else {
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
}
