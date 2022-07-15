package Enum;

/**
 * Enum - это способ ограничения определенного рода информации конкретным списком возможных вариантов
 *
 * - от Enum нельзя унаследоваться
 * - конструкторы в enum всегда private
 * нельзя создать как локальный класс
 */
public class IntroduceEnum {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
    }
}

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY, SUNDAY
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to the work!!!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("just relax my fellow");
                break;
        }

    }

}
