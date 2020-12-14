package Practices02;

import java.util.Arrays;
import java.util.Collections;

public class Video03 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 3, 2, 10, 9};
        String[] names = {"Than", "Hoa", "Hung", "Khanh", "Trung", "Nam"};
        String res = Arrays.toString(names);
        System.out.println(res);
        Arrays.sort(arr, Collections.reverseOrder());
        int index = Arrays.binarySearch(names, "Hoa");
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Index = "+ index);
    }
}
