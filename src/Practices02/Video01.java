package Practices02;

public class Video01 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (i % 20 == 0){
                System.out.println();
            }
        }

    }
}
