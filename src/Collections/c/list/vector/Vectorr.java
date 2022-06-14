package Collections.c.list.vector;

import java.util.Vector;

/**
 * Vector - это устаревший synchronized class(по своей структуре похож на ArrayList)
 * В своей основе содержит массив элементов Object
 * методы в нем работают медленне, чем в ArrayList или LinkedList
 */
public class Vectorr {
    public static void main(String[] args) {
        Vector<String> listVector = new Vector<>();

        // 1 метод: add() - добавление в Vector
        listVector.add("Anna");
        listVector.add("Misha");
        listVector.add("Katia");

        // 2 метод: firstElement() - получение 1го эл-та из Vector
        System.out.println(listVector.firstElement());

        // 3 метод: lastElement() - получение последнего эл-та из Vector
        System.out.println(listVector.lastElement());

        // 4 метод: remove() - удаление из Vector по индексу
        listVector.remove(1);

        // 5 метод: get() - получение элемента по индексу Vector
        listVector.get(0);

    }
}
