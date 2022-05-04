package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        int term,a=0, b=1, c,i;
        System.out.println("Enter Number");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for( i= 1; i<= term; i++)
        {
            System.out.print( a+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
