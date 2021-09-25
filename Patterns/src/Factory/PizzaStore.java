package Factory;

import Factory.product.Pizza;

abstract class PizzaStore {
    abstract Pizza createPizza(String type);
}
