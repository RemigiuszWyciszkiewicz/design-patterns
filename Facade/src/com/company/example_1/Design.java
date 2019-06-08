package com.company.example_1;

public class Design {

        String requirements;

    public Design(String requirements) {
        this.requirements = requirements;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "App requirements: " + requirements;
    }
}
