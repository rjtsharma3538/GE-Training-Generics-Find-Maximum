package com.example;

public class getMaximum<T extends Comparable<T>> {

    T element1;
    T element2;
    T element3;

    public getMaximum(T element1, T element2, T element3) {

        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public T find_max() {
        return getMax(element1, element2, element3);
    }

    T getMax(T element1, T element2, T element3) {

        if (element1.compareTo(element2) > 0 && element1.compareTo(element3) > 0)
            return element1;
        if (element2.compareTo(element3) > 0 && element2.compareTo(element1) > 0)
            return element2;
        return element3;
    }
}
