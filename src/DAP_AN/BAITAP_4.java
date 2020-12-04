//HƯỚNG GIẢI QUYẾT
/*
* Cách giải quyết đơn giản nhất là khởi tạo mảng c với độ rộng là (n+m) phần tử rồi lấy giá trị của các phần tử trong
* mảng a và b để cung cấp cho c. Cuối cùng là sắp xếp thứ tự cho các giá trị trong mảng c
*
* Ví dụ:
*   a[4] = {1, 2 ,4 ,7}
*   b[3] = {3, 6, 2}
*   Khởi tạo c[7]
*   Cung cấp giá trị cho các phần tử của mảng c từ mảng a và b
*   -> c[7] = {1, 2, 4, 7, 3, 6, 2}
*   Sắp xếp
*   -> c[7] = {1, 2, 2, 3, 4, 6, 7}
*/

package DAP_AN;

import java.util.Scanner;

public class BAITAP_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhập n từ bàn phím, khai báo mảng a có kích thước n phần tử
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //nhập m từ bàn phím, khai báo mảng b có kích thước m phần tử
        System.out.print("\nNhap m: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        //khởi tạo mảng a với kích thước là e = (m+n) phần tử
        int e = n+m;
        int[] c = new int[e];

        //gán giá trị cho các phần tử từ 0 - (n-1) của mảng c từ các phần tử trong mảng a
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }

        //gán giá trị cho các phần tử còn lại trong mảng c từ các phần tử trong mảng b
        for (int i = n; i < e; i++) {
            c[i] = b[i-n];
        }

        //sắp xếp các phần tử theo thứ tự giảm dần
        for (int i = 0; i < e; i++) {
            for (int j = i+1; j < e; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        //in ra màn hình các phần tử của mảng c
        for (int i = 0; i < e; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
