//https://vi.wikipedia.org/wiki/Gi%E1%BA%A3i_thu%E1%BA%ADt_Euclid

package BaiTapChuong6;

import java.util.Scanner;

public class BaiTap6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("\nNhap b: ");
        int b = sc.nextInt();
        int result = UCLN(a, b);
        System.out.println("\nUCLN = " + result);

    }

//    static int UCLN (int a, int b) {
//        while (a != b) {
//            if (a > b) {
//                a = a-b;
//            } else {
//                b = b-a;
//            }
//        }
//        return a;
//    }
    // Tim uoc chung lon nhat
    static int UCLN (int a, int b) {
        while (a != b) {
            if (a > b) {
                return (UCLN(a-a,b)
            } else {
                b = b-a;
            }
        }
        return a;
    }
}
