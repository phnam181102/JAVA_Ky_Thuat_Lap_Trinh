package VIDU_CHUONG4;

import java.util.Scanner;

public class VIDU4_7 {
    public static void main(String[] args) {
        int m, n;
        int soPhanTu0 = 0; // số phần tử = 0 trong ma trận
        int soPhanTuKhac0 = 0; // số phần tử khác 0 trong ma trận
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            m = scanner.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = scanner.nextInt();
        } while (m < 1 || n < 1);

        int A[][] = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (A[i][j] == 0) {
                    soPhanTu0++;
                } else {
                    soPhanTuKhac0++;
                }
            }
        }

        if (soPhanTu0 > soPhanTuKhac0) {
            System.out.println("Ma trận vừa nhập là ma trận thưa");
        } else {
            System.out.println("Ma trận vừa nhập là ma trận không thưa");
        }
    }
}
