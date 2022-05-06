package com.company;

public class SqrtNewtonsMethod {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);

        double epsilon = 1e-15;
        double m = c;

        while (Math.abs(m - c/m) > epsilon*m)
        {
            m = (c/m + m) / 2.0;
        }

        System.out.println(m);
    }

}


