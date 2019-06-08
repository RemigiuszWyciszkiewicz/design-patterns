package com.company.example_2;

public class ElfMage extends Mage {

    private String helpType;

    public ElfMage(String helpType) {
        this.helpType = helpType;
    }

    public ElfMage(ElfMage elfMage) {
        this.helpType = elfMage.helpType;
    }

    @Override
    public Mage copy() throws CloneNotSupportedException {
        return new ElfMage(this);
    }

    @Override
    public String toString() {
        return "ElfMage{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
