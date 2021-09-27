/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex37;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void fillCharList(char[] character)
    {
        for (int i = 65; i <= 90; ++i)
        {
            character[i-65] = (char) i;
        }
        for (int i = 97; i <= 122; ++i)
        {
            character[i-71] = (char) i;
        }
    }

    public static void fillSpecialList(char[] special)
    {
        for (int i = 32; i <= 47; ++i)
        {
            special[i-32] = (char) i;
        }
        for (int i = 58; i <= 64; ++i)
        {
            special[i-42] = (char) i;
        }
        for (int i = 91; i <= 96; ++i)
        {
            special[i-68] = (char) i;
        }
        for (int i = 123; i <= 126; ++i)
        {
            special[i-94] = (char) i;
        }
    }

    public static String generatePassword(char[] character, char[] number, char[] special,
                                          int length, int numSpecial, int numNum, Random rand)
    {
        int numChar = length / 2.0 > (numSpecial + numNum) ? length - (numSpecial + numNum) : numSpecial + numNum;
        char[] password = new char[numChar + numNum + numSpecial];

        int ind;
        int i;
        int j = 0;

        // append random characters, numbers, and special characters into password
        for (i = 0; i < numChar; ++i)
        {
            ind = rand.nextInt(character.length);
            password[j] = character[ind];
            ++j;
        }
        for (i = 0; i < numNum; ++i)
        {
            ind = rand.nextInt(number.length);
            password[j] = number[ind];
            ++j;
        }
        for (i = 0; i < numSpecial; ++i)
        {
            ind = rand.nextInt(special.length);
            password[j] = special[ind];
            ++j;
        }

        // shuffle password
        char temp;
        for (i = 0; i < password.length; ++i)
        {
            ind = rand.nextInt(password.length);
            temp = password[i];
            password[i] = password[ind];
            password[ind] = temp;
        }

        return new String(password);
    }

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char[] character = new char[52];
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] special = new char[33];

        fillCharList(character);
        fillSpecialList(special);

        System.out.print("What's the minimum length? ");
        int length = input.nextInt();
        System.out.print("How many special characters? ");
        int numSpecial = input.nextInt();
        System.out.print("How many numbers? ");
        int numNum = input.nextInt();

        String password = generatePassword(character, number, special, length, numSpecial, numNum, rand);
        System.out.printf("Your password is %s", password);

    }

}
