package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int secound)
    {

        if (first<10||secound<10)
        {
            return -1;
        }
        else
        {
            while (first!=secound)
            {
                if (first>secound)
                {
                    first -= secound;
                }
                else
                {
                    secound-=first;
                }
            }


        }
            return first;
    }
}
