package Buoi15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        Map map = new HashMap();
        for (int i = 1; i <= n; i++) {
            map.put(i, i * i);
        }

        System.out.print("{");
        Set set = map.keySet();
        int count = 0;
        for (Object key : set) {
            System.out.print(key + ":" + map.get(key));
            if (count < n-1) {
                System.out.print(",");
            }
            count++;
        }
        System.out.println("}");
    }
}
