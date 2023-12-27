package com.example;

public class Main {
    public static void main(String[] args) {

        // Test case -1

        Integer num1 = 10;
        Integer num2 = 5;
        Integer num3 = 3;

        getMaximum<Integer> maxi = new getMaximum<Integer>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi.find_max());


    }
}