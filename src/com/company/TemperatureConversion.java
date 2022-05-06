package com.company;
import java.util.Scanner;
    public class TemperatureConversion {

        public static void main(String[] args) {
            {
                double fa,ce;
                Scanner sc=new Scanner(System.in);
                System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
                int ch=sc.nextInt();
                switch(ch)
                {
                    case 1:  System.out.println("Enter  Fahrenheit temperature");
                        fa=sc.nextDouble();
                        ce=(fa-32)*5/9;
                        System.out.println("Celsius temperature is = "+ce);
                        break;
                    case 2:  System.out.println("Enter  Celsius temperature");
                        ce=sc.nextDouble();
                        fa=((9*ce)/5)+32;
                        System.out.println("Fahrenheit temperature is = "+fa);
                        break;
                    default:  System.out.println("please choose valid choice");
                }
            }
        }

    }


