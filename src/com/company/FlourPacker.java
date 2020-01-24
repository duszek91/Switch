package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount, int goal)
    {

        bigCount=bigCount*5;
        if(bigCount <0||smallCount<0||goal<0)
        {
            return false;
        }
        else if (bigCount<goal)
        {
            while (smallCount>=0)
            {
                if (bigCount+smallCount==goal)
                {
                    return true;}
                else smallCount--;
            }

            return false;
        }
        else if (bigCount>=goal)
        {
            int a = smallCount;
            while (bigCount>=5)
            {
                while (smallCount>=0)
                {
                    if(bigCount+smallCount==goal)
                    {
                        return true;
                    }
                    else smallCount--;
                }
                bigCount -= 5;
                smallCount = a;

            }
            return false;
        }
        return false;
    }
}
