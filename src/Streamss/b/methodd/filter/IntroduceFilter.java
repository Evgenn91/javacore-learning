package Streamss.b.methodd.filter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * метод filter() - фильтрует данные из определенного набора (возвращает после себя Stream!!!)
 *      (i)
 */
public class IntroduceFilter {
    public static void main(String[] args) {
        Student st1 = new Student("Kolia", 'm', 23,3,0.87);
        Student st2 = new Student("Segei", 'm', 25,1,0.46);
        Student st3 = new Student("Elena", 'f', 28,4,0.65);
        Student st4 = new Student("Irina", 'f', 31,3,0.93);
        Student st5 = new Student("Sveta", 'f', 22,1,0.67);



        ArrayList<Student> listSt = new ArrayList<>();
        listSt.add(st1);
        listSt.add(st2);
        listSt.add(st3);
        listSt.add(st4);
        listSt.add(st5);

        //оставим только тех возраст которых больше 24 лет и средняя оченка меньше 7.7
        List<Student> result = listSt.stream().filter(element -> element.getAge() > 24 && element.getAvgGrade() < 7.7).collect(Collectors.toList());
        System.out.println(result);

        //необязательно создавать стрим их готовой коллекции
        //можем создать его с нуля(не часто применяется)
        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);



    }
}
