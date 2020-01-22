package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int number2 =number;
        int reversedNum =0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }

        if (reversedNum==number2)
        {
            System.out.println("jest");
            return true;
        }
        else
            System.out.println("nie jest");
        return false;
    }
}
