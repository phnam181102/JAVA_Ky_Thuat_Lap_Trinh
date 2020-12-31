package Practices04;

public class ViDu6_3 {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    public static void main(String[] args) {
        System.out.println("Giai thua cua 5 là: " + factorial(5));
    }
}
