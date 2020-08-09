package ex1;

public class Caramel implements IAddOnDecorator {
    // IS A Beverage &
    // HAS A Beverage
    IBeverage beverage;

    public Caramel(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
}
