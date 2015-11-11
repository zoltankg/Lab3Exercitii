package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/11/2015.
 */
public class Ex10 {

    public static void main(String[] args)
    {
        int n, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if ( n < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for (int c = 1 ; c <= n ; c++ )
                fact = fact * c;

            System.out.println("Factorial of " + n + " is = " + fact);
        }
    }
}
