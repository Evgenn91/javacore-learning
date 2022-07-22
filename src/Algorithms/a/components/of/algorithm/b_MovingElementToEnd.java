package Algorithms.a.components.of.algorithm;

import java.util.Arrays;

/**
 * Гоним элемент в массиве из начала в конец.
 * (применяется составная часть алгоритма - "обмен значениями элементов")
 * Гонется только 1ый элемент из начала в конец
 * 1.1 Гоним из начала в конец
 * 2.1 Гоним из конца в начало
 *
 */

public class b_MovingElementToEnd {
    public static void main(String[] args) {
        int[] array = {5,1,3,4,0,8,9,7,6,2};

        //5-ка окажется в конце
        System.out.println("Перед гонением: "+Arrays.toString(array));//[5, 1, 3, 4, 0, 8, 9, 7, 6, 2]
        gonimElemVKonec(array);
        System.out.println("После гонения в конец: "+ Arrays.toString(array));//[1, 3, 4, 0, 8, 9, 7, 6, 2, 5]

        System.out.println("===========================" );

        //5-ка окажется опять в начале
        System.out.println("Перед гонением: "+Arrays.toString(array));//[1, 3, 4, 0, 8, 9, 7, 6, 2, 5]
        gonimElemVNachalo(array);
        System.out.println("После гонения в начало: "+Arrays.toString(array));//[5, 1, 3, 4, 0, 8, 9, 7, 6, 2]

    }


    //1.1 Гоним из начала в конец
    public static void gonimElemVKonec(int[] array){
        //обязательно указываем array.length-1
        // т.к. последний элемент мы уже не сможем перевернуть в методе swap
        // (выйдет за границы массива)
        for(int i=0;i< array.length-1;i++){
            swap(array,i,i+1);
        }

    }

    //2.1 Гоним из конца в начало
    public static void gonimElemVNachalo(int[] array){
        //указываем не i>=0 а только i>0 из за той же причины вверху
        // (чтобы не выйти заграницы в конце цикла)
        for(int i = array.length-1; i>0; i--){
            swap(array,i,i-1);
        }

    }

    //составная часть алгоритмов "обмен значениями элементов"
    public static void swap(int[] array, int frst, int scnd){
        int tmp = array[frst];
        array[frst] = array[scnd];
        array[scnd]=tmp;
    }
}
