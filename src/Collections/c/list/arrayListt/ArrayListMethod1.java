package Collections.c.list.arrayListt;

import java.util.ArrayList;

/**
 * Здесь рассмотрим методы:
 * ADD - добавить
 * GET - взять
 * SET - перезаписать
 * REMOVE - удалить
 *
 */
public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        //1 метод: add(добавление элемента на последующую позицию) - ArrayList.add(element) -> boolean;
        boolean checkAdd = arrayList.add("one");

        //1 метод*: add(добавление элемента в определенную позицию(если там уже есть елемент - он его сместит)) - ArrayList.add(position index, element) -> void;
        arrayList.add(1, "two");
        /* Есть нюанс!!! Добавление возможно при выборе позиций которые существуют или следующую
        * тоесть, если в списке уже 3 элемента, то индекс можно поставить 0 - 2 и 3!!!!*/

        //2 метод: get(возвращает элемент на определенной позиции) - ArrayList.get(position index) -> DataType;
        String correctElement = arrayList.get(0); /* незабываем что отсчет в массиве идет с 0 !!! */

        //3 метод: set(вставляет элемент в определенный индекс(тоесть он перезапишет эту ячейку!!!)) - ArrayList.set(position index, new Element) -> DataType;
        String correctElementForSet = arrayList.set(0, "newOne"); /* нюанс!!! индекс можно записать только элемента, который есть в списке */

        //4 метод: remove(удаление определенного элемента(по индексу)) - ArrayList.remove(position index) -> DataType;
        String remElem = arrayList.remove(1); /* удалить можно только элемент, который есть в списке*/
        //ПРИ УДАЛЕНИИ ВСЕ ЭЛЕМЕНТЫ СМЕЩАЮТСЯ

        //4 метод*: remove(удаление определенного элемента(по ссылке на объект)) - ArrayList.remove(CorrectElement) -> boolean;
        //поиск элемента для удаления осуществляется с помощью метода equals объекта!!!!!(если не переопределили его то поиск по ссылке)
        boolean checkElem = arrayList.remove("one"); /* вернет false если такой элемент не найдет */
        //у нас выведет false т.к. нужна ссылка на объект
        //ПРИ УДАЛЕНИИ ВСЕ ЭЛЕМЕНТЫ СМЕЩАЮТСЯ



    }


}
