package RegularExpression.a.regex.introduce;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                " email: vivaniv@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Maria, Ukraine, Kyev, Lomonosov Street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +"" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21,"+
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        //найдем все слова(не войтут ":" "+" и т.д.)
//        Pattern pattern1 = Pattern.compile("\\w+");

        //найдем все номера домов и квартир(состоят из 2ух цифр у нас)
//        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b"); // тут написано: граница слова (\\b)-2цифры(\\d{2})-граница слова(\\b)

        //найдем все номера телефонов
//        Pattern pattern1 = Pattern.compile("\\+\\d{9}"); // тут написано: идет символ "+" (\\+) - потом 9 цифр (\\d{9})

        //найдем все имейлы
        Pattern pattern1 = Pattern.compile("\\w+@\\w+\\.(ru|com)"); // тут написано: идет какое то коллво символов и букв(\\w+) - потом символ @ (так и пишем @)
//                                                                      - потом идет какое то коллво символов и букв(\\w+) - потом точка (\\.)
//                                                                      - потом идет "ru" или "com" ((ru|com))
        Matcher matcher1 = pattern1.matcher(s);
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }


    }
}
