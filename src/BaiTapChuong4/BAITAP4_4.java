package BaiTapChuong4;

import java.util.Scanner;

public class BAITAP4_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.println("");
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + i + "]" + "[" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Cac gia tri cua duong cheo chinh la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}


