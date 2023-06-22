import Sorting.BubbleSorter;
import Sorting.InvBubbleSorter;
import Sorting.SelectionSorter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("-Задание2-");
        int[] arr = {9, 2, 1, 5, 4};
        int[] result = BubbleSorter.sort(arr);
        System.out.println("Пункт а)");
        System.out.println(Arrays.toString(result));
        int[] result2 = InvBubbleSorter.invSort(arr);
        System.out.println("Пункт б)");
        System.out.println(Arrays.toString(result2));
        System.out.println("-Задание4-");
        int[] result3 = SelectionSorter.sort(arr);
        System.out.println(Arrays.toString(result3));
    }
}