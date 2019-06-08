package com.company.example_2;

public class ElfBeast extends Beast {

    private String helpType;

    public ElfBeast(String helpType) {
        this.helpType = helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    public ElfBeast(ElfBeast elfBeast) {
        this.helpType = elfBeast.helpType;
    }

    @Override
    public ElfBeast copy() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public String toString() {
        return "ElfBeast{" +
                "helpType='" + helpType + '\'' +
                '}';
    }
}
