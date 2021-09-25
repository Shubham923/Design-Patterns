package Factory;

import Factory.product.Pizza;

public class MainApplication {
    public static void main(String []args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.createPizza("CHEESE");
        pizza.prepare();
    }
}
