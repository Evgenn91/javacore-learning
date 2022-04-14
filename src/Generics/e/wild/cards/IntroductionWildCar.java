package Generics.e.wild.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * wild card - означает "сильная карта"
 * здесь это подразумевает символ "?" (супер тип)
 */
public class IntroductionWildCar {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>(); // так нельзя!!!!
        List<?> list1 = new ArrayList<Integer>(); //а так можно!!!

        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        showList(list2);

    }

    //напишем метод, который выводит на экран любой список
    public static void showList(List<?> list) {
        System.out.println("myList " + list);
    }
}
