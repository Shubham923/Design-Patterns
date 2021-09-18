package Decorator;
/**
 * This is abstract decorator. This class need to be implemented by other ingredient class( Concrete Decorators)
 * */
public abstract class CondimentDecorator extends Beverages {
    public abstract String getDescription();
}
