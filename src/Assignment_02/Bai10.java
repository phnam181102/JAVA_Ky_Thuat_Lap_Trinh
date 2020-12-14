//Hướng giải quyết là chuyển đổi mảng 2 chiều sang thành mảng 1 chiều rồi sắp xếp lại nó.
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
        int[] arrMotChieu = new int[n*m];

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

        int l = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arrMotChieu[l] = a[i][j];
                l++;
            }
        }

        for (int i = 0; i < n*m; i++) {
            for (int j = i+1; j < n*m; j++) {
                if (arrMotChieu[i] > arrMotChieu[j]) {
                    int temp = arrMotChieu[i];
                    arrMotChieu[i] = arrMotChieu[j];
                    arrMotChieu[j] = temp;
                }
            }
        }

        System.out.println("\nMang sau khi sap xep: ");
        l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arrMotChieu[l++] + " ");
            }
            System.out.println("");
        }

    }
}
