//Ctrl + Alt + L

import java.util.Scanner;

public class Student {
    private double length;
    private double width;

    public Student() {

    }

    public Student(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }
}

class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap length, width: ");
        Student p = new Student();
    }
}


//bai8
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int n = s.length();
//        System.out.print(s.charAt(0));
//        for (int i = 1; i < n-1; i++) {
//            if (s.charAt(i) == ' ') {
//                System.out.print(s.charAt(i+1));
//            }
//        }
//bai9
//        Scanner sc = new Scanner(System.in);
//        String original = sc.next();
//        char[] chars = original.toCharArray();
//        Arrays.sort(chars);
//        String sorted = new String(chars);
//        System.out.println(sorted);
















