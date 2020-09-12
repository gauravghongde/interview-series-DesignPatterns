package ex1.multithreadedEnv.usingEnum;

public enum MySingletonEnum {
    INSTANCE;

    int i = 5;

    public void show() {
        System.out.println("Current Value of i is: " + i);
    }
}
