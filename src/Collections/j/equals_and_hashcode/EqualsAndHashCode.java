package Collections.j.equals_and_hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * идея в том, что hash структура сначала проверяет по hash
 * (например ищем объект у которого может быть такой же ключ как у нашего объекта)
 * и если находит соответствие, то потом уже начинает по equals проверять
 * а если не найдет соотв, то до equals не дойдет
 *
 * когда у разных объектов возвращается 1 hashcode - это коллизия
 * чем меньше будет коллизий, тем быстрее будет работать Hash-структура
 *
 * то есть hashcode у двух объектов всегда должен быть одинаковый, если их equals-ы равны
 * и наоборот, если equals у двух объектов не равен, hashcode не обязательно должен быть разный(но желательно чтобы был таким)
 *
 * при создании hashcode там используется его адрес от его местоположения в памяти
 *
 */
public class EqualsAndHashCode {
    public static void main(String[] args) {
        Map<Student, Double> listStudent = new HashMap<>();
        Student st1 = new Student("Kolia", "Ivanov", 2);
        Student st2 = new Student("Kirill", "Gektorov", 3);
        Student st3 = new Student("Olga", "Sidorova", 1);
        Student st4 = new Student("Sveta", "Smirnova", 3);

        listStudent.put(st1, 5.6);
        listStudent.put(st2, 7.3);
        listStudent.put(st3, 6.4);
        listStudent.put(st4, 7.1);

        Student st5 = new Student("Kolia", "Ivanov", 2);
        System.out.println("hashcode st1 = " + st1.hashCode());
        System.out.println("hashcode st2 = " + st2.hashCode());
        boolean result = listStudent.containsKey(st5);//проверяем есть ли такой студент у нас в мапе
        System.out.println(result);//если убрать hashCode у Student то выведет false!!!!(нету такого стедента у нас в списке)
    }
}

class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
