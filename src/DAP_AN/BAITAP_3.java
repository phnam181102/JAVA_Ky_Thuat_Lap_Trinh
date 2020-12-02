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
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int dem = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.print(a[i]+ " ");
            }
            dem = 0;
        }
    }
}
