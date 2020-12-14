package Practices02;

public class Video04 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        String[][] s = new String[2][3];
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
