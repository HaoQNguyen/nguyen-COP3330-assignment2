/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex31;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int restingHR;
        int age;
        int targetHR;

        while (true)
        {
            System.out.print("Age: ");
            if (input.hasNextInt())
            {
                age = input.nextInt();
                break;
            }
            input.nextLine();
            System.out.println("Invalid input");
        }

        while (true)
        {
            System.out.print("Resting Pulse: ");
            if (input.hasNextInt())
            {
                restingHR = input.nextInt();
                break;
            }
            input.nextLine();
            System.out.println("Invalid input");
        }

        System.out.println("\nIntensity    | Rate");
        System.out.println("-------------|--------");
        for (int intensity = 55; intensity <= 95; intensity += 5)
        {
            targetHR = (int) Math.round((((220 - age) - restingHR) * intensity/100.0) + restingHR);
            System.out.printf("%d%%          | %d bpm\n", intensity, targetHR);
        }
    }

}
