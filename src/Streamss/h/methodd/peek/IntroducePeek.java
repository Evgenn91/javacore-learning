package Streamss.h.methodd.peek;

import java.util.stream.Stream;

/**
 * метод peek() - принимает как и forEach в параметр Consumer, но в отличие от forEach
 *         (i)    данный метод возвращает не void а stream!!!
 *
 */
public class IntroducePeek {
    public static void main(String[] args) {
        Stream<Integer> str1 = Stream.of(11, 12, 13, 15 , 11 , 13, 3, 5);
        System.out.println(str1.distinct().peek(s -> System.out.print("*" + s + "*")).count());//*11**12**13**15**3**5*6
    }
}
