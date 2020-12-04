//HƯỚNG GIẢI QUYẾT

/*
* Số nguyên tố là số chỉ chia hết cho 1 và chính nó
*
* Ví dụ n = 5
* trong đoạn từ 1 đến 5 (1, 2, 3, 4, 5)
* thì 5 chia hết cho 1 và 5 nên 5 là số nguyên tố
*
* Tức là nếu cho vòng lặp chạy từ 1 đến n thì số nguyên tố phải là số chia hết cho đúng 2 giá trị
*/

package DAP_AN;

import java.util.Scanner;

public class BAITAP_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập n từ bàn phím
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        System.out.println("");

        //khởi tạo mảng a với kích thước n phần tử
        int[] a = new int[n];

        //nhập giá trị cho các phần tử trong mảng a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //khởi tạo biến đếm, gán giá trị ban đầu = 0
        int dem = 0;

        //đếm số lần a[i] chia hết cho j (j chạy từ 1 - a[i])
        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    dem++;
                }
            }
            //nếu = 2 thì là số nguyên tố
            if (dem == 2) {
                System.out.print(a[i]+ " ");
            }
            dem = 0;
        }
    }
}
