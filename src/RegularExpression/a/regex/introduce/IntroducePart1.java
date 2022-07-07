package RegularExpression.a.regex.introduce;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введение в регулярные выражения - часть 1
 *
 * Регулярные выражения необходимы для создания шаблонов, с помощью которых производят такие операции как
 * поиск, сравнение, замена.
 *
 * Регулярные выражения - это совокупность символов, некоторые из которых являются специальными - метасимволами,
 *                        (т.е. обладают каким то функционалом)
 *
 *  java.util.regex - пакет где находятся спец классы для работы с регулярными выражениями
 *
 *  Pattern myPattern = Pattern.compile(REGEX);
 *  Matcher myMatcher = myPattern.matcher(myString);
 *
 *  Часто используемые символы в RegEx:
 *
 *  (разбираем в классе IntroducePart1)
 *   - abc - соотв последовательно идущим abc
 *   - [abc] - соотв или a, или b, или c
 *   - [d-j] - соотв одной из букв из диапазона d-j
 *   - [3-8] - соотв одной из цифр из диапазона 3-8
 *   - [B-Fd-j3-8] - соотв одной из букв из обоих диапазонов или одной из цифр из диапазона 3-8
 *   - (a|b) - соответствует либо букве a, либо букве b
 *
 *
 *   - [^d-j] - символ стоящий в начале скобок(у нас ^) ознаяает отрицание. соотв одной из букв НЕ из диапазона d-j
 *   (отсюда разбираем в классе IntroducePart2)
 *   - [.] - соответствует одному любому символу (кроме символа новой строоки)
 *   - ^выражение - соответствует выражению в начале строки
 *   - выражение$ - соответствует выражению в конце строки
 *
 *   - \d - соответствует одной цифре
 *   - \D - соответствует одное НЕ цифре
 *   - \w - соотыетствует одной цифре, букве или "_"
 *   - \W - соответствует одному не символу, который НЕ цифра, НЕ буква или НЕ "_"
 *   - \s - соответствует пробельному символу  (тоже самое что [\t\n\r\f])
 *   - \S - соответствует НЕ пробельному символу
 *
 *   - \A - соответствует выражению в начале String
 *   - \Z - соответствует выражению в конце String
 *   - \b - соответствует границе слова или числа
 *   - \B - соответствует границе НЕ слова или НЕ числа
 *
 *   - выражение? - соответствует 0 или 1 повторение
 *   - выражение* - соответствует 0 или большему колличеству повторений
 *   - выражение+ - соответствует 1 или большему колличеству повторений
 *   - выражение{n} - соответствует колличеству повторений "n"   (выражение перед ним должно быть в кругдых скобках!!!)
 *   - выражение{m,n} - соответствует колличеству повторений от "m" до "n"  (выражение перед ним должно быть в кругдых скобках!!!)
 *   - выражение{n,} - соответствует "n" или большему колличеству повторений   (выражение перед ним должно быть в кругдых скобках!!!)
 */
public class IntroducePart1 {
    public static void main(String[] args) {
        String str1 = "ABCD ABCE ABCFEFGJ";
        Pattern pattern1 = Pattern.compile("ABCD"); //пишем регулярное выражение(шаблон, по которому производим поиск)
        Matcher matcher1 = pattern1.matcher(str1);//данный класс находит соответствия с шаблоном
        while(matcher1.find()){//вернет true если было найдено какое то совпадение(если несколько раз наудено совпадение то неск раз вернет true)
            System.out.println(matcher1.group()); // вывод: ABCD
        }

        System.out.println("--------------------");
        Pattern pattern2 = Pattern.compile("ABC");
        Matcher matcher2 = pattern2.matcher(str1);
        while(matcher2.find()){
            System.out.println("position(2) = " + matcher2.start() + " " + matcher2.group());
            //вывод:
//            position = 0 ABC
//            position = 5 ABC
//            position = 10 ABC
        }

        System.out.println("--------------------");
        String str2 = "AFRWABDFCD";
        Pattern pattern3 = Pattern.compile("[ABC]");
        Matcher matcher3 = pattern3.matcher(str2);
        while(matcher3.find()){
            System.out.println("position(3) = " + matcher3.start() + " " + matcher3.group());
            //вывод:
//            position = 0 A
//            position = 4 A
//            position = 5 B
//            position = 8 C
        }

        System.out.println("--------------------");
        String str3 = "ABDOPABXOPABCOP";
        Pattern pattern4 = Pattern.compile("AB[C-F]OP");
        Matcher matcher4 = pattern4.matcher(str3);
        while(matcher4.find()){
            System.out.println("position(4) = " + matcher4.start() + " " + matcher4.group());
            //вывод:
//            position = 0 ABDOP
//            position = 10 ABCOP
        }

        System.out.println("--------------------");
        String str4 = "ABDOPAB5OPABxOP";
        Pattern pattern5 = Pattern.compile("AB[A-Fa-f0-9]OP");
        Matcher matcher5 = pattern5.matcher(str4);
        while(matcher5.find()){
            System.out.println("position(5) = " + matcher5.start() + " " + matcher5.group());
            //вывод:
//            position = 0 ABDOP
//            position = 5 AB5OP
        }

        System.out.println("--------------------");
        String str5 = "ABDOPAB5OPABxOP";
        Pattern pattern6 = Pattern.compile("AB[A-Fa-f0-9]OP");
        Matcher matcher6 = pattern6.matcher(str5);
        while(matcher6.find()){
            System.out.println("position(6) = " + matcher6.start() + " " + matcher6.group());
            //вывод:
//            position = 0 ABDOP
//            position = 5 AB5OP
        }

        System.out.println("--------------------");
        String str6 = "ABDOPAB5OPABxOP";
        Pattern pattern7 = Pattern.compile("AB[^A-Fa-f0-9]OP");
        Matcher matcher7 = pattern7.matcher(str6);
        while(matcher7.find()){
            System.out.println("position(7) = " + matcher7.start() + " " + matcher7.group());
            //вывод:
//          position(7) = 10 ABxOP

        }

        System.out.println("--------------------");
        String str7 = "ABDOPAB5OPABxOP";
        Pattern pattern8 = Pattern.compile("AB(D|x)OP");
        Matcher matcher8 = pattern8.matcher(str7);
        while(matcher8.find()){
            System.out.println("position(8) = " + matcher8.start() + " " + matcher8.group());
            //вывод:
//            position(8) = 0 ABDOP
//            position(8) = 10 ABxOP

        }
    }
}
