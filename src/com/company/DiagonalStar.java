package com.company;

public class DiagonalStar {
    public static void printSquareStar(int number)
    {

        String star ="*";
        String space =" ";
        if (number<5)
        {
            System.out.println("Invalid Value");

        }
        else
         {
            for (int i = 0; i < number; i++)
            {

                for (int j = 0; j < number; j++)
                {
                    if ((i == j) || j == 0 || j == number - 1 || i == 0 || i == number - 1 || i + j == number - 1)
                    {
                        System.out.print(star);
                    } else
                        {
                        System.out.print(space);
                         }
                }
                System.out.println();
            }
        }

    }
}
