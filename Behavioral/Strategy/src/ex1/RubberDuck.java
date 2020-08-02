package ex1;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackStrategy = new NoQuackStrategy();
        flyStrategy = new NoFlyStrategy();
    }

    @Override
    void display() {
        System.out.println("This is a Rubber Duck");
        super.display();
    }
}
