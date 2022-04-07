package Collections.a.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        /**
         * желательно, когда класс реализует Comparable по id,то тогда equals можно делать по этому же id
         */
        List<String> list = new ArrayList<>();
        list.add("Sergei");
        list.add("Ivan");
        list.add("Olya");
        Collections.sort(list);
        System.out.println(list); /* отсортирует в алфавитном порядке(потому что в классе String так реализован Comparable<>)*/

        //если мы хотим отсортировать список оперделенным образом с помощью Collection.sort, необходимо реализовать интерфейс Comparable
        //интерфейс задает основную сортировку(реализуется в основено классе, который будет помещен в список) при вызове Collection.sort
        //Comparator<> отличается тем, что он реализуется не в основном классе, который мы будем использовать в List, а мы создаем отдельный класс
        // и он уже реализует интерфейс Comparator<> (используется в анонимных классах, лямбдах)

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

        Collections.sort(employeeList);/* List с объектами Employee нельзя будет сюда добавить(компилятор будет ругаться), если Employee не реализует интерфейс Comparable */

        /**
         * чтобы компилятор не ругался можно применить Arrays.sort(new Employee[]{emp1, emp2, emp3})
         * но при выполнении будет исключение!!!
         */

        System.out.println(employeeList);
    }
}
