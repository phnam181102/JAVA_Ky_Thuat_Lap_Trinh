package Practices03;

import java.util.Scanner;

public class BaiTap5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m (so hang): ");
        int m = sc.nextInt();
        System.out.print("Nhap n (so cot): ");
        int n = sc.nextInt();


        int[][] a = new int[m][n];
        System.out.println("");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang truoc khi sap xep: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nMang sau khi sap xep: ");
        for (int i = 0; i < m; i++) {
            // i= 2
            for (int j = 0; j < n; j++) {
                //j = 0
                for (int k = j + 1; k < n; k++) {
                    // k = 1
                    if (a[i][k] < a[i][j]) {
                        //a[0][3] < a[0][0]
                        //9 < 1
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
