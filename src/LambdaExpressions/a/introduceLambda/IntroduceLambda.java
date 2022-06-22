package LambdaExpressions.a.introduceLambda;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;

/**
 * Введение в лямбда выражения
 *
 */
public class IntroduceLambda {
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

//        MyClassForFiltrations myClassFiltr = new MyClassForFiltrations();
//        myClassFiltr.stOverGrade(listSt, 0.7);
//        System.out.println("--------------");
//        myClassFiltr.stOverUnderAge(listSt, 26);
//        System.out.println("--------------");
//        myClassFiltr.stOverMixCondition(listSt, 24,0.9, 'f');

        MyClassForFiltrations filtrClassPrint = new MyClassForFiltrations();
        filtrClassPrint.testStudents(listSt, new CheckOverGrade());

        System.out.println("--------------");

//        filtrClassPrint.testStudents(listSt, (Student s) ->{ return s.grade > 0.8; });

        System.out.println("--------------");

//        filtrClassPrint.testStudents(listSt, new StudentFilter() {
//            @Override
//            public boolean check(Student s) {
//                return s.sex == 'f';
//            }
//        });
//
//        System.out.println("--------------");

        filtrClassPrint.testStudents(listSt, (Student s) ->{ return s.sex == 'f'; });

        System.out.println("--------------");

        filtrClassPrint.testStudents(listSt, (Student st) -> { return st.age > 24 && st.grade < 0.9 && st.sex == 'f';});
    }
}

//это называется функциональный интерфейс(интерфейс у которого всего 1 абстрактный метод)
//статических ил дефолтный может быть сколько угодно но абстракный должен быть один
interface StudentFilter{
    boolean check(Student s);
}

//заменим этот класс на анонимный
class CheckOverGrade implements StudentFilter{
    @Override
    public boolean check(Student s) {
        return s.grade > 0.8;
    }
}

//метод вывода на экран
class MyClassForFiltrations{

    void testStudents(ArrayList<Student> al, StudentFilter stFilt){
        for(Student s: al){
            if(stFilt.check(s)) {
                System.out.println(s);
            }
        }
    }


//    void stOverGrade(ArrayList<Student> listSt, double grade ){
//        for(Student st: listSt){
//            if(st.grade > grade) { System.out.println(st); }
//        }
//    }
//
//    void stOverUnderAge(ArrayList<Student> listSt, int age){
//        for(Student st: listSt){
//            if(st.age < age) { System.out.println(st); }
//        }
//    }
//
//    void stOverMixCondition(ArrayList<Student> listSt, int age, double grade, char sex ){
//        for(Student st: listSt){
//            if(st.age > age && st.grade < grade && st.sex == sex) {
//                System.out.println(st);
//            }
//        }
//    }
}
