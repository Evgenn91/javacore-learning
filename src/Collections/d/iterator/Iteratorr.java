package Collections.d.iterator;

import java.util.ArrayList;
import java.util.Iterator;



public class Iteratorr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){ //iterator.hasNext() - говорит есть ли дальше элемент или нет
            System.out.println(iterator.next());
        }

        //отличие iterator от for-each: с помощью итератора мы можем удалить элемент из коллекции
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
