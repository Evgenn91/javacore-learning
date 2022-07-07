package RegularExpression.a.regex.introduce;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class IntroducePart2 {
    public static void main(String[] args) {

        String str1 = "abcd abcr abceewr5";
        Pattern pattern1 = Pattern.compile("abc.");
        Matcher matcher1 = pattern1.matcher(str1);
        while(matcher1.find()){
            System.out.println("position(1) = " + matcher1.start() + " " + matcher1.group());
            //вывод:
//            position(1) = 0 abcd
//            position(1) = 5 abcr
//            position(1) = 10 abce
        }
        System.out.println("--------------------");

        String str2 = "abcd abcr abceewr5";
        Pattern pattern2 = Pattern.compile("^abc");
        Matcher matcher2 = pattern2.matcher(str2);
        while(matcher2.find()){
            System.out.println("position(2) = " + matcher2.start() + " " + matcher2.group());
            //вывод:
//           position(2) = 0 abc
        }
        System.out.println("--------------------");

        String str3 = "abcd abcr abceewr5";
        Pattern pattern3 = Pattern.compile("r5$");
        Matcher matcher3 = pattern3.matcher(str3);
        while(matcher3.find()){
            System.out.println("position(3) = " + matcher3.start() + " " + matcher3.group());
            //вывод:
//           position(3) = 16 r5
        }
        System.out.println("--------------------");

        String str4 = "ab1 d2";
        Pattern pattern4 = Pattern.compile("\\d"); //тоже самое что [0-9]
        Matcher matcher4 = pattern4.matcher(str4);
        while(matcher4.find()){
            System.out.println("position(4) = " + matcher4.start() + " " + matcher4.group());
            //вывод:                     при \D:
//            position(4) = 2 1          position(4) = 0 a
//            position(4) = 5 2          position(4) = 1 b
//                                       position(4) = 3
//                                       position(4) = 4 d
        }
        System.out.println("--------------------");


        String str6 = "a_1 $%";
        Pattern pattern6 = Pattern.compile("\\w");  //то же что и [A-Za-z0-9_]
        Matcher matcher6 = pattern6.matcher(str6);
        while(matcher6.find()){
            System.out.println("position(6) = " + matcher6.start() + " " + matcher6.group());
            //вывод:                         при \W:
//            position(6) = 0 a             position(6) = 3
//            position(6) = 1 _             position(6) = 4 $
//            position(6) = 2 1             position(6) = 5 %
        }
        System.out.println("--------------------");


        String str8 = "a1 $%";
        Pattern pattern8 = Pattern.compile("\\s");
        Matcher matcher8 = pattern8.matcher(str8);
        while(matcher8.find()){
            System.out.println("position(8) = " + matcher8.start() + " " + matcher8.group());
            //вывод:                          при \S:
//            position(8) = 2                 position(8) = 0 a
//                                            position(8) = 1 1
//                                            position(8) = 3 $
//                                            position(8) = 4 %
        }
        System.out.println("--------------------");

        String str9 = "abcd anc ab";
        Pattern pattern9 = Pattern.compile("\\w+");
        Matcher matcher9 = pattern9.matcher(str9);
        while(matcher9.find()){
            System.out.println("position(9) = " + matcher9.start() + " " + matcher9.group());
            //вывод:                          без + было бы так:
//            position(9) = 0 abcd            position(9) = 0 a
//            position(9) = 5 anc             position(9) = 1 b
//            position(9) = 9 ab              position(9) = 2 c
//                                            position(9) = 3 d
//                                            position(9) = 5 a
//                                            position(9) = 6 n  и т.д.
        }
        System.out.println("--------------------");

        String str10 = "abcd anc ab";
        Pattern pattern10 = Pattern.compile("\\w{2}");
        Matcher matcher10 = pattern10.matcher(str10);
        while(matcher10.find()){
            System.out.println("position(10) = " + matcher10.start() + " " + matcher10.group());
            //вывод:
//            position(10) = 0 ab
//            position(10) = 2 cd
//            position(10) = 5 an
//            position(10) = 9 ab
        }
        System.out.println("--------------------");

        String str11 = "abcd  anc   ab";
        Pattern pattern11 = Pattern.compile("\\w\\s+\\w");
        Matcher matcher11 = pattern11.matcher(str11);
        while(matcher11.find()){
            System.out.println("position(11) = " + matcher11.start() + " " + matcher11.group());
            //вывод:
//            position(11) = 3 d  a
//            position(11) = 8 c   a
        }
        System.out.println("--------------------");

        String str12 = "DABCDABABDA";
        Pattern pattern12 = Pattern.compile("D(AB)?"); //тут говорится ищем D за которым может идти AB а может и не идти
        Matcher matcher12 = pattern12.matcher(str12);
        while(matcher12.find()){
            System.out.println("position(12) = " + matcher12.start() + " " + matcher12.group());
            //вывод:                          если будет такой шаблон(D(AB)*):
//            position(12) = 0 DAB             position(12) = 0 DAB
//            position(12) = 4 DAB             position(12) = 4 DABAB
//            position(12) = 9 D               position(12) = 9 D
        }
        System.out.println("--------------------");

        String str13 = "abcd abcr abc45gsdrgh";
        Pattern pattern13 = Pattern.compile("\\Aabcd");
        Matcher matcher13 = pattern13.matcher(str13);
        while(matcher13.find()){
            System.out.println("position(13) = " + matcher13.start() + " " + matcher13.group());
            //вывод:                          если будет такой шаблон(rgh\\Z):
//            position(13) = 0 abcd            position(13) = 18 rgh
        }
        System.out.println("--------------------");

        String str14 = "abcd abcr abc45gsdrgh";
        Pattern pattern14 = Pattern.compile("[abcd][efgh3-8]");
        Matcher matcher14 = pattern14.matcher(str14);
        while(matcher14.find()){
            System.out.println("position(14) = " + matcher14.start() + " " + matcher14.group());
            //вывод:
//           position(14) = 12 c4
        }
        System.out.println("--------------------");

    }
}
