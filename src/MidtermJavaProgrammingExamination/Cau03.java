package MidtermJavaProgrammingExamination;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        List<Integer> listNumbers = phanTichSoNguyen(n);
        System.out.printf("Kết quả: %d = ", n);
        int size = listNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(size - 1));
    }

    public static List<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<>();
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
}
