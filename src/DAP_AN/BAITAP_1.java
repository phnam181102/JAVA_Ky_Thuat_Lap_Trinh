
//Mọi thắc mắc bạn gặp phải trong 5 bài tập đều có thể nhắn tin riêng cho mình để được hỗ trợ

package DAP_AN;

import java.util.Scanner;

public class BAITAP_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Nhap gia tri cho phan tu [" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
            a[i] *= a[i];
            System.out.print(a[i]+ " ");
        }
    }
}
