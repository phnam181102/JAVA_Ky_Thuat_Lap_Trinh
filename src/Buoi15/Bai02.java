package Buoi15;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(tinhGiaithua(n));
    }

    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
}
