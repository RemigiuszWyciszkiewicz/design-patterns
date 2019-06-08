package com.company.example_1;

public class AppStore {

    public void orderApp(AppType type) {
        final App app = new AppFactory().createApp(type);

        app.develop();
        app.debug();
        app.deliver();
    }


}
