package game;

public class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public Choice makeChoice(Choice choice) {
        return choice;
    }

    public String getName() {
        return name;
    }
}
