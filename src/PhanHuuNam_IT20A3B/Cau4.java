package PhanHuuNam_IT20A3B;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        float delta = (float)(Math.pow(b,2) - 4*a*c);
        if (delta<0) {
            System.out.print("Phuong trinh "+a+"x^2 + "+b+"x +"+ c+" =0"+" vo nghiem");
        } else if (delta==0){
            System.out.println("Phuong trinh "+a+"x^2 + "+b+"x +"+ c+" =0"+" co nghiem x = "+(float)-b/2*a);
        } else {
            System.out.println("Phuong trinh "+a+"x^2 + "+b+"x +"+ c+" =0"+" co 2 nghiem: ");
            System.out.println("x1 = "+(float)(-b+Math.sqrt(delta))/ 2*a);
            System.out.println("x2 = "+(float)(-b-Math.sqrt(delta))/ 2*a);
        }
    }
}
