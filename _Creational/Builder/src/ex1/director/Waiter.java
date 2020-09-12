package ex1.director;

import ex1.builder.PizzaBuilder;
import ex1.builder.product.Pizza;

/* "Director" */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public void servePizza() {
        Pizza pizza = pizzaBuilder.getPizza();
        System.out.printf(
                "\nServing %s,\nhaving %s crust, built with %s dough, with %s sauce and %s toppings\n",
                pizza.getType(),
                pizza.getCrust(),
                pizza.getDough(),
                pizza.getSauce(),
                pizza.getTopping());
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildCrust();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
