package Collections.e.binary_search;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * Бинарный поиск(метод поиска при помощи деления списка на 2 части)
 * ищет в отфильтрованном списке
 */
public class BinarySearchh {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(-1);
        arrList.add(15);
        arrList.add(56);
        arrList.add(8456);
        arrList.add(-43);
        arrList.add(-2);
        arrList.add(0);

        Collections.sort(arrList);
        int index1 = Collections.binarySearch(arrList, 0);
//        System.out.println(index1);//если выдается отрицательное значение,то нету такого элемента
        //положит число выведет индекс в массиве

        Collections.reverse(arrList);
        //метод вроде для перемешивания коллекции
        Collections.shuffle(arrList);

        Employee std1 = new Employee(1,"Ivan", 3);
        Employee std2 = new Employee(2,"Kolya", 1);
        Employee std3 = new Employee(23,"Sergei", 4);
        Employee std4 = new Employee(3,"Kirill", 2);
        Employee std5 = new Employee(12,"Zayr", 3);

        ArrayList<Employee> arrList2 = new ArrayList<>();
        arrList2.add(std1);
        arrList2.add(std2);
        arrList2.add(std3);
        arrList2.add(std4);
        arrList2.add(std5);

        Collections.sort(arrList2);
        System.out.println(arrList2);

        int index11 = Collections.binarySearch(arrList2, new Employee(3,"Kirill",2));
        int index22 = Collections.binarySearch(arrList2, new Employee(3,"gfg",0));

        //данные в обоих выводах будут одинаковыми(т.к. сравнение идет по id(так переопределили Comparable)
        System.out.println(index11);
        System.out.println(index22);

        //Работа BinarySearch с массивом
        int[] arr = {-3, 5, 15, 54, -34, 213};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int indexArr =  Arrays.binarySearch(arr,5);
        System.out.println("indexArr = " + indexArr);

    }
}


class Employee implements Comparable<Employee> {
    int id;
    String name;
    int course;

    public Employee() {
    }


    public Employee(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    @Override
    public int compareTo(Employee o) {
        if(this.id == o.id) return 0;
        else if(this.id < o.id) return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}