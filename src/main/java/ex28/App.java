/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex28;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < 5; ++i)
        {
            System.out.print("Enter a number: ");
            sum += input.nextDouble();
        }

        System.out.printf("The total is %.2f.", sum);
    }

}
