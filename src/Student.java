//Ctrl + Alt + L

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("\n\nCac phan tu xuat hien lap lai trong mang A la: ");
        boolean check = false;
        boolean check2 = true;
        int[] B = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j] && i != j) {
                    check = true;
                    for (int k = 0; k < n; k++) {
                        if (A[i] == B[k]) {
                            check2 = false;
                        }
                    }
                    B[p] = A[i];
                    p++;
                }
            }
            if (check && check2) {
                System.out.print(A[i] + " ");
            }
            check = false;
            check2 = true;
        }
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
















