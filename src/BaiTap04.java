import java.util.Scanner;

public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap gia tri cho phan tu [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        if (m>=3) {
            System.out.println("Cac phan tu nam tren dong so 3 la: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[2][i] + " ");
            }
        } else {
            System.out.println("Mang vua nhap khong co dong thu 3!");
        }
    }
}
