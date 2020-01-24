package com.company;

import java.util.Scanner;

public class InputChallenge {
    public static void inputChellenges()
    {
        int sumator=0;
        int licznaObrotów=1;
        Scanner scanner = new Scanner(System.in);
        for (int i=1;i<=10;i++)
        {
            System.out.println("Podaj liczbe do zliczenia #"+i);
            boolean hasNextInt = scanner.hasNextInt();
            if (licznaObrotów==10)
            {
                break;
            }

            if(hasNextInt)
            {
                int liczba =scanner.nextInt();
                scanner.nextLine();
                sumator+=liczba;
                licznaObrotów++;
            }
            else
            {
                scanner.nextLine();
                i--;
                System.out.println("invalid number");

            }


        }
        scanner.close();
        System.out.println("suma podanych cyfr to: " +sumator);




    }
}
