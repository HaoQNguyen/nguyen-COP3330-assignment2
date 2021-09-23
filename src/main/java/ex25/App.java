/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex25;


import java.util.Scanner;

public class App {

    public static int passwordValidator (String password)
    {
        int criteriaChecked = 0;

        // check if password is more than 8 characters long
        if (password.length() >= 8)
            ++criteriaChecked;

        // check if password contains at least a character
        for (int i = 0; i < password.length(); ++i)
        {
            if (Character.isLetter(password.charAt(i)))
            {
                ++criteriaChecked;

                // check if password contains at least a number
                for (int j = 0; j < password.length(); ++j)
                {
                    if (Character.isDigit(password.charAt(j)))
                    {
                        ++criteriaChecked;
                        break;
                    }
                }

                break;
            }
        }

        // check if password contains at least a special character
        for (int i = 0; i < password.length(); ++i)
        {
            if (!Character.isLetter(password.charAt(i))
                && !Character.isDigit(password.charAt(i))
                && !Character.isWhitespace(password.charAt(i)))
            {
                ++criteriaChecked;
                break;
            }
        }

        return criteriaChecked;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password to be validated: ");
        String password = input.nextLine();

        int criteriaChecked = passwordValidator(password);
        String strength = "";

        switch (criteriaChecked)
        {
            case 0:
                strength = "very weak";
                break;
            case 1: case 2:
                strength = "weak";
                break;
            case 3:
                strength = "strong";
                break;
            case 4:
                strength = "very strong";
                break;
        }

        System.out.printf("The password '%s' is a %s password.", password, strength);
    }
}