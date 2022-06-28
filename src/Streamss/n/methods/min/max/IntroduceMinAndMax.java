package Streamss.n.methods.min.max;

import LambdaExpressions.c.predicatee.and.removeif.Student;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * метод min() - будет вовращать нам минимальное значение(метод сравнения на минимальность (компаратор) определяем)
 *         (t)
 * метод max() - будет вовращать нам максимальное значение
 *         (t)
 */
public class IntroduceMinAndMax {
    public static void main(String[] args) {
        Stream<Integer> str1 = Stream.of(143, 12, 13, 15 , 11 , 13, 3, 5);
        System.out.println("min = " + str1.min((a,b) -> a - b ).get()); //3

        Stream<Integer> str2 = Stream.of(143, 12, 13, 15 , 11 , 13, 3, 5);
        System.out.println("max = " + str2.max((a,b) -> a - b).get()); //143

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

        Student min = listSt.stream().min((x,y) -> {return x.age - y.age;}).get();
        System.out.println("st min = " + min);

        Student max = listSt.stream().max((x,y) -> {return x.age - y.age;}).get();
        System.out.println("st max = " + max);
    }
}
