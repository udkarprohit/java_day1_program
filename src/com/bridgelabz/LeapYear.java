package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        year = sc.nextInt();
        if( year >= 1582 ) {
            if ( year % 4 == 0 || year % 400 == 0 ) {
                System.out.println(year + " Is a Leap Year");
            } else {
                System.out.println(year + " Not a Leap Year");
            }
        }
        else {
            System.out.println("Enter the year >= 1582");
        }
    }
}
