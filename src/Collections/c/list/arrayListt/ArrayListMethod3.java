package Collections.c.list.arrayListt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Рассмотрим помимо методов ArrayList, еще и методы, связанные с ним:
 * 1) Arrays.asList - получение List из массива
 * 2) toArray() - получение массива из List(без сохранения типа)
 * 3) toArray(T[] a) - получение массива из List(с сохранением типа)
 * 4) removeAll - удаление в массиве элементов, соотв элементам из переданного массива
 * 5) retainAll - оставит в нашем list те элементы, которые есть в list аргументе
 * 6) containsAll - проверяет содержит ли наш лист все элементы из листа-параметра
 * 7) subList - возвращает List "отрывок" из нашего листа(в зависимость от переданных индексов
 * вышли после 8ой java:
 * 8) List.of - добавление элементов в List без метода add
 * 9) List.copyOf - создает list их переданной в него списка Collection
 */

public class ArrayListMethod3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");

        //1 метод:Arrays.asList - получение List из массива
        //формула: Arrays.asList(DataType[]) -> List<DataType>
        StringBuilder[] array = {stringBuilder1, stringBuilder2, stringBuilder3};
        List<StringBuilder> list = Arrays.asList(array);
        //нюанс: если в array изменить какие то переменные, то и в list эти данные поменяются!!!(list связан тесно с array)

        //2 метод:toArray() - получение массива из List(без сохранения типа)
        //формула: toArray() -> Object[]
        ArrayList<String> listt = new ArrayList<>();
        listt.add("One");
        listt.add("Two");
        listt.add("Three");
        Object[] arrObjFromList = listt.toArray();

        //3 метод:toArray(T[] a) - получение массива из List(с сохранением типа)
        //формула: toArray(T[] a) -> T[]
        String[] arrStrFromListt = listt.toArray(new String[0]); //можно написать 0 т.к. java сама нужной дляны создаст

        //4 метод:removeAll - удаляет из массива все элементы, которые сомпадают с елементами переданного в аргумент массива
        // схема: removeAll(Collection<?> c) -> boolean)
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("One");
        listOne.add("Two");

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("One");
        listTwo.add("Two");
        listTwo.add("Three");
        listTwo.add("Four");

        listTwo.removeAll(listOne); //listTwo = [Three, Four]


        //5 метод: retainAll - оставит в нашем list те элементы, которые есть в list аргументе
        // схема: retainAll(Collection<?> c) -> boolean)
        ArrayList<String> listOne1 = new ArrayList<>();
        listOne1.add("One");
        listOne1.add("Two");

        ArrayList<String> listTwo2 = new ArrayList<>();
        listTwo2.add("One");
        listTwo2.add("Two");
        listTwo2.add("Three");
        listTwo2.add("Four");

        listTwo2.retainAll(listOne1); //listTwo2 = [One, Two]

        //6 метод: containsAll - проверяет содержит ли наш лист все элементы из листа-параметра
        // схема: containsAll(Collection<?> c) -> boolean)
        ArrayList<String> listOne3 = new ArrayList<>();
        listOne3.add("One");
        listOne3.add("Two");

        ArrayList<String> listTwo4 = new ArrayList<>();
        listTwo4.add("One");
        listTwo4.add("Two");
        listTwo4.add("Three");
        listTwo4.add("Four");

        boolean result = listTwo4.containsAll(listOne3); //result = true

        //7 метод: subList - возвращает List "отрывок" из нашего листа(в зависимость от переданных индексов
        // схема: subList(int fromIndex, int toIndex) -> List<E>)
        //toIndex - это номер параметра, "не включенного" в наш список
        ArrayList<String> listTwo5 = new ArrayList<>();
        listTwo5.add("One");
        listTwo5.add("Two");
        listTwo5.add("Three");
        listTwo5.add("Four");

        listTwo5.subList(1,3);  // [Two, Three]
        //нюанс: получившийся массив связан с нашим старым массивом!!!
        //тоесть если добавим что то в получившийся массив, то это добавится и в наш первоначальный массив
        //НО если добавим в наш первоначальный массив что то и потом захотим вывести получившийся массив
        //на экран, то будет ошибка!!!(при выводе первоначального массива ошибки не будет)


        //методы 8 и 9 вышли после 8ой Java!!!!

        //8 метод: List.of - добавление элементов в List без метода add
        // схема: List.of(E...elements) -> List<E>) //на выходе неизменяемый List будет!!!1
//        List<Integer> listTwo9 = List.of(1,2,3);
        //теперь если захотим listTwo8.add(13); - выдаст ошибку!!!


        //9 метод: List.copyOf - создает list их переданной в него списка Collection
        // схема: List.copyOf(Collection<E> c) -> List<E>) //на выходе неизменяемый List будет!!!1
        ArrayList<String> listTwo8 = new ArrayList<>();
        listTwo8.add("One");
        listTwo8.add("Two");
        listTwo8.add("Three");
        listTwo8.add("Four");

//        List<String> listtttt = List.copyOf(listTwo8);

    }
}
