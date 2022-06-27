package Streamss.g.methodd.concat;

import java.util.stream.Stream;

/**
 * метод concat() - конкатенация стримов(данный метод статический)
 *                 возвращает стрим но не может быть использован в цепочке!!!(тоесть он и не терминал и не интермидиат метод)
 *
 */
public class IntroduceConcat {
    public static void main(String[] args) {

        Stream<Integer> str2 = Stream.of(11, 12, 13, 15);
        Stream<Integer> str3 = Stream.of(21, 22, 23, 4, 25, 26);
        Stream<Integer> strResult = Stream.concat(str2, str3);
        strResult.forEach( e -> System.out.print(e + " ")); //11 12 13 15 21 22 23 4 25 26
    }
}
