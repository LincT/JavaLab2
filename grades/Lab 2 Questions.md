# Lab 2 

### Question 1

Write a loop that adds up all of the integer numbers between 1 and 100, and displays the answer.

Tip: 5050 is the right answer

### Question 2
    
Write a loop that asks the user to enter 5 numbers. The user should enter the numbers, one by one.

Use the intInput("enter a number") method.

Once the user has entered all the numbers, calculate the total and the average value.

### Question 3

Add a breakpoint to the start of one of your programs. Debug it, and then use the debugger to step through your program, and inspect the value of the variables.

* How do you add a breakpoint? How can you remove a breakpoint?
* Can you add more than one breakpoint?
* How do you activate and deactivate breakpoints?
* How do you move through your code one line at a time?
* How do you see the value of a variable?
* What does clicking on the triangle next to a variable on the variables pane do? (Such as the arrow next to names in the screenshot below)

### Question 4

Your program should generate a random number between 1 and 10, and challenge the user to guess the number.

 Write a loop that asks the user to guess a number that the computer is thinking of. Print a success message if they guess correctly.

 If the user does not guess correctly, tell the user that they need to guess
 higher, or lower, and ask the user to try again.

 The user should be able to have as many guesses as they need.

 Once the user guesses correctly, tell the user how many guesses they needed to get the right number.


### Question 5

 Customers of a heating utility company have much larger bills in the cold winter than in the summer.
 The utility company allows customers to spread the cost of bills through the year by
  charging them an average payment every month.
 
  The utility company averages all of the last year's bills, and uses that to estimate the
  average payment for next year.
 
  Ask the user for each month's bill for last year.
  Store this data in an array.
  Store January's bill in element 0, February's in element 1...
 
  Then, add up all of the bills and figure out, and display the average;
 
  Also, display the user's data in a table of months and bill amount, so they can review it for accuracy.
 
  Tip: use another array with the names of the months to help ask for data/display data.

### Question 6

 A parcel delivery company charges the following rates to ship a parcel.

 *	Up to 10 pounds: $2.15 per pound
 *	Up to 20 pounds: $1.55 per pound
 *	Up to 30 pounds: $1.15 per pound

 The shipping company does not ship parcels that weigh over 30 pounds.

 So, a parcel that weighs 17 pounds will cost $1.55 x 17 = $26.35.

 Write a program that asks the user for the weight of a parcel and displays whether it can be shipped, and what it will cost.

 Optional extra: the most obvious solution to this problem uses if statements for the price bands. Can you think of a different way?  Hint:  loops, and arrays of price and max weights for price?


### Question 7

Write a program to test if a String contains all of the 10 punctuation characters from the number keys on a standard US keyboard:

 ` !@#$%^&*() `

Write a program to test if an example String contains all of these characters or not.
Your code should NOT use 10 if statements!


### Question 8

 
Write a program that displays a square of characters of any size, between 1 and 100 characters.
 
The user should be able to enter a size, a character, and your program will use loops to display a square.
 
So, if the user enters 4, and the character "%" your program will display

```
 %%%%
 %%%%
 %%%%
 %%%%
```

### Question 9


A smart phone is running 3 apps, each of which syncs and download data from a different server.

 * App A syncs and downloads data every hour, and downloads 0.5KB each time
 * App B syncs and downloads daily, and downloads 2KB every time
 * App C, when installed, is 1MB in size. This app syncs and downloads every 4 hours, and every time it syncs it downloads 1% of its current size. The new data it downloads count towards the app's size, so you'll need to keep track of the current size of the app.

With all apps installed, the phone has 5MB of free space.
 
When the phone starts, each app syncs and downloads, and then repeats to their own schedule.

With all 3 apps running continuously, how long will it be before the phone runs out of space?

Assume the phone is running continuously and nothing else is using space on the phone.
Assume that 1KB = 1000 bytes and 1MB = 1000,000 bytes.

Hint 1: the modulus operator is helpful. An expression like  ` ( number % 4 == 0 )  ` is true if number divides evenly by 4.  
Hint 2: the answer is several thousand hours.  
Hint 3: This problem is a little trickier than the other ones, but it can be done :)
