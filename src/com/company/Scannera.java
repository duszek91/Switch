package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Scannera {
    public static void Skaner()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt)
        {
            int yearOfBirth =scanner.nextInt();
            scanner.nextLine();


            System.out.println("enter your name : ");
            String name = scanner.nextLine();
            int age = 2020-yearOfBirth;
            if(age>=0&& age<=100)
            {
                System.out.println("your name is "+name+" and you are " +age +" years old.");

            }else
            {
                System.out.println("Invalid year of birth");
            }
        } else
        {
            System.out.println("unable to parse year of birth");
        }


        scanner.close();
    }
}
