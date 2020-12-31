package Practices04;

public class ViDu6_10 {
    public static void main(String[] args) {
        int result;
        String string1 = "Happy new year!";
        String string2 = "Happy new year!";
        result = string1.compareTo(string2);
        if (result == 0) {
            System.out.println("Chuỗi " + string1 + " = " + string2);
        } else if (result < 0) {
            System.out.println("Chuỗi " + string1 + " < " + string2);
        } else {
            System.out.println("Chuỗi " + string1 + " > " + string2);
        }
    }
}
