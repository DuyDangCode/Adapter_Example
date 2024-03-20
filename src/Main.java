public class Main {
    public static void main(String[] args) {
//        IGame a = new RockPaperScissors();
//        a.play();

        IGame b = new GuessTheNumberAdapter();
        b.play();
    }
}