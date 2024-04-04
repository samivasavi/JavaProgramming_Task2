package guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // for reading inputs from the console
        Random random = new Random(); // Creating a Random Class 

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange; //Generating random numbers from 1 to 100 by the System
        int maxAttempts = 5;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You have Maximum 5 Attempt Limit");

        while (attempts < maxAttempts)
        {
            System.out.print("\nEnter a guess number between 1 to 100: ");
            guess = sc.nextInt(); 
            attempts++;

            if (guess < targetNumber)
            {
                System.out.println("Your Guess Number is Smaller.");
            } 
            else if (guess > targetNumber)
            {
                System.out.println("Your Guess Number is Greater.");
            } 
            else
            {
                System.out.println("OohhOO!, Your Number is Correct. You Win the Game!");
                return; 
            }
        }

        System.out.println("\nSorry, you've used all your attempts. The correct number was: " + targetNumber);
    }
}

