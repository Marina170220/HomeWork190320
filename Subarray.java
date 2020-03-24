package KompjuterIya.HW190320;

public class Subarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 3, 9, 4, 5, 3};
        int[] arr2;
        int summ = 7;
        int a;
        int m = 0;
        int firstIndex;
        int secondIndex;
        int thirdIndex;

        for (int i = 0; i < arr1.length; i++) {//сортировка эл-тов массива по возрастанию
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[i]) {
                    a = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = a;
                }
            }
        }
        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //начало проверки на равенство заданному числу

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == summ) {
                m++;
                System.out.println("Длина второго массива:" + m);
                arr2 = new int[m];
                arr2[i] = arr1[i];
                System.out.print(arr2[i]);
                System.out.println();
                break;


            } else if (arr1[i] < summ) {
                for (int j = 1; i < arr1.length - 1; i++) {
                    if ((arr1[i] + arr1[j]) == summ) {
                        m = 2;
                        firstIndex = i;
                        secondIndex = j;
                        System.out.println("Длина второго массива:" + m);
                        arr2 = new int[m];
                        arr2[0] = arr1[firstIndex];
                        arr2[1] = arr1[secondIndex];
                        System.out.print(arr2[0] + " " + arr2[1]);
                        System.out.println();
                        break;

                    } else if ((arr1[i] + arr1[j]) < summ) {
                        for (int k = 2; k < arr1.length - 2; k++) {
                            if ((arr1[i] + arr1[j] + arr1[k]) == summ) {
                                m = 3;
                                firstIndex = i;
                                secondIndex = j;
                                thirdIndex = k;
                                System.out.println("Длина второго массива:" + m);
                                arr2 = new int[m];
                                arr2[0] = arr1[firstIndex];
                                arr2[1] = arr1[secondIndex];
                                arr2[2] = arr1[thirdIndex];
                                System.out.print(arr2[0] + " " + arr2[1] + " " + arr2[2]);
                                System.out.println();
                                break;
                            }
                        }
                    }
                }
            }
        }

    }
}
//как сделать, чтоб проверка прекращалась после первого совпадения???






