import java.util.Scanner;

public class GuessTheNumber {
    int guess, number;

    public GuessTheNumber() {
        randomANumber();
    }

    public void randomANumber() {
        number = 1 + (int) (100
                * Math.random());
    }

    public boolean guess() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers

        System.out.println(
                "Guess the number:");
        guess = sc.nextInt();


        if (number == guess) {
            System.out.println(
                    "Congratulations!"
                            + " You guessed the number.");
            return true;

        } else if (number > guess) {
            System.out.println(
                    "The number is "
                            + "greater than " + guess);
        } else if (number < guess) {
            System.out.println(
                    "The number is"
                            + " less than " + guess);
        }
        return false;


    }

    public int getNumber() {
        return number;
    }
}