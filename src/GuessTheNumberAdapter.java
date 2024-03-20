public class GuessTheNumberAdapter implements IGame {
    GuessTheNumber gn; //adaptee
    int k, i;

    public GuessTheNumberAdapter(int k) {
        this.k = k;
        gn = new GuessTheNumber();
    }

    @Override
    public void play() {
        System.out.println(
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 5 trials.");
        for (i = 0; i < k; i++) {
            if (gn.guess())
                break;
        }
        if (i == k) {
            System.out.println(
                    "You have exhausted "
                            + k +" trials.");
            System.out.println(
                    "The number was " + gn.getNumber());
        }


    }
}
