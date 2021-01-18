//Ctrl + Alt + L

import java.sql.SQLOutput;
import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Entry {
    public static void main(String[] args) {
        Student s1 = new Student("Long", 24);
        Student s2 = new Student("Kien", 29);
        s1.display();
        s2.display();
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
















