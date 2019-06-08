package com.company.example_1;

public abstract class App implements Cloneable  {

    AppType appType;

    public abstract void develop();

    public void test(){

    }

    public void deliver(){

    }

    public void debug(){

    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public AppType getAppType() {
        return appType;
    }

    public void setAppType(AppType appType) {
        this.appType = appType;
    }
}
