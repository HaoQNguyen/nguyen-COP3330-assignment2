/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hao Nguyen
 */

package ex26;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        PaymentCalculator calc = new PaymentCalculator();

        System.out.print("What is your balance? ");
        calc.setB(input.nextDouble());

        System.out.print("What is the APR on the card (as a percent)? ");
        calc.setAPR(input.nextDouble());

        System.out.print("What is the monthly payment you can make? ");
        calc.setP(input.nextDouble());

        System.out.printf("It will take you %d months to pay off this card.\n", calc.calculateMonthsUntilPaidOff());
    }
}
