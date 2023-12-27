package com.example;

public class Main {
    public static void main(String[] args) {

        // Test case -1

        Float num1 = (float)10.287;
        Float num2 = (float)5.378;
        Float num3 = (float)10.2865;

        getMaximum<Float> maxi1 = new getMaximum<Float>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi1.find_max());

    }
}