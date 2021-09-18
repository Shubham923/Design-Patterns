package Decorator;

public class Whip extends CondimentDecorator{
    Beverages beverages;
    public Whip(Beverages beverages) {
        this.beverages = beverages;
    }
    @Override
    public String getDescription() {
        return " ,added Whip to the Coffee..!!";
    }

    @Override
    int cost() {
        return 20 + beverages.cost();
    }
}
