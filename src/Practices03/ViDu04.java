package Practices03;

import java.util.Scanner;

public class ViDu04 {
    static int LinearSearch(int a[], int N, int x) {
        for (int i = 0; i < N; i++)
            if (a[i] == x)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {10, 8, 1, 21, 7, 32, 5, 11, 0};
        System.out.print("Nhập giá trị cần tìm: ");
        int giatri = scanner.nextInt();
        int ketqua = LinearSearch(a, a.length, giatri);
        if (ketqua == -1)
            System.out.println("Không tìm thấy giá trị: " + giatri);
        else
            System.out.println("Giá trị cần tìm ở chỉ số mảng: " + ketqua);

    }
}
