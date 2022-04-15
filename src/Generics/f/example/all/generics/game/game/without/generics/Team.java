package Generics.f.example.all.generics.game.game.without.generics;

import Generics.f.example.all.generics.game.game.without.generics.participant.Participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Participant onePartic) {
        this.participants.add(onePartic);
        System.out.println("Add new participant in "+ this.name +" team: " + onePartic.getName());
    }

    //метод игры двух команд(победителя будем выбирать рандомно)
    public void playWith(Team anotherTeam) {
        String winnerName;
        Random random = new Random();
        int randInt = random.nextInt(2);
        winnerName = randInt == 0 ? this.name : anotherTeam.name;
        System.out.println("Winner is " + winnerName);
    }
}
