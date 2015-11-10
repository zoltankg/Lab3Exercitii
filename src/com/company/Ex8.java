package com.company;

import java.util.Scanner;

/**
 * Created by Agu on 11/10/2015.
 */
public class Ex8 {

    public static void main(String[] args)
    {
        System.out.println("Intoduceti un numar intre 9 si 24");
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        System.out.println("Ati introdus:" + nr);

        //int n = 10;
        if(nr >= 9 && nr <= 24){
            System.out.println("Felicitari!!");
        }
        else{
            System.out.println("Nu este corect numarul introdus!");
        }
    }
}
