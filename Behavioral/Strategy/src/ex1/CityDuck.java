package ex1;

public class CityDuck extends Duck {

    public CityDuck() {
        quackStrategy = new SimpleQuackStrategy();
        flyStrategy = new SimpleFlyStrategy();
    }

    @Override
    void display() {
        System.out.println("This is a City Duck");
        super.display();
    }
}
