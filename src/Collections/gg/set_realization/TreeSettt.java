package Collections.gg.set_realization;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet - хранит элементы в отсортированном порядке по возрастанию
 * В основе TreeSet лежит TreeMap
 * значения в TreeSet это ключи в TreeMap
 * null хранить нельзя (будет ошибка)
 *
 * используя с объектами как всегда нужно использовать Comparator
 *
 * правило при леализации equals:
 * если a.equals(b)  -> true
 * то тогда: a.compareTo(b) должен возвращать 0 !!!(тоесть должны использоваться одинаковые поля для сравнения!!!)
 */
public class TreeSettt {
    public static void main(String[] args) {
        Set<Integer> setttList = new TreeSet<>();

        setttList.add(4);
        setttList.add(1);
        setttList.add(3);
        setttList.add(7);
        setttList.add(123);
        setttList.add(54);

        //методы знакомы:
        //remove
        //contains
        //..


        //методы TreeSet:

        //first() отдает первый элемент
        //last() отдает последний элемент
        //headSet() отдает список элементов до определенного, которого укажем(все кто ниже)
        //tailSet() отдает список элементов до определенного, которого укажем(все кто выше)
        //subSet() отдаест список элементов, находящихся между двумя какими то определенными элементами(мы их задаем)

    }
}
