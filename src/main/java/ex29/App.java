/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex29;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double r;

        while (true)
        {
            System.out.print("What is the rate of return? ");
            if (input.hasNextDouble()) {
                r = input.nextDouble();
                boolean notEqualZero = Math.abs(r - 0) > Math.pow(10, -4);

                if (notEqualZero) {
                    int year = (int) Math.ceil(72 / r);
                    System.out.printf("It will take %d years to double your initial investment.", year);
                    break;
                }
            }
            System.out.println("Sorry. That's not a valid input.");
            input.nextLine();
        }

    }

}
