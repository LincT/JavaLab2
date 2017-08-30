package week_2;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

/**
 *
 * Write a program that displays a square of characters
 * of any size, between 1 and 100 characters.
 *
 * The user should be able to enter a size, a character, and
 * your program will use loops to display a square.
 *
 * So, if the user enters 4, and the character "%"
 * your program will display

 %%%%
 %%%%
 %%%%
 %%%%

 */


public class Question_8_square_of_characters {

    int MIN_SIZE = 1;
    int MAX_SIZE = 100;

    public static void main(String[] args) {

        Question_8_square_of_characters squarer = new Question_8_square_of_characters();

        int size = squarer.getSquareSize();
        String character = squarer.getCharacter();

        squarer.printSquare(size, character);

    }

    /* Get a positive number for the square size. You don't need to modify this method. */
    public int getSquareSize() {

        // Input validation. The square size must be positive.

        int size = -1;

        // Loop while user-entered size is less than the minimum, or larger than the maximum
        while (size < MIN_SIZE || size > MAX_SIZE) {
            size = intInput("Enter a number between 1 and 100 for the square size");
        }

        return size;
    }


    public String getCharacter() {

        // ask user for character
        String chr = stringInput("Type a character to repeat.");
        // input validation - make sure user enters a string of length = 1.
        if (chr.length()==1) {
            return chr;
        }
        else{
            System.out.println("invalid response. terminating.");
            return null;
        }

        //return null;  // Replace with your code

    }



    public void printSquare(int size, String character) {

        // print a square of characters, of the given size.

        for (int x = 0;x<size;x++){
            for(int i = 0;i<size;i++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}

