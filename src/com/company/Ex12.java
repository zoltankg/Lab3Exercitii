package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/11/2015.
 */
public class Ex12 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int x = in.nextInt();

        System.out.println("Introduceti puterea: ");
        int n = in.nextInt();

        System.out.println("Suma numerelor la puterea n: ");

        int suma = 0, ridicareLaPutere;

        for (int i = 0; i <= n; i++) {
            ridicareLaPutere = (int)Math.pow(x, i);
            suma += ridicareLaPutere;
        }
        System.out.println(suma);
    }
}
