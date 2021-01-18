package Buoi15;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố có 5 chữ số là: ");
        int count = 0;
        for (int i = 10000; i < 99999; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
            count = 0;
        }
    }
}
