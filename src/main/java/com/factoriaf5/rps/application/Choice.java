package com.factoriaf5.rps.application;


public enum Choice {
    ROCK, PAPER, SCISSORS;

    public boolean beats(Choice other) {
        return (this == ROCK && other == SCISSORS) ||
            (this == PAPER && other == ROCK) ||
            (this == SCISSORS && other == PAPER);
    }
}
