package LambdaExpressions.b.introduceLambdaPart2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Разберем различные способы написания лямбда выражений и еще более короткий способ их написания
 * лямбда выражение состоит из 2ух частей разделенных стрелкой
 * слева это аргументы метода(который мы должны реализовать) а справа это тело метода(тоже котор необъ реализовать)
 *
 * Нюансы написания:
 *  - можно миксовать написание: тоесть справа полный вариант написания а слева короткий и наоборот
 *  - если используем справа полное написание(тоесть используем {}) то необходимо использовать в конце слово return и знак ";"
 *  - слева можно писать в краткой форме, если только 1 аргумент у метода (тоесть если 2 параметра то нужно поставить скобки(тип можно не указывать))
 *  (также скобки с одним параметром нужно поставить если прописываем рядом тип аргумента)
 *  - справа если больше одной строки метод(больше чем 1 statement), то необходимо использовать полное написание
 *  - если аргументов у метода нету то используем пустые скобки - ()
 *
 * Виды написания:
 * правильное написаниеЖ:               неправильное написание:
 * def(()-> 5);                         def(x -> {x.length();});
 * def((x)-> x.length());               def( x -> { return x.length() });
 * def((String x)-> x.length());        def( x, y -> x.length());
 * def((x, y)-> x.length());
 * def((String x, String y)-> x.length());
 */
public class IntroduceLambdaPart2 {
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

        MyClassForFiltrations myClassForFiltrations = new MyClassForFiltrations();
        //1 более подробный вариант написания
        myClassForFiltrations.testStudents(listSt, (Student s) -> { System.out.println("hello"); return s.grade > 0.8;});
        //различные сокращенные написания лямбд:

        //2 короткий вариант написания
        myClassForFiltrations.testStudents(listSt, s -> s.grade > 0.8);

        //3 длинный вариант напис слева и короткий справа
        myClassForFiltrations.testStudents(listSt, (Student s) -> s.grade > 0.8);

        //можно вынести лямбда выражение в переменную
        StudentFilter1 stf1 = (Student s) -> s.grade > 0.8; //также любой вид написания здесь можно реализовывать

        //хотим отсортировать всех студентов(2 вида)
        Collections.sort(listSt, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });

        Collections.sort(listSt, (s1, s2) -> {return s1.course - s2.course;} );

    }
}

interface StudentFilter1{
    boolean check(Student s);
}


class MyClassForFiltrations {

    void testStudents(ArrayList<Student> al, StudentFilter1 stFilt) {
        for (Student s : al) {
            if (stFilt.check(s)) {
                System.out.println(s);
            }
        }
    }
}