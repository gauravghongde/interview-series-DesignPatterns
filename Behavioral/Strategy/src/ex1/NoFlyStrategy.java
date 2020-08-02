package ex1;

public class NoFlyStrategy implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
