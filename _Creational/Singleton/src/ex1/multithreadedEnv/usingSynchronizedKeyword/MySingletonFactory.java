package ex1.multithreadedEnv.usingSynchronizedKeyword;

public final class MySingletonFactory {
    // static member holds only one instance of the MySingleton class.
    private static MySingletonFactory mySingletonInstance;
    // just for making sure only one instance gets created;
    private final String instanceName;

    private MySingletonFactory(String instanceName) {
        this.instanceName = instanceName;
    }

    // when one threads holds this method, others have to wait until it finishes
    public static synchronized MySingletonFactory getSynchronizedSingletonInstance(String instanceName) {
        if (mySingletonInstance == null) {
            mySingletonInstance = new MySingletonFactory(instanceName);
        }
        return mySingletonInstance;
    }

    public String getInstanceName() {
        return instanceName;
    }
}
