package BaiTapChuong6;

import java.util.Scanner;

public class BaiTap6_1 {
    public static void main(String[] args) {
        // Nhap a, b
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("\nNhap b: ");
        int b = sc.nextInt();

        //gan va in ket qua
        int result = UCLN(a, b);
        if (a < 0 || b < 0) {
            System.out.println("\na hoac b khong hop le!!!");
        } else
            System.out.println("\nUCLN = " + result);
    }

    // Tim uoc chung lon nhat
    //Tai lieu tham khao:  https://vi.wikipedia.org/wiki/Gi%E1%BA%A3i_thu%E1%BA%ADt_Euclid
    static int UCLN (int a, int b) {
        while (a != b) {
            if (a > b) {
                return (UCLN(a-b,b));
            } else {
                return (UCLN(a, b-a));
            }
        }
        return a;
    }
}
