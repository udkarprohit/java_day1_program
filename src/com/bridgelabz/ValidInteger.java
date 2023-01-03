package com.bridgelabz;

import java.util.Locale;
import java.util.Scanner;

public class ValidInteger {
    public static void main(String args[]) {
        //taking input from user
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of i : ");
        //check for integer value
        if(sc.hasNextInt()) {
//            int i = sc.nextInt();
//            //System.out.println("Invalid input i : " + sc.hasNextInt() );
//            System.out.println("Enter the value of j : ");
//            int j = sc.nextInt();
//            //System.out.println("Invalid input j : " + sc.hasNextInt() );
//            int sum = i + j;
//            System.out.println("The Sum of " + i + " + " + j + " : " + sum);
            int sum = 0;

            for(int i = 0; i < args.length;i++ )
            {
                sum = sum + Integer.parseInt(args[i]);

            }
            System.out.println(sum);
        }
        else {
            //if not integer value
            System.out.println("Enter the Integer value");
        }
        sc.close();
    }
}
