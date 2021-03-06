/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static String pickWinner(ArrayList<String> list, int ind)
    {
        return list.get(ind);
    }

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String newContestant;
        Random rand = new Random();

        while (true)
        {
            System.out.print("Enter a name: ");
            newContestant = input.nextLine();
            if (newContestant.length() == 0)
                break;
            list.add(newContestant);
        }

        int ind = rand.nextInt(list.size());
        System.out.printf("The winner is %s", pickWinner(list, ind));

    }

}
