/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex27;

import java.util.Scanner;

public class App {

    public static int validateFirstName(String name)
    {
        int error = 0;

        if (name.length() == 0)
        {
            System.out.println("The first name must be filled in.");
            ++error;
        }

        if (name.length() < 2)
        {
            System.out.println("The first name must be at least 2 characters long.");
            ++error;
        }

        return error;
    }

    public static int validateLastName(String name)
    {
        int error = 0;

        if (name.length() == 0)
        {
            System.out.println("The last name must be filled in.");
            ++error;
        }

        if (name.length() < 2)
        {
            System.out.println("The last name must be at least 2 characters long.");
            ++error;
        }

        return error;
    }

    public static int validateZipCode(String zipCode)
    {
        if (zipCode.length() != 5)
        {
            System.out.println("The ZIP code must be a 5 digit number.");
            return 1;
        }

        for (int i = 0; i < zipCode.length(); ++i)
        {
            if (Character.isLetter(zipCode.charAt(i)))
            {
                System.out.println("The ZIP code must be a 5 digit number.");
                return 1;
            }
        }

        return 0;
    }

    public static int validateID(String employeeID)
    {
        if (employeeID.length() != 7)
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return 1;
        }

        if (Character.isLetter(employeeID.charAt(0))
            && Character.isLetter(employeeID.charAt(1))
            && employeeID.charAt(2) == '-'
            && Character.isDigit(employeeID.charAt(3))
            && Character.isDigit(employeeID.charAt(4))
            && Character.isDigit(employeeID.charAt(5))
            && Character.isDigit(employeeID.charAt(6)))
        {
            return 0;
        }
        else
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return 1;
        }
    }

    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID)
    {
        int error = 0;

        error += validateFirstName(firstName);
        error += validateLastName(lastName);
        error += validateID(employeeID);
        error += validateZipCode(zipCode);

        if (error == 0)
        {
            System.out.println("There were no errors found.");
        }
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        validateInput(firstName, lastName, zipCode, employeeID);
    }
}
