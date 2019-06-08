package com.company.example_2;

public abstract class DwarvenMineWorker {

    public void goToSleep() {
        System.out.println(name() + "Goes to sleep.");
    }
    public void wakeUp() {
        System.out.println(name() + " wake Up");
    }

    public void goHome() {
        System.out.println(name() + " go Home");
    }

    public void goToMine() {
        System.out.println(name() + " go to mine");
    }

    private  void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("udnefined action");
                break;
        }
    }


    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }


    public abstract void work();

    public abstract String name();

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
