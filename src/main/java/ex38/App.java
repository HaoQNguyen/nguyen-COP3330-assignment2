/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex38;

import java.util.Scanner;

public class App {

    public static int[] filterEvenNumbers(int[] number, int count)
    {
        int[] evenNumber = new int[count];
        int j = 0;

        for (int n : number) {
            if (n % 2 == 0) {
                evenNumber[j] = n;
                ++j;
            }
        }

        return evenNumber;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String[] stringList = input.nextLine().split(" ");

        int[] number = new int[stringList.length];
        int count = 0;

        for (int i = 0; i < stringList.length; ++i)
        {
            number[i] = Integer.parseInt(stringList[i]);
            if (number[i] % 2 == 0)
                ++count;
        }

        int[] evenNumber = filterEvenNumbers(number, count);
        System.out.print("The even numbers are");
        for (int i : evenNumber)
            System.out.printf(" %d", i);
    }

}
