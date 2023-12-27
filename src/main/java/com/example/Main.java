package com.example;

public class Main {
    public static void main(String[] args) {

        // Test case -1

        String num1 = "peach";
        String num2 = "apple";
        String num3 = "banana";

        getMaximum<String> maxi1 = new getMaximum<String>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi1.find_max());

        // Test case - 2

        num1 = "apple";
        num2 = "peach";
        num3 = "banana";

        getMaximum<String> maxi2 = new getMaximum<String>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi2.find_max());


        // Test Case - 3
        num1 = "apple";
        num2 = "banana";
        num3 = "peach";

        getMaximum<String> maxi3 = new getMaximum<String>(num1, num2, num3);
        System.out.println("The maximum of " + num1 +' ' + num2 + ' ' + num3 +" is "+ maxi3.find_max());

    }
}