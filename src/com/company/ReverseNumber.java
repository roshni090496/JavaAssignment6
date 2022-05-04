package com.company;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int n,rev,rem,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        rev=0;
        temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println(temp+" Reverse is: "+rev);

    }

}
