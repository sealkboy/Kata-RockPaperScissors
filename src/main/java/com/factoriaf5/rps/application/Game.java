public class Game {
    public String play(Player player1, Choice choice1, Player player2, Choice choice2) {
        if (choice1 == choice2) {
            return "It's a draw!";
        }
        return choice1.beats(choice2) ? player1.getName() + " wins!" : player2.getName() + " wins!";
    }
}
