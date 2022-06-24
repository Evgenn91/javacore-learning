package LambdaExpressions.f.functionn;

import LambdaExpressions.c.predicatee.and.removeif.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *  Function<T,R> - следующий интерфейс из java.util.function
 *  данный интерфейс принимет 2 значения
 *  у него есть метод - R apply(T t); (принимет T а возвращает R)
 */
public class MyFunction {
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

        //хотим найти среднее арифметическое для всех студентов(например возраста)
        //тоесть получаем Student а вернем Integer (если это возраст)

        Function<Student, Double> fn = student -> student.grade; //просто пример написания

//        double result = avgOfSmth(listSt, fn);

        double result2 = avgOfSmth(listSt, student -> student.grade);
        System.out.println(result2);

        //теперь выведем средний курс
        double result3 = avgOfSmth(listSt, student ->(double) student.course);
        System.out.println(result3);


    }

    public static double avgOfSmth (List<Student> listSt, Function<Student, Double> func){
        double result = 0;
        for(Student st: listSt){
            result = result + func.apply(st);
        }
        result = result/ listSt.size();
        return result;
    }
}

