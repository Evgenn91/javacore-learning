package RegularExpression.c.check.ipp.addresss;

import java.util.regex.Pattern;

/**
 * пример проверки ip адреса
 */
public class ExampleCheckIpAddress {
    public static void main(String[] args) {
//        0-255.0-255.0-255.0-255
        String ip1 = "233.132.215.123";
        String ip2 = "263.132.215.123";

        ExampleCheckIpAddress exampleCheckIpAddress = new ExampleCheckIpAddress();
        exampleCheckIpAddress.checkIp(ip1);
        exampleCheckIpAddress.checkIp(ip2);
    }

    void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
//        (25[0-5]  |    2[0-4]\d   |     [01]?\d?\d)                    (\.)
//        250 - 255      200 - 249        0 - 199

        System.out.println(ip +  "it's ok? " + Pattern.matches(regex,ip));
    }
}
