package com.factoriaf5.rps.application;

public class ChoiceFactory {
    public static Choice createChoice(String name) {
        return Choice.valueOf(name.toUpperCase());
    }
}
