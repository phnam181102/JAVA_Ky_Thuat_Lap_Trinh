package Practices03;

import java.util.Scanner;

public class ViDu05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 31};
        System.out.print("Nhập giá trị cần tìm: ");
        int giatri = scanner.nextInt();
        System.out.println("Giá trị cần tìm ở chỉ số mảng: " + BinarySearch(a, giatri));
    }

    private static int BinarySearch(int a[], int x) {
        int min = 0;
        int max = a.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
