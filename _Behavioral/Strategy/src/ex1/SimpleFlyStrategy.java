package ex1;

public class SimpleFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() { // this is concrete/particular fly behaviour
        System.out.println("I am flying");
    }
}
