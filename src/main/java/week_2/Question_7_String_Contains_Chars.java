package week_2;

import static input.InputUtils.stringInput;

/**

  Write a program to test if a String contains all of the
  punctuation characters from the number keys on a standard US keyboard:

  !@#$%^&*()

  Write a program to test if an example String contains all of these characters or not.
  Your code should NOT use 10 if statements!

 */
public class Question_7_String_Contains_Chars {

    String punctuation = "!@#$%^&*()";

    public static void main(String[] args) {

        Question_7_String_Contains_Chars pangram = new Question_7_String_Contains_Chars();

        String testString = stringInput("Enter the string to test: ");

        boolean containsChars = pangram.testContainsChars(testString);

        System.out.println("Does the string contain all the characters? " + containsChars);

    }

    public boolean testContainsChars(String testString) {

        // check if testString contains all the punctuation characters being tested.
        int i = 0;
        boolean result = false;
        while (i<punctuation.length()){
            //System.out.println(punctuation.charAt(i));
            //i++;
            if(testString.contains(punctuation.substring(i,i+1))){
                //System.out.println(punctuation.substring(i,i+1));
                i++;
                result=true;
                //break;
            }
            else {
                result = false;
                break;
            }

        }
        return result;
        //return (testString.contains(punctuation));
        //return false;
    }

}


