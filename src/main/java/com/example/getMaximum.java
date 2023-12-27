package com.example;

import java.util.Arrays;

public class getMaximum<T extends Comparable<T>> {

    T arr[];

    public getMaximum(T arr[]) {
        this.arr=arr;
    }

    public T find_max() {
        return getMax(this.arr);
    }

    T getMax(T arr[]) {
        Arrays.sort(this.arr);
        return arr[arr.length-1];
    }
}
