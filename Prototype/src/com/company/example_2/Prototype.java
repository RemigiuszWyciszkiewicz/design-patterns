package com.company.example_2;

public abstract class Prototype implements Cloneable {
    public abstract Object copy() throws CloneNotSupportedException;
}
