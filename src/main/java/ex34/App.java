/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex34;

import java.util.Scanner;

public class App {

    public static int removeEmployee(String[] arr, String target, int count)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            if (arr[i].equalsIgnoreCase(target))
            {
                for (int j = i; j < arr.length-1; ++j)
                {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }

        return count - 1;
    }

    public  static void printArray(String[] employees, int count)
    {
        System.out.printf("There are %d employees:\n", count);
        for (int i = 0; i < count; ++i) {
            System.out.println(employees[i]);
        }
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int count = employees.length;

        printArray(employees, count);
        System.out.print("\nEnter an employee name to remove: ");
        String target = input.nextLine();
        System.out.println();

        count = removeEmployee(employees, target, count);
        printArray(employees, count);
    }

}
