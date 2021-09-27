/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void fillMaps(Map<Integer, String> firstName,
                                Map<Integer, String> lastName,
                                Map<Integer, String> position,
                                Map<Integer, String> separationDate)
    {
        firstName.put(1, "John");
        firstName.put(2, "Tou");
        firstName.put(3, "Michaela");
        firstName.put(4, "Jake");
        firstName.put(5, "Jacquelyn");
        firstName.put(6, "Sally");

        lastName.put(1, "Johnson");
        lastName.put(2, "Xiong");
        lastName.put(3, "Michaelson");
        lastName.put(4, "Jacobson");
        lastName.put(5, "Jackson");
        lastName.put(6, "Webber");

        position.put(1, "Manager");
        position.put(2, "Software Engineer");
        position.put(3, "District Manager");
        position.put(4, "Programmer");
        position.put(5, "DBA");
        position.put(6, "Web Developer");

        separationDate.put(1, "2016-12-31");
        separationDate.put(2, "2016-10-05");
        separationDate.put(3, "2015-12-19");
        separationDate.put(4, "");
        separationDate.put(5, "");
        separationDate.put(6, "2015-12-18");
    }

    public static void printList(ArrayList<Map<Integer, String>> mapList)
    {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        String name;
        for (int i = 1; i <= mapList.get(0).size(); ++i)
        {
            name = mapList.get(0).get(i) + " " + mapList.get(1).get(i);
            System.out.printf("%-19s | %-17s | %s", name, mapList.get(2).get(i), mapList.get(3).get(i));
            System.out.println();
        }
    }

    public static ArrayList<Map<Integer, String>> searchList(ArrayList<Map<Integer, String>> mapList, String target)
    {
        ArrayList<Map<Integer, String>> resultList = new ArrayList<>(4);

        Map<Integer, String> firstName = new HashMap<>();
        Map<Integer, String> lastName = new HashMap<>();
        Map<Integer, String> position = new HashMap<>();
        Map<Integer, String> separationDate = new HashMap<>();

        int j = 1;
        for (int i = 1; i <= 6; ++i)
        {
            if (mapList.get(0).get(i).contains(target) || mapList.get(1).get(i).contains(target))
            {
                firstName.put(j, mapList.get(0).get(i));
                lastName.put(j, mapList.get(1).get(i));
                position.put(j, mapList.get(2).get(i));
                separationDate.put(j, mapList.get(3).get(i));
                ++j;
            }
        }

        resultList.add(firstName);
        resultList.add(lastName);
        resultList.add(position);
        resultList.add(separationDate);

        return resultList;
    }

    public static void main( String[] args )
    {
        Map<Integer, String> firstName = new HashMap<>();
        Map<Integer, String> lastName = new HashMap<>();
        Map<Integer, String> position = new HashMap<>();
        Map<Integer, String> separationDate = new HashMap<>();

        fillMaps(firstName, lastName, position, separationDate);

        ArrayList<Map<Integer, String>> mapList = new ArrayList<>(4);
        mapList.add(firstName);
        mapList.add(lastName);
        mapList.add(position);
        mapList.add(separationDate);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String target = input.nextLine();

        ArrayList<Map<Integer, String>> resultList = searchList(mapList, target);
        System.out.println("\nResult:\n");
        printList(resultList);
    }

}
