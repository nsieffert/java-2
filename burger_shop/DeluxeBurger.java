package burger_shop;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe", "Double Beef with Bacon", 6.50, "Sesame Seed");
        super.addBurgerSides5("Chips", 1);
        super.addBurgerSides6("Drink", 1);
    }
}
