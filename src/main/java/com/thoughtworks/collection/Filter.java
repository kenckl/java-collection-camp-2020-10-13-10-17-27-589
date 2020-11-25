package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(number -> number % 3 == 0).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(secondList::contains).collect(Collectors.toList());
        //throw new NotImplementedException();
    }
}
