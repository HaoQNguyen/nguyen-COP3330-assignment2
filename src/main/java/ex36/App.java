/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */


package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void printList(ArrayList<Integer> list)
    {
        System.out.print("Numbers:");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
    }

    public static int max(ArrayList<Integer> list)
    {
        int max = list.get(0);

        for (Integer i : list) {
            if (max < i)
                max = i;
        }

        return max;
    }

    public static int min(ArrayList<Integer> list)
    {
        int min = list.get(0);

        for (Integer i : list) {
            if (min > i)
                min = i;
        }

        return min;
    }

    public static double average(ArrayList<Integer> list)
    {
        double avg = 0;

        for (Integer i : list) {
            avg += i;
        }

        avg = avg / list.size();

        return avg;
    }

    public static double standardDeviation(ArrayList<Integer> list)
    {
        double std;
        double var = 0;
        double avg = average(list);

        for (Integer i : list)
        {
            var += Math.pow(i - avg,2);
        }

        std = Math.sqrt(var / list.size());

        return std;
    }

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String s;

        while (true)
        {
            System.out.print("Enter a number: ");

            if (input.hasNextInt())
            {
                list.add(input.nextInt());
            }
            else
            {
                s = input.next();
                if (s.equalsIgnoreCase("done"))
                    break;

            }
        }

        printList(list);
        System.out.printf("\nThe average is %.2f\n", average(list));
        System.out.printf("The maximum is %d\n", max(list));
        System.out.printf("The minimum is %d\n", min(list));
        System.out.printf("The standard deviation is %.2f", standardDeviation(list));

    }

}
