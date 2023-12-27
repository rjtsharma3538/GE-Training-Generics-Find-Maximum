package com.example;

public class Main {
    public static void main(String[] args) {

        // Test case -1

        Integer intArr[] = { 3, 1, 35, 43, 5, 6 };

        getMaximum<Integer> maxi1 = new getMaximum<Integer>(intArr);
        maxi1.find_max();

        Float floatArr[] = { (float) 4.298, (float) 672.23, (float) 3.98, (float) 78.2 };

        getMaximum<Float> maxi2 = new getMaximum<Float>(floatArr);
        maxi2.find_max();

    
        String strArr[] = { "apple", "banana", "peanut", "peach", "mango", "lemon", "tomato" };

        getMaximum<String> maxi3 = new getMaximum<String>(strArr);
        maxi3.find_max();
    }
}