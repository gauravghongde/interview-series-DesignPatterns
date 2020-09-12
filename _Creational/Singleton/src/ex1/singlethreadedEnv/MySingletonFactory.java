package ex1.singlethreadedEnv;

public final class MySingletonFactory {

    // static member holds only one instance of the MySingleton class.
    private static MySingletonFactory mySingletonInstance;
    // just for making sure only one instance gets created;
    private final String instanceName;

    private MySingletonFactory(String instanceName) {
        this.instanceName = instanceName;
    }

    // We are providing global point of access.
    public static MySingletonFactory getMySingletonInstance(String instanceName) {
        if (mySingletonInstance == null) {
            mySingletonInstance = new MySingletonFactory(instanceName);
        }
        return mySingletonInstance;
    }

    public String getInstanceName() {
        return instanceName;
    }
}


