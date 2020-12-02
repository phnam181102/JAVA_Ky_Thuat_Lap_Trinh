package VIDU_CHUONG4;

import java.util.Scanner;

public class VIDU4_8 {
    public static void main(String[] args) {
        int n;
        int kt = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số bậc của ma trận: ");
            n = scanner.nextInt();
        } while (n < 1);

        int[][] A = new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i][j] == A[j][i]) {
                    kt = 1;
                } else {
                    kt = 0;
                }
            }
        }
        if (kt == 1) {
            System.out.println("Ma trận vừa nhập là ma trận đối xứng");
        } else {
            System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
        }
    }
}
