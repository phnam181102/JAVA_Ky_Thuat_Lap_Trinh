//De 2_Ky thuat lap trinh_Tuan
package PhanHuuNam_IT20A3B_04;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
    }
}
