package BAITAPCHUONG3;

import java.util.Scanner;

public class BAITAP3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println("\nTong cac so chan tu 0 den " + n + " la: " + sum);
    }
}
