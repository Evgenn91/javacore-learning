package Streamss.c.methodd.foreach.and.shortt.lambd.express;

import java.util.Arrays;

/**
 * метод forEach() -  (возвращает после себя void (тоесть ничего не возвращает
 *        (t)         (после него тоесть нельзя создать например список с помощью collect())))
 *
 *    данный метод помогает проходится по всем элементам и например выводить на экран эти элементы
 */
public class IntroduceForEach {
    public static void main(String[] args) {
        int[] arr = {3,5,123,6,34,6};

        //выведем на экран(но перед этим умножим каждый на 2)
        Arrays.stream(arr).forEach(el -> {
            el *= 2;
            System.out.println(el);}
        );
        System.out.println("-------------");
        //просто выведем
        Arrays.stream(arr).forEach( el ->  System.out.println(el) );
        System.out.println("-------------");

        //более короткая запись написания лямбда выражения!!!!
        Arrays.stream(arr).forEach(System.out::println); //это называется метод reference(мы даем ссылку на наш метод printli())

        System.out.println("-------------");
        Arrays.stream(arr).forEach(Utils :: myMethod); //что тут говорится(каждый элемент потока помести в метод myMethod котор находится в классе Utils)
//        Arrays.stream(arr).forEach(elem -> Utils.myMethod(elem));



    }
}

class Utils{
    public static void myMethod(int a){
        a += 5;
        System.out.printf("Elem = " + a+", ");
    }
}

