package ThucHanhChuong03;
//lenh dieu khien vong lap
/*
    break;
    continue;
 */

public class Video17 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            count++;
            if (count == 11) {
                break;
            }
        }
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            if (i > 10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
