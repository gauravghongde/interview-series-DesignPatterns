package ex1.multithreadedEnv;

/////// Singleton Design pattern in MULTITHREADING ENV
public class SingletonPlayground {
    public static void main(String[] args) {

        //////// using nothing ==========================================================================
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MySingletonFactory threadDemo1 = MySingletonFactory.getSingletonInstance("thread1Instance");
                System.out.println(threadDemo1.getInstanceName());
            }
        });

        Thread t2 = new Thread(() -> { // new Runnable() {} replaced with lambda
            MySingletonFactory threadDemo2 = MySingletonFactory.getSingletonInstance("thread2Instance");
            System.out.println(threadDemo2.getInstanceName());
        });

        Thread t3 = new Thread(() -> {
            MySingletonFactory threadDemo3 = MySingletonFactory.getSingletonInstance("thread3Instance");
            System.out.println(threadDemo3.getInstanceName());
        });

        t1.start();
        t2.start();
        t3.start();

        //Order and occurrence will be completely random

        /* o/p:
        thread2Instance
        thread3Instance
        thread3Instance
        */
    }
}
