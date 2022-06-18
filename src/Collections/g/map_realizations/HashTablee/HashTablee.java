package Collections.g.map_realizations.HashTablee;


import java.util.Hashtable;
import java.util.Objects;

/**
 * HashTable - устаревший класс, работающий по тем же принципам,что и HashMap
 * В отличие от Hashmap является synchronized
 * По этой причине его методы не такие быстрые
 *
 * у HashTable ни ключ ни значение не могут быть null !!!
 *
 * если нужна поддержка многопоточности, то нужно использвать ConcurrentHashMap(смотри тему многопоточность)
 */
public class HashTablee {
    public static void main(String[] args) {
        Hashtable<Double, Student4> hshTbl = new Hashtable<>();

        Student4 std1 = new Student4("Ivan", 3);
        Student4 std2 = new Student4("Kolya", 1);
        Student4 std3 = new Student4("Sergei", 4);
        Student4 std4 = new Student4("Kirill", 2);

        hshTbl.put(5.6, std1);
        hshTbl.put(5.1, std2);
        hshTbl.put(5.4, std3);
        hshTbl.put(5.8, std4);




    }
}

class Student4 {
    String name;
    int course;

    Student4(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student4 = (Student4) o;
        return course == student4.course && Objects.equals(name, student4.name);
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
