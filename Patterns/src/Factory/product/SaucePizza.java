package Factory.product;

import Factory.creator.PizzaIngredientFactory;

/**
 * Concrete Product
 */
public class SaucePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public SaucePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
