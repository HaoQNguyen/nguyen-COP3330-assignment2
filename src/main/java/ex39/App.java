/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex39;

import java.util.*;

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
        for (int i = 1; i <= 6; ++i)
        {
            name = mapList.get(0).get(i) + " " + mapList.get(1).get(i);
            System.out.printf("%-19s | %-17s | %s", name, mapList.get(2).get(i), mapList.get(3).get(i));
            System.out.println();
        }
    }

    public static ArrayList<Map<Integer, String>> sortList(ArrayList<Map<Integer, String>> mapList)
    {
        ArrayList<Map<Integer, String>> sortedList = new ArrayList<>(4);
        Map<Integer, String> firstName = mapList.get(0);
        Map<Integer, String> lastName = mapList.get(1);
        Map<Integer, String> position = mapList.get(2);
        Map<Integer, String> separationDate = mapList.get(3);

        String temp;

        for (int i = 1; i <= lastName.size()-1; ++i)
        {
            for (int j = i+1; j <= lastName.size(); ++j)
            {
                if (lastName.get(j).compareTo(lastName.get(i)) < 0)
                {
                    temp = firstName.get(i);
                    firstName.put(i, firstName.get(j));
                    firstName.put(j, temp);

                    temp = lastName.get(i);
                    lastName.put(i, lastName.get(j));
                    lastName.put(j, temp);

                    temp = position.get(i);
                    position.put(i, position.get(j));
                    position.put(j, temp);

                    temp = separationDate.get(i);
                    separationDate.put(i, separationDate.get(j));
                    separationDate.put(j, temp);
                }
            }
        }

        sortedList.add(firstName);
        sortedList.add(lastName);
        sortedList.add(position);
        sortedList.add(separationDate);

        return sortedList;
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

        System.out.println("Unsorted List:");
        printList(mapList);

        System.out.println("\nSorted List:");
        mapList = sortList(mapList);
        printList(mapList);
    }

}
