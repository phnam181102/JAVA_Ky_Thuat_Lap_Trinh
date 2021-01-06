package MidtermJavaProgrammingExamination02;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x (x>3): ");
        int x = sc.nextInt();
        System.out.print("Nhap y (y>3): ");
        int y = sc.nextInt();
        if (x <= 3 || y <= 3) {
            System.out.println("Gia tri x, y vua nhap khong hop le!");
        } else {
            System.out.println("x = " + x + ",\ty = " + y);
            int temp = x;
            x = y;
            y = temp;
            System.out.println("\nGia tri cua x, y sau khi hoan vi: ");
            System.out.println("x = "+x +",\ty = "+y);
        }
    }
}
