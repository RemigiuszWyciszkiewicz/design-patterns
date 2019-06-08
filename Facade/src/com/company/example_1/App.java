package com.company.example_1;

public class App {

    private String title;

    public App(String title,Design design) {
        System.out.println("Creating app  based on design:" + design);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Fantastic application";
    }
}
