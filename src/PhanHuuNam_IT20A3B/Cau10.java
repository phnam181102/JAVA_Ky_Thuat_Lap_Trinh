package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            A[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        dem1(n, A);
        dem2(n, A);
        tach(n, A);
        check(n, A);
    }

    static void dem1(int n, int[] A) {
        int dem = 0;
        int demSoLe = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0 && A[i] % 6 != 0) {
                dem++;
            }
            if (A[i] % 2 != 0) {
                demSoLe++;
            }
        }
        System.out.println("\n\nCo " + dem + " gia tri chia het cho 5 ma khong chia het cho 6");
        System.out.println("\nMang A co " + demSoLe + " gia tri le");
    }

    static void dem2(int n, int[] A) {
        int sum = 0;
        int dem = 0;
        float avg;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        avg = sum / n;
        for (int i = 0; i < n; i++) {
            if (A[i] >= avg) {
                dem++;
            }
        }
        System.out.println("\nCo " + dem + " phan tu trong mang A >= gia tri trung binh cua tat ca cac gia tri trong mang A");
    }

    static void tach(int n, int[] A) {
        int demSoLe = 0;
        int index = 0;
        int i, d;
        for (i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                demSoLe++;
            }
        }
        int[] B = new int[demSoLe];
        for (d = i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                A[d] = A[i];
                d++;
            } else {
                B[index] = A[i];
                index++;
            }
        }


        System.out.println("\nMang A hien tai: ");
        for (i = 0; i < d; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nMang B: ");
        for (i = 0; i < demSoLe; i++) {
            System.out.print(B[i] + " ");
        }
    }

    static void check(int n, int[] A) {
        System.out.print("\n\nCac phan tu xuat hien lap lai trong mang A la: ");
        boolean check = false;
        boolean check2 = true;
        int[] B = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j] && i != j) {
                    check = true;
                    for (int k = 0; k < n; k++) {
                        if (A[i] == B[k]) {
                            check2 = false;
                        }
                    }
                    B[p] = A[i];
                    p++;
                }
            }
            if (check && check2) {
                System.out.print(A[i] + " ");
            }
            check = false;
            check2 = true;
        }
    }
}
