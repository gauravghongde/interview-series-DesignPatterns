package ex1.multithreadedEnv.usingDoubleCheckedLocking;

/////// Singleton Design pattern in MULTITHREADING ENV
public class SingletonPlayground {
    public static void main(String[] args) {


        ///////// using "Double Checked Locking" =========================================================
        Thread t4 = new Thread(() -> {
            MySingletonFactory threadDemo1 = MySingletonFactory.getDCLSingletonInstance("thread4Instance");
            System.out.println(threadDemo1.getInstanceName());
        });

        Thread t5 = new Thread(() -> {
            MySingletonFactory threadDemo2 = MySingletonFactory.getDCLSingletonInstance("thread5Instance");
            System.out.println(threadDemo2.getInstanceName());
        });

        Thread t6 = new Thread(() -> {
            MySingletonFactory threadDemo3 = MySingletonFactory.getDCLSingletonInstance("thread6Instance");
            System.out.println(threadDemo3.getInstanceName());
        });

        t4.start();
        t5.start();
        t6.start();

        /* o/p:
        thread6Instance
        thread6Instance
        thread6Instance
        */

    }
}
