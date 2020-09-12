package ex1.multithreadedEnv.usingDoubleCheckedLocking;

public final class MySingletonFactory {
    private static MySingletonFactory mySingletonInstance;
    private final String instanceName;

    private MySingletonFactory(String instanceName) {
        this.instanceName = instanceName;
    }

    // we can start by verifying if we need to create the object in the first place
    // and only in that case we would acquire the lock.
    // saves some time here
    public static MySingletonFactory getDCLSingletonInstance(String instanceName) {
        if (mySingletonInstance == null) {
            synchronized (MySingletonFactory.class) {
                if (mySingletonInstance == null) {
                    mySingletonInstance = new MySingletonFactory(instanceName);
                }
            }
        }
        return mySingletonInstance;
    }

    public String getInstanceName() {
        return instanceName;
    }
}
