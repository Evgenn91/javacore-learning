package LambdaExpressions.с.predicatee;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Поговорим об интерфейсах, которые находятся в java.util.function
 * это интерфейсы, которые можно использоваться вместо создания своих
 * 1) Predicate<T> - параметризированный интерфейс (возвращает boolean)
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
