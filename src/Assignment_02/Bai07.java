package Assignment_02;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuong cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int count = 1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                count++;
            } else{
                if (max<count) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println("Duong chay dai nhat la: "+max);
    }
}
