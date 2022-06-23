package LambdaExpressions.c.predicatee.and.removeif;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Поговорим об интерфейсах, которые находятся в java.util.function
 * это интерфейсы, которые можно использоваться вместо создания своих
 * 1) Predicate<T> - параметризированный интерфейс (возвращает boolean)
 *  его единственный метод, который необходимо реализовать - это: boolean test(T t);
 *  Predicate используется методом removeIf
 *
 *  Predicates можно объединить(or() и and()): predicate1.and(predicate2)
 *                                         predicate1.or(predicate2)
 *  можно сделать противаположную проверку существующей( negate()): predicate1.negate()
 *
 */


public class Predicateee {
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

        //старый способ фильтрации(который изучили)
        MyClassForFiltrations1 myClassForFiltrations = new MyClassForFiltrations1();
        myClassForFiltrations.testStudents(listSt, (Student s) -> { System.out.println("hello"); return s.grade > 0.8;});

        myClassForFiltrations.testStudents(listSt, (Student s) -> s.grade > 0.8);

        //можно объединить эти 2 предикейта!!!!!
        Predicate<Student> p1 = (Student s) -> s.grade > 0.8;
        Predicate<Student> p2 = (Student s) -> s.age > 20;
        //объединение Predicates
        myClassForFiltrations.testStudents(listSt, p1.and(p2));
        myClassForFiltrations.testStudents(listSt, p1.or(p2));
        myClassForFiltrations.testStudents(listSt, p1.negate());



    }
}

//убираем наш интерфейс и заменяем его на Predicate интерфейс

//interface StudentFilter12{
//    boolean check(Student s);
//}


class MyClassForFiltrations1 {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
