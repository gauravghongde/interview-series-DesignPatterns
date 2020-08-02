package ex1;

public class Duck {
    IQuackStrategy quackStrategy; // injectable different quack behaviours (no specific behaviour)
    IFlyStrategy flyStrategy; // injectable different fly behaviours

    // This is a common method inherited by all types of Duck
    // So, no need to have a different IDisplayStrategy
    void display() {
        quackStrategy.quack();
        flyStrategy.fly();
    }

    public static void main(String[] args) {
        Duck cityDuck = new CityDuck();
        Duck wildDuck = new WildDuck();
        Duck rubberDuck = new RubberDuck();

        cityDuck.display();
        /* o/p:

        This is a City Duck
        Quack Quack
        I am flying
        */

        wildDuck.display();
        /* o/p:

        This is a Wild Duck
        Quack Quack
        I am flying very high!!
        */

        rubberDuck.display();
        /* o/p:

        This is a Rubber Duck
        Duck doesn't makes sound
        I can't Fly
        */
    }
}
