package MidtermJavaProgrammingExamination;

import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n tu ban phim (n>2): ");
        int n = sc.nextInt();
        if (n<=2) {
            System.out.println("n khong hop le!");
        } else {
            if (n%2==0) {
                System.out.println("n la so chan!");
            } else {
                System.out.println("n la so le!");
            }
        }
    }
}
