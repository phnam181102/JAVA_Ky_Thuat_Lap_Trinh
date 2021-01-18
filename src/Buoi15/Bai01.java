package Buoi15;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200 là:");
        for (int i = 10; i < 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
