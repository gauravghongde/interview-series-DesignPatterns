package ex1.builder;

import ex1.builder.product.Pizza;

/* "Abstract Builder" */
public abstract class PizzaBuilder {
    protected Pizza pizza;
    protected String type;

    public PizzaBuilder(String type) {
        this.type = type;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza(type);
    }

    public abstract void buildDough();

    public abstract void buildCrust();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
