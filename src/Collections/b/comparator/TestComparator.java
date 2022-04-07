package Collections.b.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {

        //Comparator<> отличается тем, что он реализуется не в основном классе, который мы будем использовать в List, а мы создаем отдельный класс
        // и он уже реализует интерфейс Comparator<> (чтобы не создавать отдельный класс: используются анонимные классы, лямбды)

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        //пример сортировки по возрастанию id с реализацией Comparable<> в классе Employee
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(3, "Ivan", "Ivanov", 1000);
        Employee emp2 = new Employee(1, "Sergei", "Sergeev", 1500);
        Employee emp3 = new Employee(4, "Olga", "Smirnova", 2500);
        Employee emp4 = new Employee(2, "Venceslav", "Dydov", 5500);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        //класс IdComparator реализует интерфейс Comparator
        Collections.sort(employeeList, new IdComparator()); /* основное отличие от Comparable (передаем 2 параметра, а не только список!!!!) */

        /**
         * если у нас реализован и Comparable и Comparator
         * то вызвыая так Collections.sort(xxxx); или так Collections.sort(xxxx, ххххх);
         * мы вызовем разные сортировки!!!
         */
        System.out.println(employeeList);
    }
}
