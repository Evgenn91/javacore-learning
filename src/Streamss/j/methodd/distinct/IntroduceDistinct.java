package Streamss.j.methodd.distinct;

import java.util.stream.Stream;

/**
 * метод distinct() - возвращает стрим уникальных элементов(а проверяет их с помощью метода equals()!!!)
 *           (i)
 *
 */
public class IntroduceDistinct {
    public static void main(String[] args) {
        Stream<Integer> str2 = Stream.of(11, 12, 13, 15 , 11 , 13, 3, 5);
        str2.distinct().forEach(e -> System.out.print(e + " "));  //11 12 13 15 3 5

    }
}
