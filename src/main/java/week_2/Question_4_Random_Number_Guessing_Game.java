package week_2;

import java.util.Random;
import static input.InputUtils.*;

import static input.InputUtils.*;

/**
 *
 Your program should generate a random number between 1 and 10,
 and challenge the user to guess the number.

 Write a loop that asks the user to guess a number that the computer
 is thinking of. Print a success message if they guess correctly.

 If the user does not guess correctly, tell the user that they need to guess
 higher, or lower, and ask the user to try again.

 The user should be able to have as many guesses as they need.

 Once the user guesses correctly, tell the user how many guesses they needed to
 get the right number.

 */
public class Question_4_Random_Number_Guessing_Game {

    Random rnd = new Random();

    final String CORRECT = "Correct!!";
    final String LOW = "Too low";
    final String HIGH = "Too high";

    public static void main(String[] args) {

        int guessesNeeded = new Question_4_Random_Number_Guessing_Game().play();

        // TODO print the number of guesses needed.
        System.out.println("Guesses: " + guessesNeeded);

    }

    public int play() {

        int secret = generateSecretNumber(1, 10);

        int guessesNeeded = 0;

        while (true) {

            // ask user for their guess
            int guess = intInput("What is your guess?");   // Replace with your code

            // increase guessesNeeded
            guessesNeeded++;

            String result = checkGuess(secret, guess);

            //  print the result - too high, too low, or correct.
            System.out.println(result);

            // Check if result is correct. If so, end the loop.
            if (result.equals(CORRECT))
            {break;}


        }

        return guessesNeeded;

    }

    public String checkGuess(int secret, int guess) {
        // TODO Return CORRECT if secret is the same as guess
        // TODO Return LOW if guess is too low
        // TODO return HIGH if guess is too high
        if (secret>guess){
            return LOW;}
        else if (secret<guess){
            return HIGH;
        }
        else {
            return CORRECT;
        }
    }

    public int generateSecretNumber(int min, int max) {
        // TODO generate a random number between min and max.
        // Use the global Random rnd to generate the number
        return ((rnd.nextInt(max)) + min);

        //return 0;  //replace with your code
    }


}
