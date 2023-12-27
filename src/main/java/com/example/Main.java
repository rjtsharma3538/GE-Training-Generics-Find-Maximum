package com.example;

public class Main {
    public static void main(String[] args) {

        // Test case -1

        Integer num1 = 10;
        Integer num2 = 5;
        Integer num3 = 3;

        getMaximum<Integer> maxi1 = new getMaximum<Integer>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi1.find_max());

        // Test case -2 

        num1 = 5;
        num2 = 10;
        num3 = 3;

        getMaximum<Integer> maxi2 = new getMaximum<Integer>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi2.find_max());

        // Test case - 3

        num1 = 5;
        num2 = 3;
        num3 = 10;

        getMaximum<Integer> maxi3 = new getMaximum<Integer>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi3.find_max());


    }
}