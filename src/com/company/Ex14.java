package com.company;


import java.util.Scanner;

/**
 * Created by Agu on 11/18/2015.
 */
public class Ex14 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int n = input.nextInt();

        int [] a = new int [n];
        System.out.println("Your array is: ");

        for (int i = 0; i < n; i++){

            int number = input.nextInt();

            if (i < (n / 2)){
                a[i] = number * 2;
            }
            else {
                if (number % 2 != 0){
                    a[i] = number * 3;
                }
                else {
                    a[i] = number;
                }
            }
        }
        System.out.println("Array modified: ");

        for (int i = 0; i < n; i++){
            if (i != (n -1)){
                System.out.print(a[i] + " , ");
            }
            else {
                System.out.print(a[i] + ".");
            }
        }
    }
}
