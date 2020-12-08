/*
    - toan tu logic: && | !
    - toan tu ba ngoi: experssion ? x : y
 */

package VIDU_CHUONG3;

public class Video09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println((a<b) && (a!=b)); // && = and
        System.out.println((a<b) || (a==b)); // | = or
        System.out.println(!(a>b));
        String res = "";
        res = (a<b) ? "a < b" : "a >= b";
        System.out.println(res);
    }
}
