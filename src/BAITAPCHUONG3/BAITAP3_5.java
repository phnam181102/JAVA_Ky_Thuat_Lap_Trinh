package BaiTapChuong3;

import java.util.Scanner;

public class BAITAP3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dem = 1;
        while (dem<=4) {
            //giới hạn số lần nhập
            if (dem == 4) {
                System.out.println("Ban da nhap qua so lan cho phep!!!");
                break;
            }
            System.out.println("Nhap ten nguoi dung: ");
            String username = sc.next();
            System.out.println("Nhap mat khau: ");
            String password = sc.next();
            dem++;
            if((username.equals("khuong")) && (password.equals("123"))) {
                //in ra màn hình các số chia hết cho 3 và 5 từ 100-200 khi username='khuong' và password='123'
                int sum= 0;
                for(int i = 100; i <= 200; i++) {
                    if ((i % 3 == 0) && (i % 5 == 0)) {
                        System.out.print(i + " ");
                        sum+=i;
                    }
                }
                System.out.println("\nTong cac so chia het cho 3 va 5 = " + sum);
                break;
            } else if(dem < 4) {
                System.out.println("Ban da nhap sai, hay nhap lai!");
            }
        }

    }
}
