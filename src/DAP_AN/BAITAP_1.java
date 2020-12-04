package DAP_AN;

import java.util.Scanner;

public class BAITAP_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhap n từ bàn phím
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();

        //khai báo mảng a với kích thước n phần tử
        int[] a = new int[n];

        //dùng vòng for để nhập giá trị cho các phần tử trong mảng a
        for (int i = 0; i < n; i++){
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("");

        //tính bình phương từng phần tử và in ra màn hình
        for (int i = 0; i < n; i++) {
            a[i] *= a[i];
            System.out.print(a[i]+ " ");
        }
    }
}
