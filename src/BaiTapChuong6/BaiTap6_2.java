package BaiTapChuong6;

import java.util.Scanner;

public class BaiTap6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int result = P(n);

        if (n < 0) {
            System.out.println("\nn khong hop le!!!");
        } else
            System.out.println("\n"+result);
    }
    static int P(int n) {
        if (n == 0) {
            return 1;
        } else
            return ((n*2+1)*P(n-1));
    }
}
