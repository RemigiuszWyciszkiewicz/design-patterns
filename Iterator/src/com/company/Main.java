package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        IterableDataConatiner dc = new IterableDataConatiner();

        dc.add("Iterator");
        dc.add("Design");
        dc.add("Pattern");
        dc.add("by");
        dc.add("Remigiusz");
        dc.add("Wyciszkiewicz");

        Iterator<String> iterator = dc.getIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
    }
}
