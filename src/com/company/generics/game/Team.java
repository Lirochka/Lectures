package com.company.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    //добавляем в команду новых играков
    public void addNewParticipants(T participant) {
        participants.add(participant);
        System.out.println("In command " + name + " new member named has been added " + participant.getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Win command " + winnerName);
    }
}
