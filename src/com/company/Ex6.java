package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */
public class Ex6 {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg: ");
        int n = in.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Suma numarului introdus este: " + sum);
    }
}
