//HƯỚNG GIẢI QUYẾT
/*
* Ví dụ trực tiếp cho phương pháp được sử dụng trong chương trình này:
*
* Cho dãy đơn điệu: 1, 3, 4, 9
*   (3-1)*(4-3) > 0
*   (4-3)*(9-4) > 0
* Cho dãy đơn điệu: 5, 3, 1, -2
*   (3-5)*(1-3) > 0
*   (1-3)*(-2-1) > 0
*/

package DAP_AN;

import java.util.Scanner;

public class BAITAP_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhập n từ bàn phím và khai báo mảng a có kích thước n phần tử
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        //nhập giá trị cho từng phần tử
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //khởi tạo biến check = true
        boolean check = true;

        //kiểm tra, nếu kết quả ra âm thì gán check = false
        for (int i = 2; i < n - 1; i++) {
            if ((a[i-1] - a[i-2]) * (a[i]-a[i-1]) <= 0) {
                check = false;
            }
        }

        //nếu check = true thì in ra màn hình YES. Ngược lại, nếu check = false thì in ra màn hình NO
        if (check) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
