package Algorithms.c.sorting.a.bubble.sorting;

import java.util.Arrays;

/**
 * Сортировка пузырьком(работает за n2(n в квадрате))
 * основан на "компонент-алгоритме" - гонение самого большого элемента в конец массива
 * только 1ую итерацию мы гоним большой элемент в самый конец
 * 2ая итерация - гоним большой элемент на предпоследнее место в массиве
 * 3ая итерауия гоним элемент на предпребпоследнее место в массиве и т.д.
 *
 * данная сортировка медленнее других сортировок(рекурсивной, быстрой и сортировкой слиянием)
 */
public class IterateBubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1, 23, 1, 55, 13, 634, 23, 12, 313};
        IterateBubbleSorting.bubbleSorting(arr);
        System.out.println("sort arr = " + Arrays.toString(arr));
    }

    public static void bubbleSorting(int[] arr){
        //цикл для уменьшения колличества итераций внутреннего цикла на один с каждым гонением элемента в конец
        for(int i = arr.length-1; i >= 0; i--){
            //тут начинается гонение самого большого элемента в конец
            for(int k = 0; k < i; k++){
                swap(arr,k,k+1);
            }
        }
    }

    //2 соседних элемента переставляются, если firs больше scnd
    public static void swap(int[] array, int frst, int scnd){
        if(array[frst] > array[scnd]){
            int tmp = array[frst];
            array[frst] = array[scnd];
            array[scnd]=tmp;
        }
    }
}
