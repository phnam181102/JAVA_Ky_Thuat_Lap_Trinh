package Practices04;

import java.util.Scanner;

public class BaiTap6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can dem: ");
        String s = sc.nextLine();
        String[] dem = s.split(" ");
        System.out.println("So tu trong chuoi la: "+(dem.length));
    }
}
