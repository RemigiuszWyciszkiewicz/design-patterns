package com.company.example_1;

public class AndroidApp extends App {

    public AndroidApp() {
        setAppType(AppType.ANDROID);
    }

    @Override
    public void develop() {
        System.out.println("Developing android App");
    }
}
