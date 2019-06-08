package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterableDataConatiner {

    private  Set<String> data = new HashSet<>();

    public void add(String element) {
        this.data.add(element);
    }

    public Iterator<String> getIterator() {
        return new DataIterator(this);
    }

    public Set<String> getData() {
        return this.data;
    }

}
