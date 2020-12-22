//toan tu trong Java
/*
    -toán tử số học: + - * / %=
    -toán tử gán: = += -= *= /= %=
 */

package Practices01;

public class Video07 {
    public static void main(String[] args) {
        int a = 120;
        int b = 235;
        System.out.println("Ket qua phep chia so thuc: " + a/(b*1.0f));
        System.out.println("Ket qua phep chia lay du: " + b%a);
        a += 5; //tuong duong: a = a + 5;
        b *=2; //b = b * 2;
    }
}
