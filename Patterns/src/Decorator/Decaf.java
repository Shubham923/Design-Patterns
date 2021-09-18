package Decorator;

/**
 * This is concrete Component class. This is one of the major variation.
 * */
public class Decaf extends Beverages {

    public Decaf() {
        description = "Decaf";
    }
    @Override
    int cost() {
        return 500;  //Rs/. 50 for the Decaf :D
    }
}
