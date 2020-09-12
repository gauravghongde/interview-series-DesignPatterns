package ex1.builder.types;

import ex1.builder.PizzaBuilder;

/* "ConcreteBuilder" */
public class SpicyPizzaBuilder extends PizzaBuilder {
    public SpicyPizzaBuilder() {
        super("Spizza");
    }

    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildCrust() {
        pizza.setCrust("medium thick");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
