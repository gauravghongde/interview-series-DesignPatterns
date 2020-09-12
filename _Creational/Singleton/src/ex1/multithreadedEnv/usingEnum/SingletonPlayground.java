package ex1.multithreadedEnv.usingEnum;

/////// Singleton Design pattern in MULTITHREADING ENV
public class SingletonPlayground {
    public static void main(String[] args) {
        /////// using "ENUM" =======================================================

        MySingletonEnum mySingletonObjOne = MySingletonEnum.INSTANCE;
        MySingletonEnum mySingletonObjTwo = MySingletonEnum.INSTANCE;

        mySingletonObjOne.show(); //5
        mySingletonObjTwo.show(); //5

        mySingletonObjOne.i++;    //++
        mySingletonObjOne.show(); //6
        mySingletonObjTwo.show(); //6

        mySingletonObjTwo.i++;    //++
        mySingletonObjOne.show(); //7
        mySingletonObjTwo.show(); //7

        /* o/p:
        Current Value of i is: 5
        Current Value of i is: 5
        Current Value of i is: 6
        Current Value of i is: 6
        Current Value of i is: 7
        Current Value of i is: 7
         */
    }
}
