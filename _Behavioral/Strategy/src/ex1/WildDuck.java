package ex1;

public class WildDuck extends Duck {

    // injecting different types of behaviours for this particular type of duck -
    public WildDuck() {
        quackStrategy = new SimpleQuackStrategy();
        flyStrategy = new FlyHighStrategy();
    }

    @Override
    void display() {
        System.out.println("This is a Wild Duck");
        super.display();
    }
}
