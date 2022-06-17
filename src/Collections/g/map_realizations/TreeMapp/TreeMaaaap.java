package Collections.g.map_realizations.TreeMapp;


import java.util.Objects;
import java.util.TreeMap;

/**
 * НЕ ИСПОЛЬЗУЕТ HASH КОДЫ
 * не является синхронизированной оллекцией
 *
 * Элементами TreeMap тоже являются пары ключ-значение(ключи так же должны быть уникальными)
 * элементы хранятся в отсортированном по возрастанию порядке(сортировка по ключу)
 * Использует совершенно другой способ хранения элементов в отличие от HashMap
 *
 * В основе TreeMap лежит красно-черное дерево(это самобалансируещееся дерево)
 * (это позволяет методам работать быстро, но не быстрее чем в HashMap)
 *
 * метожы у него(срабатывают за O(logn)):
 *  - put
 *  - get
 *  - remove
 *  - descendingMap - разворачивает TreeMap в обратную сторону
 *  - tailMap - (основная задача TreeMap - это нахождение отрезков) и этот метод отдаст нам все значения
 *  с ключами, значения которых больше, чем заданное нами
 *  - headMap - противоположен методу tailMap, отдаст значения у котор ключ меньше чем заданный нами
 *  - lastEntry - отдает элемент, который находится в самом конце
 *  - firstEntry - отдает элемент, который находится в начале
 *
 *  если ключ будет наш объект, то нужно, чтобы он реализовал интерфейс Comparable!!!
 *  или можно в момент создания treemap прописать, как будет выглядеть Comparator
 *  пример: TreeMap<Student2, Student2> listTrMap2 = new TreeMap<>(new Comparator<Student2>() {
 *             @Override
 *             public int compare(Student2 o1, Student2 o2) {
 *                 return 0;
 *             }
 *         });
 *
 *  при работе с TreeMap нет необходимости переопределять hashcode и equals для объекта ключа(поиск и добавление идут с помощью compare метода)
 *  но это правило не относится к значениям элементов treemap(тоесть для корректной работы например метода containsValue нужен equals)
 *
 */

public class TreeMaaaap {
    public static void main(String[] args) {
        TreeMap<Double, Student2> listTrMap = new TreeMap<>();

        Student2 std1 = new Student2("Ivan", 3);
        Student2 std2 = new Student2("Kolya", 1);
        Student2 std3 = new Student2("Sergei", 4);
        Student2 std4 = new Student2("Kirill", 2);
        Student2 std5 = new Student2("Zayr", 3);

        listTrMap.put(6.5,std1);
        listTrMap.put(7.3,std2);
        listTrMap.put(8.7,std3);
        listTrMap.put(9.4,std4);
        listTrMap.put(6.9,std5);

        System.out.println(listTrMap);

        System.out.println(listTrMap.descendingMap());

        System.out.println(listTrMap.tailMap(7.0));//отдаст все значения, у которых ключ больше данного значения
    }
}

class Student2 {
    String name;
    int course;

    Student2(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
