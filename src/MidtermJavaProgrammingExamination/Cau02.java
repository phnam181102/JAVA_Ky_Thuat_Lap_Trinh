package MidtermJavaProgrammingExamination;

import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            A[i] = sc.nextInt();
        }
        //Viết hàm Nhập và hiển thị các giá trị trong mảng A

        cau2_1(n, A);
        cau2_2(n, A);
        //Cau2_3: Viết hàm đếm số phần tử trong mảng A có giá trị lẻ
        int soLe = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                soLe++;
            }
        }
        System.out.println("\nMang A co " + soLe + " phan tu co gia tri le");
        cau2_4(n, A);
        cau2_5(n, A, soLe);
        cau2_6(n, A);

    }

    //Viết hàm Nhập và hiển thị các giá trị trong mảng A
    static void cau2_1(int n, int[] A) {
        System.out.println("\nMang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    //Viết hàm đếm trong mảng A có bao nhiêu giá trị chia hết cho 5 mà không chia hết cho 6
    static void cau2_2(int n, int[] A) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0 && A[i] % 6 != 0) {
                dem++;
            }
        }
        System.out.println("\nCo " + dem + " phan tu chia het cho 5 ma khong chia het cho 6");
    }

    //Viết hàm đếm xem có bao nhiêu phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình của tất cả các giá trị trong mảng A
    static void cau2_4(int n, int[] A) {
        float total = A[0];
        int dem = 0;
        for (int i = 1; i < n; i++) {
            total += A[i];
        }
        for (int i = 0; i < n; i++) {
            if (A[i] >= total / n) {
                dem++;
            }
        }
        System.out.println("\nCo gia tri lon hon hoac bang gia tri trung binh cua tat ca cac gia tri trong mang A la: " + dem);
    }

    static void cau2_5(int n, int[] A, int soLe) {
        int[] B = new int[soLe];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                B[p] = A[i];
                p++;
            }
        }
        System.out.println("\nMang C: ");
        for (int i = 0; i < soLe; i++) {
            System.out.print(B[i] + " ");
        }
    }

    //Viết hàm kiếm tra xem trong mảng A có tồn tại phần tử nào xuất hiện lặp lại hay không
    static void cau2_6(int n, int[] A) {
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
