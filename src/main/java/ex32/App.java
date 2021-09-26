/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex32;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int difficulty;
        int answer;
        int counter;
        int guess;

        System.out.println("Let's play Guess the Number!\n");

        while (true)
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            if (input.hasNextInt())
            {
                difficulty = input.nextInt();
                counter = 0;
                break;
            }
            input.next();
        }

        // demo answers
        if (difficulty == 1)
            answer = 9;
        else if (difficulty == 2)
            answer = 41;
        else
            answer = 702;

        System.out.print("I have my number. What's your guess? ");
        while (true)
        {
            if (input.hasNextInt())
            {
                guess = input.nextInt();
                ++counter;
                break;
            }
            input.next();
            System.out.print("Invalid input. Guess again: ");
        }


        while (guess != answer)
        {
            if (guess > answer)
            {
                System.out.print("Too high. Guess again: ");


            }
            else
            {
                System.out.print("Too low. Guess again: ");
            }

            while (true)
            {
                if (input.hasNextInt())
                {
                    guess = input.nextInt();
                    ++counter;
                    break;
                }
                input.next();
                System.out.print("Invalid input. Guess again: ");
            }
        }

        System.out.printf("You got it it %d guesses", counter);
    }

}
