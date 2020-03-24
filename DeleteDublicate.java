package KompjuterIya.HW190320;

public class DeleteDublicate {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 4, 3, 4, 7, 8, 4, 4, 4, 5, 4};
        int[] arr2;
        int m = 1;
        int a;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");//вывод на консоль исходного массива
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {//сортировка элементов по возрастанию
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[i]) {
                    a = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = a;
                }
            }
        }

        System.out.print("Исходный массив после первой сортировки: ");
        for (int i = 0; i < arr1.length; i++) {//вывод отсортированного массива
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {//перемещаем повторяющиеся элементы в конец массива
                if (arr1[i] == arr1[i + 1]) {
                    a = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = a;
                }
            }
        }

        System.out.print("Исходный массив после второй сортировки: ");
        for (int i = 0; i < arr1.length; i++) {//вывод массива с повторами в конце
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        for (int i = arr1.length - 1; i > 0; i--) {
            if (arr1[i] == arr1[i - 1]) {//находим количество дубликатов
                m++;
            }
        }
        System.out.print("Количество повторяющихся элементов: ");
        System.out.println(m);//выводим кол-во дубликатов

        arr2 = new int[arr1.length - m];

        System.out.print("Длина нового массива: ");
        System.out.println(arr2.length);//выводим длину второго массива

        for (int i = 0; i < arr2.length; i++) {//присваиваем элементам 2-го массива значения эле-тов 1-го м-ва
            arr2[i] = arr1[i];
        }

        System.out.print("Новый массив: ");
        for (int i = 0; i < arr2.length; i++) {//вывод полученного массива
            System.out.print(arr2[i] + " ");
        }
    }
}
//работает, если повторяется только одно число
