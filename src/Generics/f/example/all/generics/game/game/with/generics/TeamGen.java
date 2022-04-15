package Generics.f.example.all.generics.game.game.with.generics;

import Generics.f.example.all.generics.game.game.with.generics.participant.Participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//мы поставили именно <T extends Participant>, а не просто <T> чтобы мы не смогли использовать, неправильный тип
public class TeamGen<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public TeamGen(String name) {
        this.name = name;
    }

    public void addNewParticipant(T onePartic) {
        this.participants.add(onePartic);
        //если в названии класса стояло бы просто <T> то написали бы так: ...... " team: " +((Participant) onePartic).getName());
        System.out.println("Add new participant in "+ this.name +" team: " +onePartic.getName());
    }

    //метод игры двух команд(победителя будем выбирать рандомно)
    public void playWith(TeamGen<T> anotherTeam) { /* поставленная здесь буква <T> говорит что Школьки играют только со школьниками, студенты со студентами и т.д. */
        String winnerName;
        Random random = new Random();
        int randInt = random.nextInt(2);
        winnerName = randInt == 0 ? this.name : anotherTeam.name;
        System.out.println("Winner is " + winnerName);
    }
}
