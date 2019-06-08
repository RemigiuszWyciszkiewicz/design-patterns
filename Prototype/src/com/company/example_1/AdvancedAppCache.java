package com.company.example_1;

import java.util.HashMap;
import java.util.Map;

public class AdvancedAppCache {

    Map<AppType,App> appCache =new HashMap<>();

    private App load(AppType appType) {
        switch (appType) {
            case IOS:
                final App app = new IOSApp();
                this.appCache.put(appType,app);
                return app;
            case ANDROID:
                final App app2 = new AndroidApp();
                this.appCache.put(appType,app2);
                return app2;

            default:
                return null;
        }

    }


    //Przy ladowaniu objektow z bazy danych sprawdzam czy istnieje juz w cache,jezeli tak to kopjuje tylko zawartość
    //jeżeli nie istnieje to metodą load ładujemy objekt do cachea
    public App get(AppType appType) {
        App app=this.appCache.get(appType);
        if(app == null) {
            app = load(appType);
        }

        try {
            return (App) app.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
