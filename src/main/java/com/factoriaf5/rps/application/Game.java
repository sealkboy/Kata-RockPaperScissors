package com.factoriaf5.rps.application;

public class Game {
    public String play(Player player1, Choice choice1, Player player2, Choice choice2) {
        String p1ChoiceString = choice1.name();
        String p2ChoiceString = choice2.name(); 

        Choice p1Choice = ChoiceFactory.createChoice(p1ChoiceString);
        Choice p2Choice = ChoiceFactory.createChoice(p2ChoiceString);

        if (p1Choice == p2Choice) {
            return "Empate";
        }
        return p1Choice.beats(p2Choice) ? player1.getName() + " ha ganado" : player2.getName() + " ha ganado";
    }
}
