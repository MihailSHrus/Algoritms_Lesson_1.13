package Sorting;

public class InvBubbleSorter {
    public static int[] invSort(int[] array) {
        boolean sorted = true; // Булевая переменная sorted для досрочного окончания сортировки
        // Алгортим обратной сортировки
        for (int i = array.length - 1 ; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    sorted = false; // Если была совершена перестановка - то сортировка еще не закончена
                }
            }
            if (sorted) { break; } // Если перестановок не было - то сортировка закончена
        }
        return array;
    }
}
