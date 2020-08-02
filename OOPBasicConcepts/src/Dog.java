public class Dog extends Animal{

    public void run() {
        System.out.println("running..");
    }

    Dog() {
        super();
        setSound("bark");
    }

    @Override
    public int getNoOfLegs() {
        return 4;
    }
}
