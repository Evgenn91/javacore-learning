package Collections.c.list.arrayListt;

import java.util.ArrayList;

/**
 * Здесь рассмотрим методы:
 * ADDALL - добавить список в список
 * CLEAR - очищает наш список
 * INDEXOFF - поиск элемента в списке и возвращает его положение(если несколько одинаковых, то вернет положение первого найденного)
 * LASTINDEXOFF - поиск элемента в списке и возвращает его положение(если несколько одинаковых, то вернет положение последнего найденного)
 * SIZE - возвращает размер списка
 * ISEMPTY -проверяет список на пустоту - возвращает boolean значение (true - если список пуст и false - если список не пуст)
 * CONTAINS -проверяет список на наличие элемента - вернет boolean значение (true - если данныей элемент присутствует в списке)
 * TOSTRING - преобразует наш список в String
 */

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        //1 метод: addAll(добавление списка в конец нашего списка) - ArrayList.addAll(ArrayList anotherList); -> boolean
        ArrayList<String> anothetArrayList = new ArrayList<>();
        anothetArrayList.add("anotherOne");
        anothetArrayList.add("anotherTwo");
        anothetArrayList.add("anotherThree");

        arrayList.addAll(anothetArrayList);
//        System.out.println(arrayList);

        //1 метод*: addAll(добавление списка в наш список начиная добавление с определенной позиции) - ArrayList.addAll(int index, ArrayList anotherList); -> boolean
        ArrayList<String> superAnotherArrayList = new ArrayList<>();
        superAnotherArrayList.add("superAnotherOne");
        superAnotherArrayList.add("superAnotherTwo");
        superAnotherArrayList.add("superAnotherThree");

        arrayList.addAll(1, superAnotherArrayList);
        System.out.println(arrayList);
        /* нюанс!!! он ничего не удалит, а просто сместит элементы кторые были на данных позициях*/

        //2 метод: clear(очищает наш список) - ArrayList.clear(); -> boolean
        arrayList.clear();

        //3 метод: indexOf(возвращает позицию элемента) - ArrayList.indexOf(Element ourElem); -> int(индекс необходимого объекта)
        //вернет -1 если такого объекта не найдет в списке!!!!
        //здесь также использует метод EQUALS для поиска !!!!!!!
        int indexOneElement = arrayList.indexOf("two");
//        System.out.println(indexOneElement);

        /* если будет несколько одинаковых строчек, то даст индекс ПЕРВОЙ, которую найдет */


        //4 метод: lastIndexOf(возвращает позицию элемента) - ArrayList.indexOf(Element ourElem); -> int(индекс необходимого объекта)
        //вернет -1 если такого объекта не найдет в списке!!!!
        //здесь также использует метод EQUALS для поиска !!!!!!!
        int lastIndexOneElement = arrayList.lastIndexOf("two");

        /* если будет несколько одинаковых строчек, то даст индекс ПОСЛЕДНЕЙ, которую найдет */

        //5 метод: size(вернет колличество элементов в списке) - ArrayList.size(); -> int(колличество элементов в списке)
        int sizeOurList = arrayList.size();

        //6 метод: isEmpty(вернет boolean значение пуст лист или нет) - ArrayList.isEmpty(); -> boolean(true если пустой и false если нет)
        boolean checkEmptyOfList = arrayList.isEmpty();

        //7 метод: contains(проверяет содержит ли наш список данный объект) - ArrayList.contains(Element ourElem); -> boolean(true если данный объект естьв листе)
        //здесь используется метод EQUALS для поиска !!!!!!!
        boolean checkContainElem = arrayList.contains("two");
//        System.out.println(checkContainElem);

        //8 метод: toSting() - преобразует наш список в String
        System.out.println(arrayList.toString()); /* так не пишем, потому что он по умолчанию вызывается */

    }
}
