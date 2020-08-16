package ex1;

public class NoQuackStrategy implements IQuackStrategy{
    @Override
    public void quack() {
        System.out.println("Duck doesn't makes sound");
    }
}
