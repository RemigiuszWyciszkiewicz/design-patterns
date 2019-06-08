package com.company.example_2;

public class ElfWarold extends Warold {

    private String helpType;


    public ElfWarold(String helpType) {
        this.helpType = helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    public ElfWarold(ElfWarold elfWarold) {
        this.helpType = elfWarold.helpType;
    }


    @Override
    public ElfWarold copy() throws CloneNotSupportedException {
        return new ElfWarold(this);
    }

    @Override
    public String toString() {
        return "ElfWarold{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
