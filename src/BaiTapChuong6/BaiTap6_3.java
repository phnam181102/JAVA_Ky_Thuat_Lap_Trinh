package BaiTapChuong6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BaiTap6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float result = P(n);
        System.out.println("\n"+result);
    }
    static float P(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (1/n+P(n-1));
        }
    }
}
