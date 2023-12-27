package com.example;

public class Main {
    public static void main(String[] args) {

        // Test case -1

        Float num1 = (float)10.287;
        Float num2 = (float)5.378;
        Float num3 = (float)10.286;

        getMaximum<Float> maxi1 = new getMaximum<Float>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi1.find_max());

        // Test case - 2

        num1 = (float)10.287;
        num2 = (float)10.4;
        num3 = (float)10.2865;

        getMaximum<Float> maxi2 = new getMaximum<Float>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi2.find_max());


        // Test Case - 3
        num1 = (float)10.287;
        num2 = (float)5.378;
        num3 = (float)10.2875;

        getMaximum<Float> maxi3 = new getMaximum<Float>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi3.find_max());

    }
}