package com.factoriaf5.rps.application;

public enum ChoiceV2 {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

    public boolean beats(ChoiceV2 other) {
        return (this == ROCK && (other == SCISSORS || other == LIZARD)) ||
            (this == PAPER && (other == ROCK || other == SPOCK)) ||
            (this == SCISSORS && (other == PAPER || other == LIZARD)) ||
            (this == LIZARD && (other == SPOCK || other == PAPER)) ||
            (this == SPOCK && (other == SCISSORS || other == ROCK));
    }
}