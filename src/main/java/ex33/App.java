/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"Yes.", "No.", "Maybe.", "Ask again later."};

        System.out.print("What's your question?\n> ");
        input.nextLine();

        int ind = rand.nextInt(4);
        System.out.print(choices[ind]);
    }

}
