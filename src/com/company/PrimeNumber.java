package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        System.out.println(" Enter Any Number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for( int i=1; i<=n; i++)
        {
            if(n%i==0)
                System.out.println(" Prime Number: ");

            else
                System.out.println("Not  Prime Number: ");
        }
    }
}