package Practices_01;

public class ViDu3_12 {
    public static void swap(int a, int b) {
        int tam = a;
        a = b;
        b = tam;
        System.out.println("Ket qua swap: " + "a = " + a + " b= " + b);
    }
    public static void main(String[] args) {
        int a = 5, b = 3;
        swap(a, b);
        System.out.println("a sau khi swap: " + a);
        System.out.println("b sau khi swap: " + b);
    }
}
