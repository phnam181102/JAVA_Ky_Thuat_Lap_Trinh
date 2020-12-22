package PrepareFinalTest01;

import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N tu ban phim: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int output = 0;
            dayDoiXung(i, n, output);
            System.out.println();
        }
    }

    static void dayDoiXung(int i, int n, int output) {
        int j = 0;
        while (j < n + i) {
            if (j >= n - i - 1 && j <= n + i - 1) {
                if (j <= n - 1) {
                    output++;
                    System.out.print(output);
                } else {
                    System.out.print(--output);
                }
            } else {
                System.out.print(" ");
            }
            j++;
        }
    }

}
