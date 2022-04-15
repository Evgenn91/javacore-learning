package Generics.e.wild.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * wild card - означает "сильная карта"
 * здесь это подразумевает символ "?" (супер тип для любого List)
 * вместо ? может дыть подставлен любой класс
 */
public class IntroductionWildCar {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>(); // так нельзя!!!!
        List<?> list1 = new ArrayList<String>(); //а так можно!!!
//        list1.add("hello"); // так сделать нельзя!!!(компилятор незнает какого типа наш лист)
        //когда мы используем wildcard мы не можем вызывать методы, которые могут изменить наш объект (один из них это метод add)

        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.4);
        list2.add(3.343);
        showList(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("Poka");
        list3.add("Hello");
        showList(list3);

    }

    //напишем метод, который выводит на экран любой список
    //если мы вместо ? напишем Object то мы в ArrayList сможем передать только объект Object!!!
    public static void showList(List<?> list) {
        System.out.println("myList " + list);
    }
}
