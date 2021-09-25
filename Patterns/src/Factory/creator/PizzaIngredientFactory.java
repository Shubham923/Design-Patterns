package Factory.creator;

import Factory.product.Cheese;
import Factory.product.Sauce;

/**
 * abstract creator
 */
public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Sauce createSauce();
}
