package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */
public class Ex3 {

    public static void main (String[] args){
    //
    System.out.println("Introduceti un numar din minim 3 cifre: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    String palindrome = number+"";
    boolean result = palindrome.equals(new StringBuilder(palindrome).reverse().toString());
        if(result) {
            System.out.println("Numarul introdus este palindrom");
        }
        else
        {
            System.out.println("Numarul introdus nu este palindrom");
        }
    }
}
