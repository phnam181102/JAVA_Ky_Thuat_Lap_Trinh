package Practices02;

public class Video05 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        System.out.println("Truy xuat mang 2 chieu su dung for each");
        for(int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
