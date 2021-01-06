package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n tu ban phim (n > 2): ");
        int n = sc.nextInt();
        if (n <= 2) {
            System.out.println("n khong hop le!");
        } else {
            if (n %2 ==0) {
                System.out.println("Day la so chan");
            } else {
                System.out.println("Day la so le");
            }
        }
    }
}
