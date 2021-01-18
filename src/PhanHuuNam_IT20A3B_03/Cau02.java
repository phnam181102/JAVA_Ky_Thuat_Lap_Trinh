//De 2_Ky thuat lap trinh_Khuong
package PhanHuuNam_IT20A3B_03;

import java.util.Scanner;

public class Cau02 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        xuat(a, n);
        System.out.println("\nGia tri nho nhat trong mang A la: " + min(a, n));
        check(a, n);
        System.out.println("\n\nCo " + dem(a, n) + " gia tri lon hon hoac bang gia tri trung binh cua tat ca cac gia tri trong mang A");
        sapXep(a, n);
    }

    //Nhập giá trị cho các phần tử trong mảng A
    public static void nhap(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho A[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    //In ra màn hình giá trị các các phần tử trong mảng A
    public static void xuat(int[] a, int n) {
        System.out.println("\nMang A vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //Tìm giá trị nhỏ nhất trong mảng A
    public static int min(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min < a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    //Kiểm tra xem giá trị X có tồn tại trong mảng A hay không
    public static void check(int[] a, int n) {
        System.out.print("\n\nNhap gia tri can kiem tra: ");
        int x = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(x + " ton tai trong mang A");
        } else {
            System.out.println(x + " khong ton tai trong mang A");
        }
    }

    //Đếm số phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình của tất cả các giá trị trong mảng A.
    public static int dem(int[] a, int n) {
        int sum = a[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            if(a[i] >= (float)sum/a.length) {
                count++;
            }
        }
        return count;
    }

    //Sắp xếp giá trị các phần tử trong mảng A theo thứ tự tăng dần
    public static void sapXep(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nMang A sau khi sap xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
