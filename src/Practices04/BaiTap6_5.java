package Practices04;

import java.util.Scanner;

public class BaiTap6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        if (n<0) {
            System.out.println("\nn khong hop le!!!");
        } else {
            System.out.println("\n"+n+" co "+DemChuSo(n)+" chu so");
        }
    }
    static int DemChuSo(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + DemChuSo(n/10);
        }
    }
}
