package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    private Player player1;
    private Player player2;
    private Game game;

    @BeforeEach
    void setUp() {
        player1 = new Player("Carmen");
        player2 = new Player("Kevin");
        game = new Game();
    }

    @Test
    void playerOneWinsWithRockAgainstScissors() {
        String result = game.play(player1, Choice.ROCK, player2, Choice.SCISSORS);
        assertEquals("Carmen wins!", result);
    }

    @Test
    void gameResultsInDrawWhenBothPlayersChooseSameOption() {
        String result = game.play(player1, Choice.ROCK, player2, Choice.ROCK);
        assertEquals("It's a draw!", result);
    }
}