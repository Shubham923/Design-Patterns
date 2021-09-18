package Decorator;

public class MainApplication {
    public static void main(String []args2) {
        Beverages beverages = new Espresso();
        beverages = new Milk(beverages);
        System.out.println(beverages.getDescription() + " for $"+beverages.cost());
    }
}
