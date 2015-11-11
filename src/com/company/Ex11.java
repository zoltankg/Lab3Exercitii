package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/11/2015.
 */
public class Ex11 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti perechile de numere: ");
        int[] b = new int[50];
        for (int i = 1; i < b.length; i++) {
            b[i] = in.nextInt();
            if (b[i-1] > b[i]) {
                System.out.print(b[i - 1] + " " + b[i] + ", ");
            }
        }
    }
}
