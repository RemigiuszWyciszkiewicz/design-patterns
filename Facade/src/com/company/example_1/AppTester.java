package com.company.example_1;

public class AppTester {

    public static boolean test(App app,Design design) {
        System.out.println("Testing app based on design" + design);

        //random result of test
        return Math.random() < 0.5;
    }
}
