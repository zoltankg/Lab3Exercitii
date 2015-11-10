package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */

public class Ex4 {

    public static void main (String[] args)
    {
        // Varianta 1: am inteles gresit contextul problemei. Rezolvarea cum am inteles eu:
        /*
        int a = 50;
        System.out.print("Printing Odd numbers: " + "\n");
        for(int i=1; i <= a; i++)
        {
            if( i % 2 != 0){

                System.out.print(i + " ");
            }
        }
        System.out.print("\n" + "Printing Even numbers: " + "\n");
        for (int j = 1; j <= a; j++)
        {
            if ( j % 2 == 0){
                System.out.print(j * j + " ");
            }
        }
         */

        // Varianta 2: Rezolvare dupa model da la colegi

        Scanner in = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = in.nextInt();

        int digit;
        int oddNum = 0;
        int evenNum = 0;
        int evenPosition = 1;
        int oddPosition = 1;

        while(a > 0)
        {
            digit = a % 10;
            a = a / 10;

            if(digit % 2 == 0){
                evenNum = evenNum + (digit * evenPosition);
                evenPosition = evenPosition * 10;
            } else{
                oddNum = oddNum + (digit * oddPosition);
                oddPosition = oddPosition * 10;
            }
        }

        System.out.println("The even number: " + evenNum);
        System.out.println("The even number ^2: " + (evenNum * evenNum));
        System.out.println("The odd number: " + oddNum);
    }
}
