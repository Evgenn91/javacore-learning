package Algorithms.c.sorting.b.selection.sorting;

import java.util.Arrays;


/**
 * Сортировка выборкой(работает за n2(n в квадрате))
 * очень похож на пузырьковую сортировку
 * только он не "гонит" самый большой элемент в конец, а крайний элемент(который на данный момент крайний во внешнем цикле)
 * переставляет с элементом который мы перебираем во внутреннем цикле
 */

public class IterateSelectionSorting {
    public static void main(String[] args) {
        int[] arr = {-5, 23, 2, 55, 13, 634, 23, 12, 313};
//        IterateSelectionSorting.selectSorting(arr);
        IterateSelectionSorting.selectSortingOptimized(arr);
        System.out.println("sort arr = " + Arrays.toString(arr));
    }

    //не оптимизированная сортировка выборкой(не оптимизированная т.к. можно не производить "обмен", а сохранять значение во временной переменной
    // и записывать ее в результат только когда уже дошли до конца)
    public static void selectSorting(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            for(int k = 0; k < i; k++){
                //основное отличие от пузырьковой сортировки здесь!!!!
                //мы переставляем не соседние элементы, а переставляем последний элемент(который на данный момент последний
                //во внешнем цикле - i) с элементом по которому пробегаемся - k
                swap(arr, k, i);
            }
        }
    }

    //оптимизированный метод сортировки выборкой
    public static void selectSortingOptimized(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            int variable = arr[i];
            int indexVar = i;
            for(int k = 0; k < i; k++){
                if(arr[k] > variable){
                    variable = arr[k];
                    indexVar = k;
                }
            }
            arr[indexVar] = arr[i];
            arr[i] = variable;
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
