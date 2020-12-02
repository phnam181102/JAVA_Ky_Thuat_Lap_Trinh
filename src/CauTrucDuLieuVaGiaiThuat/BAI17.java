package CauTrucDuLieuVaGiaiThuat;

import java.util.Scanner;

public class BAI17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] queue = new int[n];
        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu ["+i+"]: ");
            queue[i] = sc.nextInt();
        }
        int[] ans = new int[n];

        System.out.print("\nNhap k: ");
        int k = sc.nextInt();
        if (k>n) k = k/n;

        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (i <= (k-1)) {
                ans[n-k+i] = queue[i];
            } else {
                ans[dem] = queue[i];
                dem++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
