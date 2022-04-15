package Generics.f.example.all.generics.game.game.with.generics;

import Generics.f.example.all.generics.game.game.with.generics.participant.Employee;
import Generics.f.example.all.generics.game.game.with.generics.participant.Schoolar;
import Generics.f.example.all.generics.game.game.with.generics.participant.Student;

/**
 * с использованием Generics мы можем определять состав команды
 * (кто в ней будет: любой участник, только студенты, только школьники и т.д.)
 */
public class TestGameWithGenerics {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Vasia", 10);
        Schoolar schoolar2 = new Schoolar("Patia", 11);

        Student student1 = new Student("Kolya", 19);
        Student student2 = new Student("Sergei", 20);

        Employee employee1 = new Employee("Mihalich", 39);
        Employee employee2 = new Employee("Ivanich", 43);

        TeamGen<Schoolar> schoolarTeam = new TeamGen<>("Botani");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);


        TeamGen<Student> studentTeam = new TeamGen<>("VseMogem");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        TeamGen<Employee> employeeTeam = new TeamGen<>("Rabotiagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        //школьники должны играть только со школьниками, пример:
        TeamGen<Schoolar> anotSchoolTeam = new TeamGen<>("Melkie");
        anotSchoolTeam.addNewParticipant(new Schoolar("Dima", 9));
        anotSchoolTeam.addNewParticipant(new Schoolar("Vinia",11));

        //чтобы это было так, в аргументе метода playWith в классе Team мы тоже поставили Generic
        schoolarTeam.playWith(anotSchoolTeam);



    }
}
