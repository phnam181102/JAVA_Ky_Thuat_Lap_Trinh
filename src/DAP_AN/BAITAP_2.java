//HƯỚNG GIẢI QUYẾT

/*
* Mỗi phần tử trong mảng đều có một chỉ số cố định, để chèn một phần tử x vào trước phần tử có chỉ số k cho trước không
* phải cứ gán a[k] = x là được, vì nếu gán về thì phần tử a[k] cũ sẽ bị mất.
*
* Ý tưởng cho việc chèn phần tử trong mảng như sau: Ta thấy rằng sau khi chèn vào dãy một phần tử thì chắc chắn số lượng
* phần tử sẽ tăng lên 1 đơn vị, các phần tử có chỉ số từ 0 đến k-1 vẫn giữ nguyên, còn các phần tử từ chỉ số k đến n sẽ
* tăng chỉ số lên 1, để làm được như vậy ta phải gán a[i] = a[i-1] và phải chọn vòng lặp cho hợp lý.
*/

package DAP_AN;

import java.util.Scanner;

public class BAITAP_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //nhập n từ bàn phím
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        //khai báo mảng a với kích thước (n+1) phần tử
        int[] a = new int[n+1];

        System.out.println("");

        //nhập giá trị cho cho các phần tử từ 0 - n
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            a[i] = sc.nextInt();
        }

        //nhập k và x từ bàn phím
        System.out.print("\nNhap k: ");
        int k = sc.nextInt();
        System.out.print("\nNhap x: ");
        int x = sc.nextInt();

        System.out.println("");

        //không quan tâm các phần tử từ 0 đến (k-1), dời các phần tử từ k đến n lui 1 ô, thêm x vào vị trí a[i] (k=i)
        for (int i = n; i >= k; i--) {
            if (i == k){
                a[i] = x;
            } else {
                a[i] = a[i-1];
            }
        }

        //in ra màn hình
        System.out.println("Ket qua:");
        for (int i= 0; i <= n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
