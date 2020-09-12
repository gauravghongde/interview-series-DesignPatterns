package ex1.builder.types;

import ex1.builder.PizzaBuilder;

/* "ConcreteBuilder" */
public class ThinCrustPizzaBuilder extends PizzaBuilder {
    public ThinCrustPizzaBuilder() {
        super("Thin Crust Pizza");
    }

    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildCrust() {
        pizza.setCrust("thin");
    }

    public void buildSauce() {
        pizza.setSauce("spicy");
    }

    public void buildTopping() {
        pizza.setTopping("classic");
    }
}
