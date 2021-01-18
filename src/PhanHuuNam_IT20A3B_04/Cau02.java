//De 2_Ky thuat lap trinh_Tuan
package PhanHuuNam_IT20A3B_04;

import java.util.Scanner;

public class Cau02 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        xuat(a, n);
        System.out.println("\n\nCo " + dem(a, n) + " phan tu chia het cho 3 ma khong chia het cho 5");
        System.out.println("\nGia tri nho nhat trong mang A la: " + min(a, n));
        check(a, n);
        tach(a, n);
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

    // Đếm số phần tử có giá trị chia hết cho 3 mà không chia hết cho 5
    public static int dem(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 != 0) {
                count++;
            }
        }
        return count;
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


    //Tách tất cả các giá trị chẵn trong mảng A vào mảng B
    public static void tach(int[] a, int n) {
        int demSoChan = 0;
        int index = 0;
        int i, c;
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                demSoChan++;
            }
        }
        int[] b = new int[n];
        for (c = i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                a[c] = a[i];
                c++;
            } else {
                b[index] = a[i];
                index++;
            }
        }
        n = c;

        System.out.println("\nMang A hien tai: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nMang B: ");
        for (i = 0; i < demSoChan; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
