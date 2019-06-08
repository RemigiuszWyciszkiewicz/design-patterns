package com.company.example_2;

public class DwarwenCartOperator extends  DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(name() + "moves gold chunks out of the mine");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
