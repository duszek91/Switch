package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        if(number<0)
        {
            return -1;
        }
        else
        {
            int number2=number;
            int dlugosc = String.valueOf(number).length();
            int sum=0;
            //System.out.println(dlugosc);
            int arr []= new int[dlugosc];
            int i=0;
            do {
                arr[i] = number2 % 10;
                number2 /= 10;
                i++;
            } while (number2 != 0);

            for(int j =0;j<dlugosc;j++)
            {
                if(arr[j] % 2 == 0)
                {
                 sum = sum+arr[j];
                }
            }
            return sum;
        }
    }
}
