package Algorithms.a.components.of.algorithm;

import java.util.Arrays;

/**
 * Гоним наибольший элемент в массиве в конец.
 * (применяется составная часть алгоритма - "обмен значениями элементов")
 * и в "обмен значениями элементов" добавим условие - наз "условный обмен"
 * Тогда будет гнаться самый большой элемент в массиве в конец
 * При этом сам массив тоже немного поменяется!!!!!!
 * Но тут самое важное что самый большой элемент окажется в конце!!!!
 * 1.1 Гоним наибольший элемент в конец в конец
 * 2.1 Гоним наименьший элемент в начало в начало
 *
 */
public class c_MovingLargestElementToEnd {
    public static void main(String[] args) {
        int[] array = {5,1,3,4,0,8,9,7,6,2};

        //9-ка окажется в конце
        System.out.println("Перед гонением: "+ Arrays.toString(array));//[5, 1, 3, 4, 0, 8, 9, 7, 6, 2]

        gonimNaibElemVKonec(array);
        //если этот метод вызвать столько раз сколько элементов в массиве - то отсортируется весь массив!!!!(это зачатки пузырьковой сортировки(неоптимизированной))
        //т.е. так:
//        for(int i = 0; i < array.length-1; i++){
//            gonimNaibElemVKonec(array);
//        }

        System.out.println("После гонения в конец наибольшего: "+Arrays.toString(array));//[1, 3, 4, 0, 5, 8, 7, 6, 2, 9]

        System.out.println("===========================" );

        //1-ца окажется в начале
        System.out.println("Перед гонением: "+Arrays.toString(array));//[1, 3, 4, 0, 5, 8, 7, 6, 2, 9]
        gonimNaimElemVNachalo(array);
        System.out.println("После гонения в начало наименьшего: "+Arrays.toString(array));//[0, 1, 3, 4, 2, 5, 8, 7, 6, 9]

    }


    //1.1 Гоним наибольший эл-т в конец
    public static void gonimNaibElemVKonec(int[] array){
        //обязательно указываем array.length-1
        // т.к. последний элемент мы уже не сможем перевернуть в методе swap
        // (выйдет за границы массива)
        for(int i=0;i< array.length-1;i++){
            swapForGonNaib(array,i,i+1);
        }
    }
    //все ИЗМЕНЕНИЯ ЗДЕСЬ!!!!!
    //составная часть алгоритмов "обмен значениями элементов"
    //принцип в том, что только если выполнится условие, элементы поменяются местами
    public static void swapForGonNaib(int[] array, int frst, int scnd){
        if(array[frst]>array[scnd]){  //ДОБАВИЛИ УСЛОВИЕ!!!!
            int tmp = array[frst];
            array[frst] = array[scnd];
            array[scnd]=tmp;
        }
    }




    //2.1 Гоним наименьший эл-т в начало
    public static void gonimNaimElemVNachalo(int[] array){
        //указываем не i>=0 а только i>0 из за той же причины вверху
        // (чтобы не выйти заграницы в конце цикла)
        for(int i = array.length-1; i>0; i--){
            swapForGonNaim(array,i,i-1);
        }

    }
    //все ИЗМЕНЕНИЯ ЗДЕСЬ!!!!!
    //составная часть алгоритмов "обмен значениями элементов"
    //принцип в том, что только если выполнится условие, элементы поменяются местами
    public static void swapForGonNaim(int[] array, int frst, int scnd){
        if(array[frst]<array[scnd]){   //ДОБАВИЛИ УСЛОВИЕ!!!!
            int tmp = array[frst];
            array[frst] = array[scnd];
            array[scnd]=tmp;
        }
    }
}
