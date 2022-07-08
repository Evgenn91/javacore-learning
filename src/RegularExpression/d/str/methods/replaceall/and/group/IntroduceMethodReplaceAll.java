package RegularExpression.d.str.methods.replaceall.and.group;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class IntroduceMethodReplaceAll {
    public static void main(String[] args) {
        String s1 = "Privet  my drug,   hi are   you?  idet  izychenbie";
        System.out.println(s1);

        s1 = s1.replace("drug", "fellow");
        System.out.println(s1); //Privet  my fellow,   hi are   you?  idet  izychenbie

//        s1 = s1.replaceAll(" {2,}"," "); //меняем 2 и больше пробелов на 1 пробел
        //вывод: Privet my fellow, hi are you? idet izychenbie

//        s1 = s1.replaceAll("\\bi\\w+","4444"); //слова ничинающиеся на i меняем на 4444
        //вывод: Privet  my fellow,   hi are   you?  4444  4444

        s1 = s1.replaceFirst("\\bi\\w+","4444"); //первое слово начинающиеся на i меняем на 4444
        //вывод: Privet  my fellow,   hi are   you?  4444  izychenbie

        System.out.println(s1);

    }
}
