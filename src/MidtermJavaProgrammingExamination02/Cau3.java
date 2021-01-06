package MidtermJavaProgrammingExamination02;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == a[viTriMaxInt(a, n)]) {
                System.out.println("Phan tu thu " + i + " lon nhat trong mang, A[" + i + "]= " + a[i]);
            }
            if (a[i] == a[viTriMax2(a, n)]) {
                System.out.println("Phan tu thu " + i + " lon thu 2 trong mang, A[" + i + "]= " + a[i]);
            }
        }
        sapXep(a, n);
        chenSoNguyen(n, a, sc);
    }

    public static int viTriMaxInt(int a[], int n) {
        int max = a[0];
        int key = 0;
        for (int j = 0; j < n; j++) {
            if (max < a[j]) {
                max = a[j];
                key = j;
            }
        }
        return (key);
    }

    public static int viTriMax2(int[] a, int n) {
        int i, key = 0, Max2 = 0;
        for (i = 0; i < n; i++) {
            if (a[i] > Max2 && a[i] != a[viTriMaxInt(a, n)]) {
                Max2 = a[i];
                key = i;
            }
        }
        return (key);
    }

    static void sapXep(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nMang A sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void chenSoNguyen(int n, int[] a, Scanner sc) {
        System.out.println("\nNhap so nguyen x can chen: ");
        int x = sc.nextInt();
        for (int i = 1; i < n-1; i++) {
            if (x <= a[i - 1] && x >= a[i]) {
                for (int j = n; j > i; j--) {
                    a[j] = a[j - 1];
                }
                a[i] = x;
                break;
            }
        }
        System.out.println("Mang sau khi chen so nguyen x: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

