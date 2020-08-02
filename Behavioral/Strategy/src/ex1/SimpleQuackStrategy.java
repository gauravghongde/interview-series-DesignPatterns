package ex1;

public class SimpleQuackStrategy implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
