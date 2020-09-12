package ex1.multithreadedEnv.usingSynchronizedKeyword;

/////// Singleton Design pattern in MULTITHREADING ENV
public class SingletonPlayground {
    public static void main(String[] args) {

        //////// using "synchronized" keyword =================================================================
        Thread t1 = new Thread(() -> {
            MySingletonFactory threadDemo1 = MySingletonFactory.getSynchronizedSingletonInstance("thread1Instance");
            System.out.println(threadDemo1.getInstanceName());
        });

        Thread t2 = new Thread(() -> {
            MySingletonFactory threadDemo2 = MySingletonFactory.getSynchronizedSingletonInstance("thread2Instance");
            System.out.println(threadDemo2.getInstanceName());
        });

        Thread t3 = new Thread(() -> {
            MySingletonFactory threadDemo3 = MySingletonFactory.getSynchronizedSingletonInstance("thread3Instance");
            System.out.println(threadDemo3.getInstanceName());
        });

        // whichever thread reaches first for method call getSynchronisedSingletonInstance(),
        // will be the Instance for all three, ex: thread2 reaches first
        t2.start();
        t1.start();
        t3.start();

        // Drawback:
        // there's a clear performance drawback: each time we want to get the instance of our singleton,
        // we need to acquire a potentially unnecessary lock.

        /* o/p:
        thread2Instance
        thread2Instance
        thread2Instance
        */
    }
}
