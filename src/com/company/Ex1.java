package com.company;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduceti un numar intreg: ");
        int n;
        n = in.nextInt();
        int sum = 0;
        int prod = 1;
        int copiaNr = n;
        int numarCifre = 0;
        int ultimaCifra;
        int cifraMin = 9;
        int cifraMax = 0;

        //String myInt = Integer.toString(n);
        //int length = myInt.length();

        if (n <= 0)
            System.out.println("Numarul introdus nu este corect.");
        else {
            while (n != 0) {

                ultimaCifra = n % 10;
                // add last digit to the sum
                sum += ultimaCifra;
                prod *= ultimaCifra;
                numarCifre += 1;
                if(cifraMin >= ultimaCifra)
                {
                    cifraMin = ultimaCifra;
                }
                if(cifraMax <= ultimaCifra)
                {
                    cifraMax = ultimaCifra;
                }
                // cut last digit
                n /= 10;
            }
            System.out.println("Suma numerelor este: " + sum);
            System.out.println("Produsul numerelor este: " + prod);
            System.out.println("Numarul cifrelor introduse este: " + numarCifre);
            System.out.println("Cifra minima este: " + cifraMin);
            System.out.println("Cifra maxima este: " + cifraMax);
        }

        //System.out.println(length);

        int s = sum;
        int sumaIntermed = 0;
        while(s > 9){
            while(sum > 0)
            {
                ultimaCifra = sum % 10;
                sumaIntermed += ultimaCifra;
                sum /= 10;
            }
            s = sumaIntermed;
        }
        System.out.println("Cifra de control a numarului este: " + s);
        System.out.println("Numarul introdus este: " + copiaNr);

    }
}
