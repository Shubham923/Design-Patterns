package Factory.creator;

import Factory.product.Cheese;
import Factory.product.Sauce;

/**
 * Concrete creator
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }
}
