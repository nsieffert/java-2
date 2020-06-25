package burger_shop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

//        Meat meat1 = new Meat("beef");
//        Bread bread1 = new Bread("white");
//        Burger burger = new Burger("Beefaroo ", 5, bread1, meat1);
//        double price = burger.itemizeBurger();
//        burger.addBurgerSides1("tomato", 1);
//        burger.addBurgerSides2("cheese", 1);
//        burger.addBurgerSides3("bacon", 1);
//        burger.addBurgerSides4("lettuce", 1);
//        burger.addBurgerSides5("pickles", 1);
//        burger.addBurgerSides6("onions", 1);
//        burger.itemizeBurger();
        System.out.println("+++++++++++++++++++++++");
        Meat meat2 = new Meat("chicken");
        Bread bread2 = new Bread("Wheat");
        HealthBurger healthBurger = new HealthBurger("healthy", 4.55, bread2, meat2);
        healthBurger.addHealthySide1("tomato", 1);
        healthBurger.addHealthySide2("lettuce", .50);
        healthBurger.addHealthySide3("pickles", .50);
        healthBurger.addHealthySide4("onion", .50);

        healthBurger.addBurgerSides1("tomato", 1);
        healthBurger.addBurgerSides2("hot sauce", 1);
        healthBurger.addBurgerSides3("bacon", 1);
        healthBurger.addBurgerSides4("jalapeno", 1);
        healthBurger.addBurgerSides5("pickles", 1);
        healthBurger.addBurgerSides6("onions", 1);
        healthBurger.itemizeBurger();
        System.out.println("+++++++++++++++++++++++");
        Meat meat3 = new Meat("fish");
        Bread bread3 = new Bread("Sesame");
        DeluxeBurger db = new DeluxeBurger(bread3, meat3);
        db.addBurgerSides1("cheese", 1);
        db.addBurgerSides2("bacon", 2);
        db.addBurgerSides3("dill", 1);
        db.addBurgerSides4("jalapeno", 1);
        db.addBurgerSides5("dill", 1);
        db.addBurgerSides6("lettuce", 1);
        db.itemizeBurger();
        System.out.println("+++++++++++++++++++");
        Meat meat4 = new Meat("beef");
        Bread bread4 = new Bread("rye");
        basicBurger pb = new basicBurger("Basic", 2, bread4, meat4);
        pb.addBasicSide1("tomato", 1);
        pb.addBasicSide2("lettuce", .5);
        pb. addBurgerSides1("bacon", 1);
        pb.addBurgerSides2("cheese", .5);
        pb.addBasicSide1("beans", .5);
        pb. addBurgerSides3("pickles", 1);
        pb.addBurgerSides4("onions", .5);
        pb. addBurgerSides5("jalapenos", 1);
        pb.addBurgerSides6("sauce", .5);
        pb.itemizeBurger();
    }
}
