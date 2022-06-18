package Collections.gg.set_realization;

import java.util.LinkedHashSet;

/**
 * LinketHashSet наследник HashSet
 * Хранит информацию о порядке добавления элементов
 * Производительность методов немного ниже чем у HashSet
 *
 * В основе LinkedHashSet лежит HashMap
 */
public class LinkedHashSett {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ss = new LinkedHashSet<>();
        ss.add(1);
        ss.add(4);
        ss.add(6);
        ss.add(7);
        ss.add(9);
    }
}
