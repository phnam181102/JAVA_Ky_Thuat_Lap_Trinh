package VIDU_CHUONG4;

import java.util.Scanner;

public class VIDU4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ": " + array[i]);
        }
    }


}
