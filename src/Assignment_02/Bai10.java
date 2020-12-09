package Assignment_02;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int m = sc.nextInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap gia tri cho phan tu ["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mang truoc khi sap xep: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                for (int k = j + 1; k < m; k++) {
//                    if (a[i][k] < a[i][j]) {
//
//                    }
//                }
//            }
//        }

        System.out.println("\nMang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
