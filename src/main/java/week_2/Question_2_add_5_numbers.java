package week_2;

import static input.InputUtils.*;

/**
    Write a loop that asks the user to enter 5 numbers.
    The user should enter the numbers, one by one.
    Use the intInput("enter a number") method.
    Once the user has entered all the numbers,
    calculate the total and the average value.
*/


public class Question_2_add_5_numbers {

    public static void main(String[] args) {

        // Don't modify these lines
        double[] results = new Question_2_add_5_numbers().getNumbers();
        System.out.println("The total is " + results[0]);
        System.out.println("The average is " + results[1]);

    }


    public double[] getNumbers() {

        // TODO Ask user for 5 integer numbers, one by one
        // Calculate total and average and save in the variables below.
        // Write your code here...
        double total = 0;  // TODO Keep the total variable. Replace 0 with your result.
        double average = 0;  // TODO Keep the average variable. Replace 0 with your result.

        int i = 0;

        while (i<5){
            double integer = doubleInput("Please enter a number.");
            total += integer;
            i++;
        }
        average = total/i;



        // Don't modify this line
        return new double[]{ total, average };
    }

}
