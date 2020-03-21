package KompjuterIya.HW190320;

public class Null {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 0, 9, 4, 12, -9, 6, 7, 0, 0, 25, 41, -3, 0};
        int a;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] == 0) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
