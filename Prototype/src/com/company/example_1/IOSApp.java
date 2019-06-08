package com.company.example_1;

public class IOSApp extends App {

    public IOSApp() {
        setAppType(AppType.IOS);
    }

    @Override
    public void develop() {
        System.out.println("developing an ios App");
    }
}
