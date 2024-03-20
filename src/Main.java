public class Main {
    public static void main(String[] args) {
        GameFactory g1 = new RockPaperScissorsFactory();
        GameFactory g2 = new GuessTheNumberFactory();

        IGame a = g1.createGame();
        a.play();

        // IGame b = g2.createGame();
        // b.play();
    }
}
