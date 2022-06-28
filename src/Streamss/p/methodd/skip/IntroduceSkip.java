package Streamss.p.methodd.skip;

import LambdaExpressions.c.predicatee.and.removeif.Student;

import java.util.ArrayList;

/**
 * метод limit() - будет пропускать(тоесть отбрасывать от результата) первый n элементов нашего стрима
 *         (i)
 */
public class IntroduceSkip {
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

        listSt.stream().filter(e -> e.age > 24).forEach(System.out::println);
        System.out.println("--------------------");
        listSt.stream().filter(e -> e.age > 24).limit(2).forEach(System.out::println);
        System.out.println("--------------------");
        listSt.stream().filter(e -> e.age > 24).skip(2).forEach(System.out::println);


    }
}
