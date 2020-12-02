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
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean check = true;
        for (int i = 2; i < n - 1; i++) {
            if ((a[i-1] - a[i-2]) * (a[i]-a[i-1]) <= 0) {
                check = false;
            }
        }
        if (check) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
