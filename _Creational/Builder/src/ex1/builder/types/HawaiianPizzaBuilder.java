package ex1.builder.types;

import ex1.builder.PizzaBuilder;

/* "ConcreteBuilder" */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public HawaiianPizzaBuilder() {
        super("Hawaiian Pizza");
    }

    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildCrust() {
        pizza.setCrust("thick+cheeseFilled");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
