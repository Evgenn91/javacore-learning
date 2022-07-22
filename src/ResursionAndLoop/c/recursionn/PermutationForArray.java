package ResursionAndLoop.c.recursionn;

import java.util.Arrays;

/**
 * принимает массив и на выходе
 * даст все возможные множества (тоесть перемешает)
 */
public class PermutationForArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        PermutationForArray.permute(arr, arr.length); //вывод всевозможные массивы с вариантами переданных данных
    }

    //эта программа немного сбоит, понять почему(возможно необходимы знания памяти в java)
    public static void permute(int[] arr, int size){
        if(size < 2){
            System.out.println(Arrays.toString(arr));
        } else {
            for(int k = 0; k < size; k++){
                swap(arr, k, size - 1);
                permute(arr, size - 1);
            }
        }
    }

    private static void swap(int[] arr, int index0, int index1){
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
