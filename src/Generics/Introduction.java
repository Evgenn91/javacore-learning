package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * причины использования дженериков:
 * 1) Создаем коллекции только с определенными элементами
 *  и на уровне компиляции назодим ошибки
 *  2) Дженерики позволяют нам не создавать похожие классы, методы а использовать дженерики
 */
public class Introduction {
    public static void main(String[] args) {
//        List list = new ArrayList<>(); /* ТАК НИКТО НЕ ПИШЕТ !!!! - сырой тип */
//        list.add("OK");
//        list.add(3);
//        list.add(new StringBuilder("abc"));

//        //выводим на экран
//        for (Object o : list) {
//            System.out.println("row: "+o);
//        }


        List list1 = new ArrayList<>(); /* ТАК НИКТО НЕ ПИШЕТ !!!! - сырой тип */
        list1.add("OK");
        list1.add("segsef");
        list1.add("shsethrgrd");

        //выводим на экран
        for (Object o : list1) {
            System.out.println("lenght string: "+ ((String) o).length());
        }

    }
}
