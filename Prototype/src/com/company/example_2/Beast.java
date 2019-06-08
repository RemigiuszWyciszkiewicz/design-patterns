package com.company.example_2;

public abstract class Beast extends Prototype {
    @Override
    public abstract Beast copy() throws CloneNotSupportedException;
}
