package Sorting;
public class BubbleSorter {
    public static int[] sort(int[] array) {
        boolean sorted = true; // Булевая переменная sorted для досрочного окончания сортировки
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    sorted = false; // Если была совершена перестановка - то сортировка еще не закончена
                }
            }
            if (sorted) { break; } // Если перестановок не было - то сортировка закончена
        }
        return array;
    }
}