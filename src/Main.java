public class Main {
    public static void main(String[] args) {
//        IGame a = new RockPaperScissors();
//        a.play();

        GuessTheNumber gn = new GuessTheNumber();
        IGame b = new GuessTheNumberAdapter(5, gn);
        b.play();
    }
}