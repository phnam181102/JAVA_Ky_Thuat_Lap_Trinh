package Practices04;

public class ViDu6_15 {
    public static void main(String[] args) {
        String chuoiCha = new String("Welcome to Freetuts.net!");
// tạo một chuỗi con từ vị trí 11 trong chuỗi string1
        String chuoiCon1 = chuoiCha.substring(11); // Freetuts.net!
        System.out.println(chuoiCon1);
        /*
         * tách một chuỗi con bắt đầu từ vị trí 11
         * và kết thúc tại vị trí 19 trong chuỗi cha
         */
        String chuoiCon2 = chuoiCha.substring(11, 19); // Freetuts
        System.out.println(chuoiCon2);
    }
}
