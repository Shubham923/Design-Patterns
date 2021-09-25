package Factory;

import Factory.creator.NYPizzaIngredientFactory;
import Factory.creator.PizzaIngredientFactory;
import Factory.product.CheesePizza;
import Factory.product.Pizza;
import Factory.product.SaucePizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "CHEESE":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("CHEESE");
                break;
            case "SAUCE":
                pizza = new SaucePizza(pizzaIngredientFactory);
                pizza.setName("SAUCE");
                break;
        }

        return pizza;
    }
}
