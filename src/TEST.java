//aaaaaaa
import java.util.Scanner;

public class TEST {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        xuat(a, n);
        dem(a, n);
    }

    //Nhập giá trị cho các phần tử trong mảng A
    public static void nhap(int[] a,int n){
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho A["+i+"]: ");
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

    // Đếm số phần tử có giá trị chia hết cho 5 mà không chia hết cho 8
    public static int dem(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0 && a[i] % 8 != 0) {
                count++;
            }
        }
        return count;
    }

    //Tìm giá trị lớn nhất trong mảng A
    public static int max(int[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }


}
