package com.company;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minAndMax()
    {
        Scanner scanner = new Scanner(System.in);
        int max =0;
        int min =0;

        while (true)
        {
            System.out.println("podaj liczbe");
        boolean nastepnaLiczba = scanner.hasNextInt();

        if(nastepnaLiczba)
        {
            int liczba = scanner.nextInt();
            if(liczba<min||min==0)
            {
                min=liczba;

            }
            if(liczba>max)
            {
                max=liczba;

            }
        }
        else
            break;

        }
        System.out.println("minimum podane = "+min+ " Maximum podane = "+max);
    }

}
