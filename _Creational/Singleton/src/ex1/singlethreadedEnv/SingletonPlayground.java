package ex1.singlethreadedEnv;

public class SingletonPlayground {
    public static void main(String[] args) {
        MySingletonFactory myInstance1 = MySingletonFactory.getMySingletonInstance("myInstance1");
        MySingletonFactory myInstance2 = MySingletonFactory.getMySingletonInstance("myInstance2");
        System.out.println(myInstance1.getInstanceName());
        System.out.println(myInstance2.getInstanceName());

        // Can't create a new instance by using new
        // MySingletonFactory myInstance3 = new MySingletonFactory("myInstance3");

        /* o/p:
        myInstance1
        myInstance1
        */
    }
}
