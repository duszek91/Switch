package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        if (number<0)
        {
            return -1;
        }
        else
        {


        int number2 =number;
        int reversedNum =0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }
        reversedNum = reversedNum%10;
        number2= number2%10;
        return reversedNum+number2;

        }
    }
}
