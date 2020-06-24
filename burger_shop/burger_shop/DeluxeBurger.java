package burger_shop;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe", "Double Beef with Bacon", 6.50, "Sesame Seed");
        super.addBurgerSides5("Chips", 1);
        super.addBurgerSides6("Drink", 1);
    }
    @Override
    public void addBurgerSides1(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides2(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides3(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides4(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides5(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides6(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }
    }

