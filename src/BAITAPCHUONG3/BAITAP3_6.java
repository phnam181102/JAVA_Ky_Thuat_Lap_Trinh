package BAITAPCHUONG3;

public class BAITAP3_6 {
    public static void main(String[] args) {
        int count0 = 0, count1 = 0, count2 = 0, count3 =0;
        for (int i = 0; i <= 100; i++) {
            switch (i%5) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }
        System.out.println("So cac so chia het cho 5 la: " + count0);
        System.out.println("So cac so chia het cho 5 du 1 la: " + count1);
        System.out.println("So cac so chia het cho 5 du 2 la: " + count2);
        System.out.println("So cac so chia het cho 5 du 3 la: " + count3);
    }
}
