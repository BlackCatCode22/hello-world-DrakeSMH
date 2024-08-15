// This is a hotdog
/*
* Drake Parker
* 8/15/24
* AddTwoInts.java
 */


import java.util.Scanner;  // Import the Scanner class


public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println(" \n\n Welcome to the LargestOfThree Program !\n\n");

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int largestOfThree = 0;

        System.out.println("\n The value of SumOfBothNumbers is " + largestOfThree);

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Unit text for our first user input
        System.out.println("\n The value of firstNum is: " + firstNum);

        // Ask user for the second int
        System.out.println("\n Please enter a second whole number: ");
        secondNum = myScannerObject.nextInt();

        // Unit text for our second user input
        System.out.println("\n The value of secondNum is: " + secondNum);

        // Ask user for the third int
        System.out.println("\n Please enter a third whole number: ");
        thirdNum = myScannerObject.nextInt();


        // Processing
        // Compare the inputs with nested if statements.

        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                largestOfThree = firstNum;
            }
            largestOfThree = thirdNum;
        } else {
            if (secondNum > thirdNum) ;
        }

        System.out.println("\n the largest of three is: " + largestOfThree);

    }
}
