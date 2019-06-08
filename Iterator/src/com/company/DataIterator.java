package com.company;

import java.util.Iterator;

public class DataIterator implements Iterator<String> {

    private final Iterator<String> iterator;

    public DataIterator(IterableDataConatiner cont) {
        this.iterator = cont.getData().iterator();
    }


    public boolean hasNext() {
        return this.iterator.hasNext();
    }


    public String next() {
        if (this.iterator.hasNext()) {
            return this.iterator.next();
        }
        return null;
    }
}
