package Collections.g.map_realizations.LinkedHashMap;


import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;

/**
 * LinkedHashMap является наследником HashMap
 * Хранит информацию о порядке добавления элементов или порядке их использования
 * Производительность методов немного ниже чем у HashMap
 */
public class MyLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student3> linkk = new LinkedHashMap<>(16, 0.75f, false); //accesOrder - если false то
        //когда используем например метод get то порядок не изменяется, а если true - то порядок от применения методо(например get) будет меняться

        Student3 std1 = new Student3("Ivan", 3);
        Student3 std2 = new Student3("Kolya", 1);
        Student3 std3 = new Student3("Sergei", 4);
        Student3 std4 = new Student3("Kirill", 2);

        linkk.put(5.6, std1);
        linkk.put(5.1, std2);
        linkk.put(5.4, std3);
        linkk.put(5.8, std4);
        System.out.println(linkk); //в каком порядке добавили в таком они и будут хранится!!(добавим в другом порядке и тогда такой порядок и будет)



    }
}

class Student3 {
    String name;
    int course;

    Student3(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course && Objects.equals(name, student3.name);
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
