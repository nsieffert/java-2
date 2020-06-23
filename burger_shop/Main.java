package burger_shop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Burger burger = new Burger("Beefaroo", "double beef", 3, "plain");
        double price = burger.itemizeBurger();
        burger.addBurgerSides1("tomato", 1);
        burger.addBurgerSides2("cheese", 1);
        burger.addBurgerSides3("bacon", 1);
        burger.addBurgerSides4("lettuce", 1);
        burger.itemizeBurger();
        System.out.println("+++++++++++++++++");
        HealthBurger healthBurger = new HealthBurger("chicken", 3.50);
        healthBurger.addHealthySide1("cheese", 1);
        healthBurger.addHealthySide2("lettuce", 1);
        healthBurger.itemizeBurger();
        System.out.println("+++++++++++++++++++++++");
        DeluxeBurger db = new DeluxeBurger();
        db.addBurgerSides3("cheese", 1);
        db.addBurgerSides4("bacon", 2);
        db.itemizeBurger();
        System.out.println("+++++++++++++++++++");
        PlainBurger pb = new PlainBurger("Plain", "chicken", 2, "white");
        pb.addPlainSide1("tomato", 1);
        pb.addPlainSide2("lettuce", .5);
        pb. addBurgerSides4("bacon", 1);
        pb.addBurgerSides5("cheese", .5);
        pb.itemizeBurger();
    }
}
