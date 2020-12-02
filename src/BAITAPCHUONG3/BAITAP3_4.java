package BAITAPCHUONG3;

import java.util.Scanner;

public class BAITAP3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lua chon cua nguoi 1 (1-Bua, 2-Keo, 3-Bao): ");
        int player1 = sc.nextInt();
        System.out.println("Lua chon cua nguoi 2 (1-Bua, 2-Keo, 3-Bao): ");
        int player2 = sc.nextInt();
        if (player1==1) {
            switch (player2) {
                case 1:
                    System.out.println("Hoa nhau");
                    break;
                case 2:
                    System.out.println("Nguoi choi 1 thang");
                    break;
                case 3:
                    System.out.println("Nguoi choi 2 thang");
                    break;
            }
        } else if (player1==2) {
            switch (player2) {
                case 1:
                    System.out.println("Nguoi choi 2 thang");
                    break;
                case 2:
                    System.out.println("Hoa nhau");
                    break;
                case 3:
                    System.out.println("Nguoi choi 1 thang");
                    break;
            }
        } else if (player1==3) {
            switch (player2) {
                case 1:
                    System.out.println("Nguoi choi 1 thang");
                    break;
                case 2:
                    System.out.println("Nguoi choi 2 thang");
                    break;
                case 3:
                    System.out.println("Hoa nhau");
                    break;
            }
        }
    }
}
