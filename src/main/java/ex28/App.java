/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex28;

import java.util.Scanner;

public class App {

    public static int sum(int[] number)
    {
        int total = 0;

        for (int i = 0; i < 5; ++i)
        {
            total += number[i];
        }

        return total;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];

        for (int i = 0; i < 5; ++i)
        {
            System.out.print("Enter a number: ");
            number[i] += input.nextInt();
        }

        System.out.printf("The total is %d.", sum(number));
    }

}
