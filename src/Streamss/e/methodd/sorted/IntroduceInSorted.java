package Streamss.e.methodd.sorted;

import Streamss.b.methodd.filter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * метод sorted() - сортировка (необходимо, чтобы Comparable был переопределен у объекта который сортируем!!!)
 *        (i)
 *
 */
public class IntroduceInSorted {
    public static void main(String[] args) {
        int[] arr = {1,5,3,64,41,43,67};

        int[] result = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(result));

        Student st1 = new Student("Kolia", 'm', 23,3,0.87);
        Student st2 = new Student("Segei", 'm', 25,1,0.46);
        Student st3 = new Student("Elena", 'f', 28,4,0.65);
        Student st4 = new Student("Irina", 'f', 31,3,0.93);
        Student st5 = new Student("Sveta", 'f', 22,1,0.67);



        List<Student> listSt = new ArrayList<>();
        listSt.add(st1);
        listSt.add(st2);
        listSt.add(st3);
        listSt.add(st4);
        listSt.add(st5);

        listSt = listSt.stream().sorted(
                (x,y) -> x.getName().compareTo(y.getName())
        ).collect(Collectors.toList());

        System.out.println(listSt);

    }
}
