package Decorator;

public class Milk extends CondimentDecorator{
    Beverages beverages;
    public Milk(Beverages beverages) {
        this.beverages = beverages;
    }

    @Override
    public String getDescription() {
        return beverages.getDescription() + ", added Milk to the Coffee..!!";
    }

    @Override
    public int cost() {
        return 30 + beverages.cost();
    }
}
