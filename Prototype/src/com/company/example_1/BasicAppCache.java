package com.company.example_1;

import java.util.HashMap;
import java.util.Map;

public class BasicAppCache {

    Map<AppType,App> appCache = new HashMap<>();

    public void load() {

        System.out.println("Loading apps");

        this.appCache.put(AppType.IOS,new IOSApp());
        this.appCache.put(AppType.ANDROID,new AndroidApp());
    }

    public App get(AppType appType) {

        System.out.println("Getting app of type " + appType);

        App app = this.appCache.get(appType);

        if(app != null) {
            try {
                return (App) app.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
