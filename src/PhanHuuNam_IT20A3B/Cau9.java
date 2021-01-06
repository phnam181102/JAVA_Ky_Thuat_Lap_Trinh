package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            A[i] = sc.nextInt();
        }
        dem1(n, A);
        max(n, A);
        check(n, A, sc);
        dem2(n, A);
        tachPhanTu(n, A);
    }

    static void dem1(int n, int[] A) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 2 != 0) {
                dem++;
            }
        }
        System.out.println("\nMang A co " + dem + " phan tu chia het cho 3 & khong chia het cho 2");
    }

    static void max(int n, int[] A) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("\nGia tri lon nhat mang A la: " + max);
    }

    static void check(int n, int[] A, Scanner sc) {
        System.out.print("\nNhap gia tri X can tim: ");
        int x = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (A[i] == x) {
                check = true;
            }
        }
        if (check) {
            System.out.println(x + " ton tai trong mang A");
        } else {
            System.out.println(x + " khong ton tai trong mang A");
        }
    }

    static void dem2(int n, int[] A) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("\nMang A co " + dem + " phan tu co gia tri chan");
    }

    static void tachPhanTu(int n, int[] A) {
        int demSoChan = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                demSoChan++;
            }
        }
        int[] B = new int[demSoChan];
        int index = 0;
        while (index < demSoChan) {
            for (int i = 0; i < n - index; i++) {
                if (A[i] % 2 == 0) {
                    B[index] = A[i];
                    for (int j = i; j < n - index - 1; j++) {
                        A[j] = A[j + 1];
                    }
                    index++;
                    break;
                }
            }
        }
        System.out.println("\nMang A hien tai: ");
        for (int i = 0; i < n - demSoChan; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nMang B: ");
        for (int i = 0; i < demSoChan; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
