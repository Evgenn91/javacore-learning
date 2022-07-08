package RegularExpression.d.str.methods.replaceall.and.group;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class IntroduceGroup {
    public static void main(String[] args) {
        //3 номера банковской карты ( номер карты, дата мм.гг, код(он 3х значный)
        String number = "03213463453452342425674;" +
                "06223223421323795768561;" +
                "07233584694524728232435";

        //хотим сделать читабельный формат этой записи
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})"); //мы поделили на группы(группа выражение взятое в круглые скобки)
        //           наши группы:    1       2       3       4       5       6       7

        Matcher matcher = pattern.matcher(number);

//        String myNewString = matcher
//                .replaceAll("$5/$6 $1 $2 $3 $4 ($7)");  // $5 означает что берем пятую группу(группы идут с 1 а не с нуля
//
//        System.out.println(myNewString);
        // вывод: 24/25 0321 3463 4534 5234 (674);57/68 0622 3223 4213 2379 (561);82/32 0723 3584 6945 2472 (435)

        // чтобы был вывод на экран необходимо закомментировать 23-27 строчки
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        //вывод:
//        03213463453452342425674
//        06223223421323795768561
//        07233584694524728232435


        // чтобы был вывод на экран необходимо закомментировать 23-27 строчки
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
        //вывод:
//        674
//        561
//        435


    }
}
