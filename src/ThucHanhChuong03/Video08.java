/*
    toan tu tang/giam: x++ x-- ++x --x
    toan tu so sanh: > < == >= <= !=
 */
package ThucHanhChuong03;

public class Video08 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a++); //thuc hien cau lenh xong thi tang a len 1 don vi
        System.out.println(++a); //tang a len 1 don vi roi thuc hien cau lenh
        System.out.println("a > b: " + (a>b)); //cho ra gia tri true hoac false
    }
}
