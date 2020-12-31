package Practices04;

public class ViDu6_11 {
    public static void main(String[] args) {
        int result;
        String string1 = "Happy new year!";
        String string2 = "new year!";
        result = string1.indexOf(string2);
        System.out.println("Vị trí đầu tiên xuất hiện chuỗi " + string2 +
                " trong chuỗi " + string1 + " = " + result);
    }
}
