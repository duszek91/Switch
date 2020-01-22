package com.company;

import java.util.stream.IntStream;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number)
    {
        int sum = 0;
        for (int i = 1; i <= number - 1; i++) {

            if (number % i != 0) {

                continue;
            }
            sum = sum + i;
        }
        if(number<1)
        {
            return false;
        }
        else if(sum==number)
        {
                System.out.println(sum);
                System.out.println(number);
            return true;
        }
    return false;
    }
}
//                for (int j=0;j<=number;j++)
//                        {
//                        int[] x = new int[number];
//                        x[j]=i;
//                        sum = IntStream.of(x).sum();
//                        }