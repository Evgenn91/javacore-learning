package Generics.e.wild.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * здесь мы показываем как можно выставить границы WildCar(с помощъю слов extends или super)
 */
public class BoundedWildCar {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        //такое написание уже корректное(по сравнению с таким: List<?> list = new ArrayList<Integer>();)
        // а также Integer подходит под описание условия(? extends Number) тоесть он наследник Numbers

        List<? super Number> list1 = new ArrayList<Number>();
        //при написании super мы можем использовать либо Number либо его super классы(например Object), если они существуют

        //Пример для exdends:
        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.4);
        list2.add(3.343);
        System.out.println(summ(list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(14);
        list3.add(25);
        System.out.println(summ(list3));



    }

    //создадим метод, который находит сумму всех элементов ArrayList
    public static double summ(List<? extends Number> list) {
        double summm = 0;
        for (Number oneElem : list) {
            summm += oneElem.doubleValue();
        }
        return summm;
    }
}
