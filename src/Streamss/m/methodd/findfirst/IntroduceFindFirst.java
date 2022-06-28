package Streamss.m.methodd.findfirst;


import java.util.stream.Stream;

/**
 * метод findFirst() - будет вовращать нам первый элемент нашего стрима
 *         (t)
 */
public class IntroduceFindFirst {
    public static void main(String[] args) {
        Stream<Integer> str1 = Stream.of(143, 12, 13, 15 , 11 , 13, 3, 5);
        System.out.println(str1.findFirst().get()); //143
    }
}
