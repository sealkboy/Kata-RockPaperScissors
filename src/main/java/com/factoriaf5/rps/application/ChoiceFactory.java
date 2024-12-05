package com.factoriaf5.rps.application;

public class ChoiceFactory {
    public static Choice createChoice(String choice) {
        try {
            // Convertir la cadena a la constante enum correspondiente
            return Choice.valueOf(choice.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid choice: " + choice, e);
        }
    }
}

