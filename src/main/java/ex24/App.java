/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static int isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return 0;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] S1 = s1.toCharArray();
        char[] S2 = s2.toCharArray();

        Arrays.sort(S1);
        Arrays.sort(S2);

        if (Arrays.equals(S1, S2))
            return 1;
        else
            return 0;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String s1, s2;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        s2 = input.nextLine();

        if (isAnagram(s1,s2) == 1)
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", s1, s2);
        }
        else
        {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", s1, s2);
        }
    }
}
