package Assignment_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap gia tri cho phan tu ["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMa tran vua nhap la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Ma tran sau khi chuyen vi la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
