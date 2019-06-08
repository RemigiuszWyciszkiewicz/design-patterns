package com.company.example_1;

public class AppFactory {

    BasicAppCache appCache;



    public AppFactory() {
        this.appCache = new BasicAppCache();
        this.appCache.load();
    }

    public App createApp(AppType type){
        return this.appCache.get(type);
    }
}
