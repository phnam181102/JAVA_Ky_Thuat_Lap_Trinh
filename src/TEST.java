//https://vi.wikipedia.org/wiki/Gi%E1%BA%A3i_thu%E1%BA%ADt_Euclid
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String J = sc.next();
        String S = sc.next();
        numJewelsInStones(J, S);
    }
    static void numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j))
                    count++;
            }
        }
        System.out.println(count);
    }
}
