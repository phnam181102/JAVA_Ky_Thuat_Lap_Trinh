package Practices03;

public class ViDu02 {
    public static void main(String[] args) {
// khoi tao mang arr
        int arr[] = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};
        ViDu02 sapXepChon = new ViDu02();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChon.display(arr);
        System.out.println("-----------------------------");
        sapXepChon.selectionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChon.display(arr);
    }

    public void selectionSort(int arr[]) {
        int indexMin;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                System.out.println(" ==> Trao doi phan tu: [" + arr[i] + ", " + arr[indexMin] + "]");
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

}
