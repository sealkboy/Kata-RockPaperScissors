package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest2 {

    @Test
    void testPlayer1Wins() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, Choice.ROCK, player2, Choice.SCISSORS);
        assertEquals("Alice wins!", result);
    }

    @Test
    void testPlayer2Wins() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, Choice.SCISSORS, player2, Choice.ROCK);
        assertEquals("Bob wins!", result);
    }

    @Test
    void testLizardBeatsSpock() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, Choice.LIZARD, player2, Choice.SPOCK);
        assertEquals("Alice wins!", result);
    }

    @Test
    void testSpockBeatsScissors() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, Choice.SPOCK, player2, Choice.SCISSORS);
        assertEquals("Alice wins!", result);
    }

    @Test
    void testDraw() {
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");
        Game game = new Game();

        String result = game.play(player1, Choice.ROCK, player2, Choice.ROCK);
        assertEquals("It's a draw!", result);
    }
}
