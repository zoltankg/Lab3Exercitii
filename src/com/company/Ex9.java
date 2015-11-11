package com.company;

/**
 * Created by Agu on 11/11/2015.
 */
public class Ex9 {

    public static void main(String[] args)
    {
        // Varianta 1:
        // System.out.println("2 la puterea 5" + " este " + Math.pow(2, 5));

        //Varinata 2:

        int nrInitial = 2;
        int puterea = 2;
        int nrLaPutere = 1;
        for(int i = 0; i < puterea; i++)
        {
            nrLaPutere = nrLaPutere * nrInitial;

        }
        System.out.println(nrLaPutere);
    }
}
