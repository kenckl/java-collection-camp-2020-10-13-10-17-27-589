package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().reduce(0,(num1,num2)->num1+num2).doubleValue()/arrayList.size();
        //throw new NotImplementedException();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, Integer::max);
        //throw new NotImplementedException();
    }

    public int getLastOdd() {
        return arrayList.stream().filter(integer -> integer%2 != 0).reduce(0, (first, second)->second);
        //throw new NotImplementedException();
    }
}
