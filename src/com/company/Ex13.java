package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/13/2015.
 */
public class Ex13 {

    public static void main (String[] args)
    {
        int n, temp;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        int m = 0;

        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();


        }

        for (int i = 1; i < a.length; i++){
            if (a[i-1] > a[i]){
                m = 1;
            }
        }
        if (m == 0){
            System.out.println("Crescator");
        }

        else {
            for (int i = 0; i < n; i++)

            {

                for (int j = i + 1; j < n; j++)

                {

                    if (a[i] > a[j])

                    {

                        temp = a[i];

                        a[i] = a[j];

                        a[j] = temp;

                    }

                }

            }

            System.out.print("Ascending Order:");

            for (int i = 0; i < n - 1; i++)

            {

                System.out.print(a[i] + ",");

            }

            System.out.print(a[n - 1]);
        }
    }
}
