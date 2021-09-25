package Factory.product;

import Factory.product.Cheese;
import Factory.product.Sauce;

public abstract class Pizza {
    Sauce sauce;
    Cheese cheese;
    String name;

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
