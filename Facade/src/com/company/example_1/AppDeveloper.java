package com.company.example_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppDeveloper {

    private static List<String> NAMES = Arrays.asList("Moon Forgotten" , "Thunder Storm", "Rusty Gantlet" , "Skilled Ostrich");

    public static App develop(Design design) {

        Collections.shuffle(NAMES);

        return new App(NAMES.get(0),design);
    }
}
