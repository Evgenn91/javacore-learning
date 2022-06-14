package Collections.g.hash_structures.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Введение в Map
 * Map - это интерфейс(не наследует интерфейс Collection)
 * элементы Map - это пары
 * у нее 3 основных наследника:
 * 1) HashMap(прямой наследник)(LinkedHashMap наследует HashMap уже)
 * 2) TreeMap(не прямой наследник (прямой это SortedMap, потом NavigableMap и потом токо TreeMap - рассмотрим только TreeMap)
 * 3) HashTable(прямой наследник)
 */
public class IntroduceInMap {
    //Основный нюансы HashMap:
    //элементы HashMap - это пары
    //не запоминает порядок добавления
    //методы работают очень быстро

    //ключи:
    // - могут быть null
    // - должны быть уникальными(если добавить еще один элемент с ключем, который есть то значение перезапишется!!!)

    //значения:
    // - могут быть null
    // - могут повторяться

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        //1 метод: put() - добавление элементов
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");

        //2 метод: putIfAbsent() - добавит элемент в коллекцию, только если такого элемента еще нету

        //3 метод: get() - получение элемента по ключу
        System.out.println(map1.get(3));

        //4 метод: remove() - удаление элемента по ключу
        map1.remove(1);

        //5 метод: containsValue() - вернет true если в мапе есть такое значение
        System.out.println(map1.containsValue("two"));

        //6 метод: containsKey() - вернет true если в мапе есть такой ключ
        System.out.println(map1.containsKey(4));

        //7 метод: keySet() - возвращает множество всех ключей(вернет я как поняд коллекцию HashSet)
        System.out.println(map1.keySet());

        //8 метод: values() - возвращает множество всех значений
        System.out.println(map1.values());

        //9 метод: entrySet() - пока не разобрали


    }
}
