/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int monthNum;
        String monthName;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        monthNum = input.nextInt();

        switch (monthNum)
        {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: monthName = "invalid";
            {
                System.out.print("That is an invalid month number. Enter a number between 1 and 12.\n");
                break;
            }
        }

        System.out.print("The name of the month is " + monthName + ".");
    }
}