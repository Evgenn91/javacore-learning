package Collections.c.list.linketListt;

import java.util.LinkedList;

/**
 * Строение LinkedList координально отличается от ArrayList
 * методы такие же, потому что унаследован тоже от Collection
 *
 * Элементы LinkedList хранят ссылки на предыдущий и следующий элемент
 * LinkedList знает адрес головы и хвоста
 * (взять элемент из LinkedList это трудозатратно)
 *
 * есть 2 вида LinkedList:
 * 1) Double - есть ссылка не предыдущий и следующий
 * 2) Single - есть ссылка только на следующий элемент
 * (в Java doubleLinkedList!!!!)
 *
 * LinkedList рациональнее использовать когда много операций: add и remove
 * но мало операций: get
 */

public class LinkedListt {

    public static void main(String[] args) {
        Student1 std1 = new Student1("Ivan", 3);
        Student1 std2 = new Student1("Kolya", 1);
        Student1 std3 = new Student1("Sergei", 4);
        Student1 std4 = new Student1("Kirill", 2);
        Student1 std5 = new Student1("Zayr", 3);

        LinkedList<Student1> std2LinkList = new LinkedList<>();
        std2LinkList.add(std1);
        std2LinkList.add(std2);
        std2LinkList.add(std3);
        std2LinkList.add(std4);
        std2LinkList.add(std5);

        //1 метод: get - получение элемента(намного медленне чем в ArrayList)
        // выводим элемент с позиции 2
        System.out.println(std2LinkList.get(2));

        Student1 std6 = new Student1("Inokentii", 1);
        Student1 std7 = new Student1("Ashot", 2);

        //2 метод: add - добавление элемента(быстрее чем в ArrayList)
        std2LinkList.add(std6);

        //3 метод: добавление в определенную позицию
        //он намного быстрее чем ArrayList!!!!!(тк просто меняются ссылки а не перемещаются все элементы)
        std2LinkList.add(3,std6);

        //4 метод: remove - удаление определенного элемента(также метод очень быстрый)
        std2LinkList.remove(3);



    }
}

class Student1 {
    String name;
    int course;

    Student1(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
