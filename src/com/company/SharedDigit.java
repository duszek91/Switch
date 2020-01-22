package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y)
    {
        int x1,x2,y1,y2;
        x1=x/10;
        x2=x%10;
        y1=y/10;
        y2=y%10;

        if (x < 10 || y < 10 || x > 99 || y > 99) {
            return false;
        } else if (x1==y1||x1==y2||x2==y1||x2==y2)
        {
            return true;
        }
        else return false;
    }
}