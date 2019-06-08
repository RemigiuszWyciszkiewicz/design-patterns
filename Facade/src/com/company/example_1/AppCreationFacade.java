package com.company.example_1;

public class AppCreationFacade {

    public  static App orderApp(String requirements) {

        Design design=AppDesigner.design(requirements);
        App app = AppDeveloper.develop(design);
        AppTester.test(app,design);

        return app;
    }
}
