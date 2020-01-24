package com.company;

public class LargestPrime {
    public static int getLargestPrime (int number) {
        int largePrime = 0;
        int counter = 2;
        if (number < 2) {
            return -1;
        }
        while (number > 1) {
            if (number % counter == 0) {
                largePrime = counter;
                number /= counter;
            } else {
                counter++;
            }
        }
        return largePrime;



    }
}