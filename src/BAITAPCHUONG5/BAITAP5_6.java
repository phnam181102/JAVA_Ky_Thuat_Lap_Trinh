package BAITAPCHUONG5;

import java.util.Scanner;

public class BAITAP5_6 {
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

        System.out.println("\nMang vua nhap la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            System.out.print("Gia tri lon nhat hang "+ (i+1)+ " la: ");
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }
    }
}
