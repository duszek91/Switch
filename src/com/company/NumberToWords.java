package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

public class NumberToWords {
    public static void numberToWords(int number) {
        int kolejna = 0;
        int dlugosc = getDigitCount(number);
        if(dlugosc<0)
        {
            dlugosc=0;
        }
        int odwrotna = reverse(number);
        int[] x = new int[dlugosc];
        int y = 0;
        if (number < 0)
        {
            System.out.println("Invalid Value");

        }


        else
            {
            for (int j = 0; j < dlugosc; j++) {
                x[y] = odwrotna % 10;

                odwrotna /= 10;

                switch (x[y]) {
                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                }
                y++;
            }
//        for(int i=0;i<=dlugosc;i++)
//        {
//            System.out.println(x[i]);
//        }
//
        }
        }

    public static int reverse(int reverse)
    {
        int reversed=0;
        while (reverse!=0)
        {
            reversed = reversed*10+reverse%10;
            reverse/=10;
        }
        return reversed;
    }
    public static int getDigitCount(int number)
    {

        if (number<0)
        {
            return -1;
        }

            int dlugosc = Integer.toString(number).length();

    return dlugosc;
    }
}
