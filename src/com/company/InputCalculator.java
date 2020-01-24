package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        int sum = 0;
        long avg = 0;
        while (true)
        {
            boolean czyliczba = scanner.hasNextInt();

            if(czyliczba)
            {
                int liczba = scanner.nextInt();
                count++;
                sum+=liczba;

            }
            else break;
        }
        avg = Math.round((double)sum /(double)count);
        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}
