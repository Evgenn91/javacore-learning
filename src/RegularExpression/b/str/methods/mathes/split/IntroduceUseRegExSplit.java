package RegularExpression.b.str.methods.mathes.split;

import java.util.Arrays;

/**
 * public String[] split(String RegEx)
 */
public class IntroduceUseRegExSplit {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                " email: vivaniv@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Maria, Ukraine, Kyev, Lomonosov Street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +"" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21,"+
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        //введение в метод split
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

    }
}
