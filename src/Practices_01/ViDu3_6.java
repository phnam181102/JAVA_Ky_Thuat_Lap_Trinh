package Practices_01;

public class ViDu3_6 {
    public static void main(String args[]) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Number = 1");
                break;
            case 2:
                System.out.println("Number = 2");
                break;
            case 3:
                System.out.println("Number = 3");
                break;
            default:
                System.out.println("Number > 3");
        }
    }

    public static class Vidu3_7 {
        public static void main(String args[]) {
            int number = 2;
            switch (number) {
                case 1:
                    System.out.println("Number = 1");
                case 2:
                    System.out.println("Number = 2");
                case 3:
                    System.out.println("Number = 3");
                default:
                    System.out.println("Number > 3");
            }
        }
    }
}
