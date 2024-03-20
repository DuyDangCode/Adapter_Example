import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements IGame {
    enum Selection{
        Rock,
        Paper,
        Scissors
    }


    @Override
    public void play() {
        Random rand = new Random();
        int botChoice =  rand.nextInt(Selection.values().length);

        Scanner myObj = new Scanner(System.in);
        int userChoice;

        while (true){
            System.out.println("Enter your choice (0: Rock, 1: Paper, 2: Scissors): ");
            userChoice = myObj.nextInt();
            if(userChoice <= 2 && userChoice >= 0)
                break;
        }

        if(botChoice == userChoice)
            alertResult("Draw", botChoice, userChoice);
        else if((userChoice + botChoice) % 2 == 0){
            if(userChoice < botChoice)
                alertResult("User won", botChoice, userChoice);
            else
                alertResult("Bot won", botChoice, userChoice);

        }else {
            if(userChoice < botChoice)
                alertResult("Bot won", botChoice, userChoice);
            else
                alertResult("User won", botChoice, userChoice);
        }



    }

    void alertResult(String result, int botChoice, int userChoice){
        System.out.println(result);
        System.out.println("Bot: " + getChoice(botChoice).toString());
        System.out.println("User: " + getChoice(userChoice).toString());
    }

    Selection getChoice(int choice){
        if(choice == 0)
            return Selection.Rock;
        if (choice == 1)
            return Selection.Paper;
        else
            return Selection.Scissors;
    }
}
