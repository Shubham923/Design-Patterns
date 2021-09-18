package Decorator;

/**
 *
 * This is abstract component class. This is the class that we are going to decorate.
 * */
public abstract class Beverages {
    String description = "Added";

    public String getDescription() {
        return description;
    }

    abstract int cost();
}
