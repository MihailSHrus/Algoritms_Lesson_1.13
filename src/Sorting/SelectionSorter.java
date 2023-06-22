package Sorting;

public class SelectionSorter {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];}
                }
            if (i != pos) {     // Меняем местами элементы в том случае, если позиция min изменилась
                array[pos] = array[i];
                array[i] = min;    // меняем местами наименьший с array[i]
            }
        }
        return array;
    }
}
