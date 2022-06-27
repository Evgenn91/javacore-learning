package Streamss.i.methodd.count;

import java.util.stream.Stream;

/**
 * метод count() - считает колличество элементов в стриме и возвращает Long
 *         (t)
 *
 */
public class IntroduceCount {
    public static void main(String[] args) {
        Stream<Integer> str1 = Stream.of(11, 12, 13, 15 , 11 , 13, 3, 5);
        Stream<Integer> str2 = Stream.of(11, 12, 13, 15 , 11 , 13, 3, 5);
        System.out.println(str1.count()); //8
        //так сделали потому что стрим после обработки нельзя переиспользовать!!!
        System.out.println(str2.distinct().count());//6


    }
}
