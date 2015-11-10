package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */
public class Ex7 {

    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un sir de numere: ");
        int n, a = 0;
        n = in.nextInt();
        while(n != 0)
        {
            if(n > 9)
            {
                a = a + n % 10;
                while(n > 9) n = n/10;
                a = a + n;
            }
            n = in.nextInt();
        }
        System.out.println("Suma primei si a ultimei cifre este: " + a);
    }
}
