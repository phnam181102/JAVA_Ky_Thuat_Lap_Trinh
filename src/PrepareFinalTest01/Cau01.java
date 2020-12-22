package PrepareFinalTest01;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        int demSoChan = 0;
        cau1_1(n, A);
        cau1_2(n, A);
        cau1_3(n, A);
        System.out.print("\nCau 1_4\nNhap gia tri X can tim: ");
        int X = sc.nextInt();
        cau1_4(n, A, X);
        System.out.println("\nCau 1.5");
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                demSoChan++;
            }
        }
        System.out.println("Mang A co " + demSoChan + " gia tri chan");
        int[] B = new int[demSoChan];
        cau1_6(demSoChan, n, A, B);
    }

    static void cau1_1(int n, int[] A) {
        System.out.println("Cau 1.1");
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    static void cau1_2(int n, int[] A) {
        System.out.println("\n\nCau 1.2");
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 4 != 0) {
                count++;
            }
        }
        System.out.println("Co " + count + " gia tri chia het cho 3 & khong chia het cho 4");
    }

    static void cau1_3(int n, int[] A) {
        System.out.println("\nCau 1.3");
        int min = A[0];
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang A la: " + max);
        System.out.println("Gia tri nho nhat trong mang A la: " + min);
    }

    static void cau1_4(int n, int[] A, int X) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (A[i] == X) {
                check = true;
            }
        }
        if (check) {
            System.out.println(X + " ton tai trong mang A!");
        } else {
            System.out.println(X + " khong ton tai trong mang A!");
        }
    }

    static void cau1_6(int demSoChan, int n, int[] A, int[] B) {
        System.out.println("\nCau 1.6");
        int index = 0;
        while (index < demSoChan) {
            for (int i = 0; i < n - index; i++) {
                if (A[i] % 2 == 0) {
                    B[index] = A[i];
                    for (int j = i; j < n-index-1; j++) {
                        A[j]=A[j+1];
                    }
                    index++;
                    break;
                }
            }
        }
        System.out.println("Mang A hien tai: ");
        for (int i = 0; i < n - demSoChan; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nMang B: ");
        for (int i = 0; i < demSoChan; i++) {
            System.out.print(B[i] + " ");
        }
    }

}
