package Practices04;

public class ViDu6_2 {
    static int count = 0;
    static void p() {
        count++;
        if (count <= 5) {
            System.out.println("hello " + count);
            p();
        }
    }
}
