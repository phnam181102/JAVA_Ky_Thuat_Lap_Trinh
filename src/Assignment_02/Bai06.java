package Assignment_02;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap gia tri x: ");
        int x = sc.nextInt();

        int chiSo = -1;
        for (int i = 0; i <= n; i++) {
            if (x >= arr[i] && x <= arr[i+1]) {
                chiSo = i+1;
                break;
            }
        }

        for (int i = n; i >= chiSo; i--) {
            if(i > chiSo) {
                arr[i] = arr[i-1];
            } else {
                arr[i] = x;
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
