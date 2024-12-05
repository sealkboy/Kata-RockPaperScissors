package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest3 {

    @Test
    void testPlayer1Wins() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, "ROCK", player2, "SCISSORS");
        assertEquals("Alice wins!", result);
    }

    @Test
    void testPlayer2Wins() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, "SCISSORS", player2, "ROCK");
        assertEquals("Bob wins!", result);
    }

    @Test
    void testLizardBeatsSpock() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, "LIZARD", player2, "SPOCK");
        assertEquals("Alice wins!", result);
    }

    @Test
    void testSpockBeatsScissors() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, "SPOCK", player2, "SCISSORS");
        assertEquals("Alice wins!", result);
    }

    @Test
    void testDraw() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, "ROCK", player2, "ROCK");
        assertEquals("It's a draw!", result);
    }
}
