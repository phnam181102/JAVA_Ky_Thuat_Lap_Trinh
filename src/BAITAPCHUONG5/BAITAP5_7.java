package BAITAPCHUONG5;

import java.util.Scanner;

public class BAITAP5_7 {
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

        System.out.println("\nMang truoc khi hoan vi: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nMang sau khi hoan vi: ");
        for (int j = 0; j < n; j++) {
            int temp = a[1][j];
            a[1][j] = a[2][j];
            a[2][j] = temp;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
