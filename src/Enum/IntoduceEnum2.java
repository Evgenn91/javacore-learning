package Enum;

import java.util.Arrays;

/**
 * часто используемые методы:
 *     - valueOf
 *     - values
 */
public class IntoduceEnum2 {
    public static void main(String[] args) {
        WyWeekDays weekDays = WyWeekDays.FRIDAY;
        System.out.println(weekDays.getMood());//good
        System.out.println(weekDays);//FRIDAY

        WyWeekDays weekDays1 = WyWeekDays.FRIDAY;
        WyWeekDays weekDays2 = WyWeekDays.MONDAY;
        System.out.println(weekDays == weekDays1); //true
        System.out.println(weekDays == weekDays2); //false

        System.out.println(weekDays.equals(WyWeekDays2.FRIDAY)); //false

        WyWeekDays weekDays4 = WyWeekDays.valueOf("SUNDAY");
        System.out.println(weekDays4); //SUNDAY

        WeekDays[] arr = WeekDays.values();
        System.out.println(Arrays.toString(arr)); //[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
    }
}

enum WyWeekDays {
    MONDAY("calm"),
    TUESDAY("calm"),
    WEDNESDAY("so - so"),
    THURSDAY("so - so"),
    FRIDAY("good"),
    SATURDAY("funny"),
    SUNDAY("good");

    private String mood;

    //конструктор в enum всегда private!!!(можно прописывать, можно нет)
    //он срабатывает в момент определение переменной(сами мы его вызвать не можем(т.к. нелься создать enum с помощью "new"))
    //конструкторов может быть много
    WyWeekDays(String mood) { //данный конструктор вызывается для каждого элемента enum
        this.mood = mood;
    }

    String getMood(){
        return mood;
    }
}

enum WyWeekDays2 {
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();


}
