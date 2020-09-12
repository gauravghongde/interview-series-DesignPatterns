package ex1;

import ex1.builder.PizzaBuilder;
import ex1.builder.types.HawaiianPizzaBuilder;
import ex1.builder.types.SpicyPizzaBuilder;
import ex1.builder.types.ThinCrustPizzaBuilder;
import ex1.director.Waiter;

/* A customer ordering a pizza. */
public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        PizzaBuilder thinCrustPizzaBuilder = new ThinCrustPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        waiter.servePizza();

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        waiter.servePizza();

        waiter.setPizzaBuilder(thinCrustPizzaBuilder);
        waiter.constructPizza();
        waiter.servePizza();

        /* o/p:
        Serving Hawaiian Pizza,
        having thick+cheeseFilled crust, built with cross dough, with mild sauce and ham+pineapple toppings

        Serving Spizza,
        having medium thick crust, built with pan baked dough, with hot sauce and pepperoni+salami toppings

        Serving Thin Crust Pizza,
        having thin crust, built with pan baked dough, with spicy sauce and classic toppings
         */
    }
}
