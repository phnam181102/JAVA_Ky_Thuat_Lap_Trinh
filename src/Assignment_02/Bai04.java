package Assignment_02;

import java.util.Random;
import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rd = new Random();

        int count = 0;
        while (count < n) {
            arr[count] = rd.nextInt();
            count++;
        }

        int size = 0;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = 0; j < n; j++) {
                if (arr[i] != arr2[j]) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                arr2[size] = arr[i];
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
            System.out.print(arr2[i]+" ");
        }
    }
}
