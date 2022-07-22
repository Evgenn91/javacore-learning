package Algorithms.d.binary.search;

import java.util.Arrays;

/**
 * Бинарный поиск (реализованный в массиве)
 * ищет только в отсортированном массиве
 */
public class BinarySearchArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int pos = Arrays.binarySearch(arr,20);
        System.out.println(pos);//1
        System.out.println(Arrays.binarySearch(arr,50));//4
        System.out.println(Arrays.binarySearch(arr,25));//-3 - данный вывод говорит следующее("-" - что не нашел, "3" - предпологаемая позиция)
        System.out.println(Arrays.binarySearch(arr,5));//-1
        System.out.println(Arrays.binarySearch(arr,55));//-6
    }
}
