package BAITAPCHUONG3;

import java.util.Scanner;

public class BAITAP3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        if (a != 0) {
            System.out.println("X  = " + (float)-b/a);
        } else
            System.out.println("a khong hop le!!!");
    }
}
