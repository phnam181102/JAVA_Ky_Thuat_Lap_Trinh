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

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n+1];

        System.out.println("");

        for(int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nNhap k: ");
        int k = sc.nextInt();
        System.out.print("\nNhap x: ");
        int x = sc.nextInt();

        System.out.println("");

        //nên nhắn tin riêng nếu vẫn chưa hiểu đoạn code phía dưới
        for (int i = n; i >= k; i--) {
            if (i == k){
                a[i] = x;
            } else {
                a[i] = a[i-1];
            }
        }

        System.out.println("Ket qua:");
        for (int i= 0; i <= n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
