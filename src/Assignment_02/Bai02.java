package Assignment_02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        int[][] save = new int[2][n];

        int max = arr[0];
        int min = arr[0];
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int check = min;
        int iFor = 0;
        while (check <= max) {
            while (iFor < n) {
                for (int j = 0; j < n; j++) {
                    if(arr[j] == check) {
                        count++;
                    }
                }
                save[0][iFor] = check;
                save[1][iFor] = count;
                break;
            }
            check++;
            count = 0;
            iFor++;
        }

        int chiSo = 0;
        int max2 = save[1][0];
        for (int i = 0; i < max; i++) {
            if (save[1][i] > max2) {
                max2 = save[1][i];
                chiSo=i;
            }
        }
        System.out.println(save[0][chiSo] + " xuat hien nhieu nhat: " + save[1][chiSo] + " lan");
    }
}