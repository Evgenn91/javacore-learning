package Streamss.q.methodd.maptoint;

import LambdaExpressions.c.predicatee.and.removeif.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * метод mapToInt() - возвращает после себя int stream(тоесть стрим со значениями int)
 *         (i)
 *   методы mapToInt(): (тоесть можем использовать после этого метода)
 *           -sum()(t) - суммирует данные и возвращает int
 *           -average()(t) - возвращает среднее арифметическое(вернет OptionalDouble)
 *           -min()(t) - возвращает минимальное значение(вернет OptionalInteger)
 *           -max()(t) - возвращает максимальное значение(вернет OptionalInteger)
 *
 *   есть также:
 *         mapToDouble()
 *         mapToLong() и т.д.
 *
 * метод boxed() - конвертирует значения int в значения Integer (это в нашем случае)
 *         (i)
 */
public class IntroduceMapToInt {
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

        List<Integer> listAge = listSt.stream()
                .mapToInt(el -> el.age)
                .boxed()  // конвертирует int в Integer
                .collect(Collectors.toList());

        System.out.println(listAge);  //[23, 25, 28, 31, 22]
        System.out.println("-----");

        int sumAges = listSt.stream()
                .mapToInt(el -> el.age)
                .sum();

        System.out.println(sumAges);  //129
        System.out.println("-----");

        double average = listSt.stream()
                .mapToInt(el -> el.age)
                .average().getAsDouble();  //возвращает среднее арифметическое

        System.out.println(average);  //25.8
        System.out.println("-----");

        int min = listSt.stream()
                .mapToInt(el -> el.age)
                .min().getAsInt();

        System.out.println(min);  //22
        System.out.println("-----");

        int max = listSt.stream()
                .mapToInt(el -> el.age)
                .max().getAsInt();

        System.out.println(max);  //31
        System.out.println("-----");



    }
}
