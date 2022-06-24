package Streamss.a.introduce.streams.and.methos.map;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Stream - это интерфейс (стримы упростили работу с данными)
 * Stream - это последовательность элеметнов, поддерживающих последовательные и параллельные операции над ними(грубо говоря это поток данных)
 *
 * методы Sream:
 *  1) map()        - этот метод берет по очереди элемент из нашего стрима и сопоставляет ему элемент,
 *    (i)             который из него получается после применения на нем тех действий,
 *                    которые мы описываем внутри map с помощью лямбда выражений.
 *  map возвращает тоже Stream!!!
 *  данный метод и другие, которые пройдем они НЕ МЕНЯЮТ коллекцию, на которой они были вызваны
 *
 *  collect() - данный метод из Stream делает коллекцию(ставится последним)
 *
 */
public class IntroduceStreamsAndMethodMap {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");
        strList.add("twree");
        strList.add("four");
        strList.add("five");

        //хотим вместо слов поставить их длину
        //страый способ
//        for(int i = 0; i < strList.size(); i++){
//            strList.set(i, String.valueOf(strList.get(i).length()));
//        }

//        System.out.println(strList);

        //теперь стримами
        List<Integer> list22 = strList.stream().map(element -> element.length()).collect(Collectors.toList());
        //                                      |                             |  |                           |
        //                                      -----------------------------     ---------------------------
        //                                          здесь у нас будет теперь      преобразует стрим опять в коллекцию
        //                              Stream: 3 3 5 4 4 (тоесть поток уже чисел)


        System.out.println(strList); //[one, two, twree, four, five]
        System.out.println(list22);  //[3, 3, 5, 4, 4]

        System.out.println("-------------");
        System.out.println("-------------");

        //применение метода map для массива
        int[] arr = {5,9,3,54,7};
        //сделаем если наш элемент делится на 3 то делим, если не делится то ничего не делаем с ним
        arr = Arrays.stream(arr).map(element ->{
            if(element%3==0){
                element = element/3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(arr)); // [5, 3, 1, 18, 7]

        System.out.println("-------------");
        System.out.println("-------------");

        //пример с Set
        Set<String> mySet = new TreeSet<>();
        mySet.add("one");
        mySet.add("two");
        mySet.add("twree");
        mySet.add("four");
        mySet.add("five");
        System.out.println(mySet); //[five, four, one, two, twree]

        Set<Integer> resultSet =  mySet.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(resultSet);  // [3, 4, 5] - дубликаты удалились!!!
        List<Integer> resultList =  mySet.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(resultList); // [4, 4, 3, 3, 5]
    }
}
