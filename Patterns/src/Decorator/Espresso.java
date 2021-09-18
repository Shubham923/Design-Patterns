package Decorator;

/**
 * This is concrete Component class. This is one of the major variation.
 * */
public class Espresso extends Beverages {

    public Espresso() {
        description = "Espresso";
    }
    @Override
    int cost() {
        return 100;  //Rs/. 100 for the Espresso :D
    }
}
