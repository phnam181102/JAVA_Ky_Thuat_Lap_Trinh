package Practices04;

public class ViDu6_12 {
    public static void main(String[] args) {
        int result;
        String string1 = "Happy new year and new year!";
        String string2 = "new year!";
        result = string1.lastIndexOf(string2);
        System.out.println("Vị trí cuối cùng xuất hiện chuỗi " + string2 +
                " trong chuỗi " + string1 + " = " + result);
    }
}
