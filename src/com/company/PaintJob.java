package com.company;

public class PaintJob {
    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets)
    {
        double wynik=0;
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0)
        {
            return -1;
        }
        else
        {
            wynik = Math.ceil(((width*height)/areaPerBucket)-extraBuckets);
        }
        return (int) wynik;

    }
    public static int getBucketCount(double width, double height,double areaPerBucket)
    {
        double wynik=0;
        if(width<=0||height<=0||areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
            wynik = Math.ceil((width*height)/areaPerBucket);
        }
        return (int) wynik;
    }

    public static int getBucketCount(double area ,double areaPerBucket)
    {
        double wynik=0;
        if(area<=0||areaPerBucket<=0)
        {
            return -1;
        }
        else
        {
         wynik = Math.ceil(area/areaPerBucket);
        }
        return (int) wynik;
    }
}
