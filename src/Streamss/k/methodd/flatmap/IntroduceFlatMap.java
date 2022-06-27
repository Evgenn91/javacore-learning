package Streamss.k.methodd.flatmap;

import Streamss.b.methodd.filter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * метод flatMap() - похож на метод map, но исподьзуем тогда, когда нужно поработать не с самими элементами нашей коллекции
 *         (i)       а с елементами элементов нашей коллекции
 *
 */
public class IntroduceFlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Kolia", 'm', 23,3,0.87);
        Student st2 = new Student("Segei", 'm', 25,1,0.46);
        Student st3 = new Student("Elena", 'f', 28,4,0.65);
        Student st4 = new Student("Irina", 'f', 31,3,0.93);
        Student st5 = new Student("Sveta", 'f', 22,1,0.67);

        Facultet f1 = new Facultet("Economics");
        Facultet f2 = new Facultet("Maths");
        f1.addStudentToFacultet(st1);
        f1.addStudentToFacultet(st2);
        f1.addStudentToFacultet(st3);

        f2.addStudentToFacultet(st4);
        f2.addStudentToFacultet(st5);

        List<Facultet> listFacult = new ArrayList<>();
        listFacult.add(f1);
        listFacult.add(f2);

        //хотим вывести имена всех студентов из всех факулитетов

        listFacult.stream()
                .flatMap(faculty -> faculty.getStudentsOnFacultet().stream())
                .forEach(e -> System.out.print(e.getName() + " ")); //Kolia Segei Elena Irina Sveta


    }
}

class Facultet{
    String name;
    List<Student> studentsOnFacultet;

    public Facultet(String name) {
        this.name = name;
        studentsOnFacultet = new ArrayList<>();
    }

    public List<Student> getStudentsOnFacultet() {
        return studentsOnFacultet;
    }

    public  void addStudentToFacultet(Student sudent){
        studentsOnFacultet.add(sudent);
    }
}
