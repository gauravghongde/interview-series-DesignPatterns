package ex1.multithreadedEnv;

public final class MySingletonFactory {
    private static MySingletonFactory mySingletonInstance;
    private final String instanceName;

    private MySingletonFactory(String instanceName) {
        this.instanceName = instanceName;
    }

    // All threads will parallely/concurrently call this method
    // A thread will not know if other thread has created an instance or not
    // So, multiple instances might get created
    public static MySingletonFactory getSingletonInstance(String instanceName) {
        if (mySingletonInstance == null) {
            mySingletonInstance = new MySingletonFactory(instanceName);
        }
        return mySingletonInstance;
    }

    public String getInstanceName() {
        return instanceName;
    }
}
