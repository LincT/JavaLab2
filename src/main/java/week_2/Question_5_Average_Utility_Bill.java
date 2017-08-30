package week_2;

import static input.InputUtils.doubleInput;

/**
 * Customers of a heating utility company have much larger bills in the cold winter than in the summer.
 * The utility company allows customers to spread the cost of bills through the year by
 * charging them an average payment every month.
 *
 * The utility company averages all of the last year's bills, and uses that to estimate the
 * average payment for next year.
 *
 * Ask the user for each month's bill for last year.
 * Store this data in an array.
 * Store January's bill in element 0, February's in element 1...
 *
 * Then, add up all of the bills and figure out, and display the average;
 *
 * Also, display the user's data in a table of months and bill amount, so they can review it for accuracy.
 *
 * Tip: use another array with the names of the months to help ask for data/display data.

 */


public class Question_5_Average_Utility_Bill {

    String[] months = { "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December" };

    public static void main(String[] args) {

        Question_5_Average_Utility_Bill billsAverage = new Question_5_Average_Utility_Bill();
        billsAverage.billAverages();

    }

    private void billAverages() {

        double[] bills = getYearBills();

        double average = averageBillAmount(bills);

        System.out.println(String.format("Your average bill is %.2f", average));

        printBillTable(bills);

    }

    public double[] getYearBills() {

        // ask user for bill amount for January, then February...
        // Store values in a double array. Return this array.
        int i = 0;
        double bills[] = new double[12];
        while (i<months.length){
            bills[i]= doubleInput("What was your bill for " + months[i]);
            i++;
        }

        return bills;  // replace with your code

    }


    public double averageBillAmount(double[] bills) {

        // Calculate the average value of all the bills, and return this number.
        int i = 0;
        double total = 0;
        while (i<bills.length) {
            total += bills[i];
            i++;
        }
        /*System.out.println("DEBUG:Total: " + total + " count: "+bills.length+" average: "+ total/bills.length +
                " REMOVE LINE 76 WHEN DONE!\n");*/

        return total/bills.length;
    }


    public void printBillTable(double[] bills) {

        // display the month name, and bill amounts, in table form.
        // Use the months array to display the names.


        // Replace these lines with your code. You'll need to use a loop to display all the months.
        // String formatting is helpful. Here's some examples to space some columns with exactly 15 character width
        System.out.println(String.format("| %-15s| %-15s|", "Month", "Bill" ));
        int i = 0;
        while (i<months.length){
            System.out.println(String.format("| %-15s| %-15.2f|", months[i], bills[i] ));
            i++;
        }



    }


}
