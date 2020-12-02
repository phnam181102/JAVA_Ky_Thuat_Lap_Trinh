package BaiTapChuong3;

import java.util.Scanner;

public class BAITAP3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap c: ");
        float c = sc.nextFloat();
        float delta = b*b - 4*a*c;
        if (delta<0)
            System.out.println("Phuong trinh vo nghiem");
        else if (delta==0)
            System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
        else {
            System.out.println("Phuong trinh co 2 nghiem");
            System.out.println("X1 = " + (-b+Math.sqrt(delta))/(2*a));
            System.out.println("X1 = " + (-b-Math.sqrt(delta))/(2*a));
        }
    }
}
