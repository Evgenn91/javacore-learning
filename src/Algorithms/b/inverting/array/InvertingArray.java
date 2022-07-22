package Algorithms.b.inverting.array;

import java.util.Arrays;

/**
 * Алгоритм инвертирования массива циклом и рекурсией
 * Идея: циклом проходим до середины массива и каждое значение меняем
 * со значением "зеркально расположенним" этому, во второй половине массива
 *
 * Тоесть: 1ое меняем с последним, 2ое с предпоследним и т. д. до середины массива
 */

public class InvertingArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};


        System.out.println("Перед инвертированием с помошью цикла: "+ Arrays.toString(array));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        invertCikl(array);
        System.out.println("После инвертирования с помошью цикла: "+Arrays.toString(array));//[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        System.out.println("===========================" );


        //здесь разница в том что помимо самого массива, нам необходимо еще передать индекс элемента в массиве
        //а раз у нас идея этой рекурсии в том, что мы просто идем до середины вызывая постоянно сами себя(я про метод)
        //то передаем индекс первого элемента(а в самой рекурсии метода мы инкрементируем это значение)
        System.out.println("Перед инвертированием с помошью рекурсии: "+ Arrays.toString(array));//[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        invertRek(array, 0);
        System.out.println("После инвертирования с помошью рекурсии: "+Arrays.toString(array));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("===========================" );


        String str = "Строка для инвертирования";
        System.out.println("Перед инвертированием строки: "+ str);//Строка для инвертирования
        String invertStr = invertCiklString(str);
        System.out.println("После инвертирования строки: "+ invertStr);//яинаворитревни ялд акортС

    }

    //1 Инвертирование массива с помощью цикла
    public static void invertCikl(int[] array){
        //цикл до середины массива!! (если цикл будет нечетный то при делении все все равно хорошо будет)
        //(мы просто не затронем число по середине)
        for(int i=0;i< array.length/2;i++){
            int tmp = array[i];
            array[i] = array[array.length-1-i];  //здесь важная строчка(тут мы определили положение зеркального числа в массиве)
            array[array.length-1-i]=tmp;
        }
    }

    //2 Инвертирование массива с помощью рекурсии
    /**Идея этой рекурсии в том, что пока мы не дошли до середины массива
     * мы меняем местами зеркально элементы
     * и вызываем дальше наш метод
     */
    public static void invertRek(int[] array,int k){
        if(array.length/2>k){
            int tmp = array[k];
            array[k] = array[array.length-1-k];
            array[array.length-1-k]=tmp;
            invertRek(array,k+1);  //поменяли местами элементы и пошли дальше инкрементируя наше значение

        }


    }

    //1.2 Инвертирование массива с помощью цикла(инвертируем строку)
    public static String invertCiklString(String str){
        //все тоже самое, только мы работаем со строками
        char[] arrChars = str.toCharArray();
        for(int i=0;i< arrChars.length/2;i++){
            char tmp = arrChars[i];
            arrChars[i] = arrChars[arrChars.length-1-i];  //здесь важная строчка(тут мы определили положение зеркального числа в массиве)
            arrChars[arrChars.length-1-i]=tmp;
        }
        return new String(arrChars);
    }
}
