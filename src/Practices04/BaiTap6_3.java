package Practices04;

import java.util.Scanner;

public class BaiTap6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (voi n>0) : ");
        int n = sc.nextInt();

        float result = P(n);
        if (n < 0) {
            System.out.println("\nn khong hop le!!!");
        } else
            System.out.println("\n"+result);

    }
    static float P(int n) {
        if (n == 1) {
            return 1;
        } else {
            return ((float)1/n+P(n-1));
        }
    }
}
