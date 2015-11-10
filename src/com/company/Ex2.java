package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar: ");
        Scanner in = new Scanner(System.in);
        int nr;
        nr = in.nextInt();
        int a = 0;
        int nrInvers = 0;
        while (nr > 0){
            nrInvers = nr % 10;
            a = a * 10 + nrInvers;
            nr /= 10;
        }
        System.out.print("Numarul invers al numarului introdus este: " + a);
    }
}
