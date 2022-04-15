package Generics.f.example.all.generics.game.game.without.generics;

import Generics.f.example.all.generics.game.game.without.generics.participant.Employee;
import Generics.f.example.all.generics.game.game.without.generics.participant.Schoolar;
import Generics.f.example.all.generics.game.game.without.generics.participant.Student;

/**
 * мы создаем игру в которой есть команда(она может состоять из студентов, школьнико и работнико
 * команда может миксоваться как угодно(мы это устраним во втором примере с использованием дженериков
 * а без них наша игра выглядит данным образом
 */
public class TestGameWithoutGenerics {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Vasia", 10);
        Schoolar schoolar2 = new Schoolar("Patia", 11);

        Student student1 = new Student("Kolya", 19);
        Student student2 = new Student("Sergei", 20);

        Employee employee1 = new Employee("Mihalich", 39);
        Employee employee2 = new Employee("Ivanich", 43);

        Team firstTeam = new Team("Botani");
        firstTeam.addNewParticipant(schoolar1);
        firstTeam.addNewParticipant(schoolar2);
        firstTeam.addNewParticipant(student1);
        firstTeam.addNewParticipant(employee1);

        Team secondTeam = new Team("VseMogem");
        secondTeam.addNewParticipant(student1);
        secondTeam.addNewParticipant(employee2);

    }
}
