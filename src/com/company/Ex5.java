package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */
public class Ex5 {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 25: ");

        int[] a = {1,3,4,6,7,8,10,12,14,23};
        int n;
        n = in.nextInt();
        int i;
        boolean found = false;

        for(i=0; i<a.length; i++)
        {
            if(a[i] == n)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Found " + n + " at index " + i + ".");
        }
        else
        {
            System.out.println(-1 + "\n" + "Your number is not in this array.");
        }
    }
}
