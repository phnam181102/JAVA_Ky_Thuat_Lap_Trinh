package Buoi15;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhap xau s2: ");
        String s2 = sc.nextLine();
        if (s1.contains(s2)) {
            System.out.println("Xau s1 chua xau s2");
        } else {
            System.out.println("Xau s1 khong chua xau s2");
        }
    }
}
