package com.example;

import java.util.Arrays;

public class getMaximum<T extends Comparable<T>> {

    T arr[];

    public getMaximum(T arr[]) {
        this.arr = arr;
    }

    public void find_max() {
        getMax(this.arr);
    }

    void getMax(T arr[]) {
        Arrays.sort(this.arr);
        
        System.out.println("The maximum value among all elements of array is " + arr[arr.length - 1]);
    }
}
