package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z)
    {
        int x1=x%10;
        int y1=y%10;
        int z1=z%10;
        if (x<10||y<10||z<10||x>1000||y>1000||z>1000)
        {
            return false;
        }
        else if (x1==y1||x1==z1||z1==y1)
        {
            return true;
        }
        else
        {
            return false;
        }



    }
    public static boolean isValid(int number)
    {
     if   (number<10||number>1000)
     {
         return false;
     }
     else return true;



    }
}
