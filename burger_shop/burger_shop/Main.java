package burger_shop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Bread breadOrder = new Bread("white");
        Bread breadOrder1 = new Bread("Sesame");
        Meat meatOrder = new Meat("Steak");
        Meat meatOrder1 = new Meat("Fish");
        Bread breadOrder2 = new Bread("Rye");
        Meat meatOrder2 = new Meat("Pork");
        Bread breadOrder3 = new Bread("whole wheat");
        Meat meatOrder3 = new Meat("Turkey");
        Side sides = new Side("frenchFries", 1);
        Drinks drink = new Drinks("Squirt", 2);
        Meal meal = new Meal(meatOrder2, breadOrder2, sides, drink);
        //++++++++++++++++++++++++++++++

        Order order  = new Order(null);
        order.addBurger("basic Burger");
        order.addOrderToppings1("tomatoes", 1);
        order.addOrderToppings2("cheese", 1);
        order.addDrinks("Dr. Pepper");
        order.addSides("Chips");
        order.itemizeBasicBurgerOrder();
        System.out.println("++++++++++++++++++++++++");
        Order order1 = new Order(null);
        order1.addBurger("Healthy Burger");
        order1.addOrderToppings2("lettuce", .55);
        order1.addOrderToppings1("peppers", .75);
        order1.addOrderToppings3("pickles", .5);
        order1.addOrderToppings4("bacon", 1);
        order1.addDrinks("Cherry Cola");
        order1.addSides("Yogurt");
        order1.itemizeHealthBurgerOrder();
          System.out.println("++++++++++++++++++++++++");

        Order order3  = new Order(null);
        order3.addBurger("Deluxe Burger");
        order3.addOrderToppings1("cherry tomatoes", 1);
        order3.addOrderToppings2("special sauce", 1);
        order3.addDrinks("Sprite");
        order3.addSides("Curly Fries");
        order3.itemizeDeluxeOrder();
        System.out.println("++++++++++++++++++++++++");

        Order order4  = new Order(meal);
        order4.addBurger("basic Burger");
        order4.addOrderToppings1("tomatoes", 1);
        order4.addOrderToppings2("cheese", 1);
        order4.addDrinks("Dr. Pepper");
        order4.addSides("Chips");
        order4.itemizeBasicBurgerOrder();
        System.out.println("++++++++++++++++++++++++");
//        Meat meat5 = new Meat("double beef");
//        Side side5 = new Side("french fries");
//        Drinks drink5 = new Drinks("coke");
//        Bread bread5 = new Bread("Sesame");
//        Meal meal = new Meal(side5, drink5, meat5, bread5);
//        meal.itemizeBurgerMeal();
//        System.out.println("++++++++++++++++++++++++++++++");
//        Meat meat1 = new Meat("beef");
//        Bread bread1 = new Bread("white");
//        Burger burger = new Burger("Beefaroo ", 5, bread1, meat1);
//        double price = burger.itemizeBurger();
//        burger.addBurgerToppings1("cheese", 1);
//        burger.addBurgerToppings2("bacon", 1);
//        burger.addBurgerToppings3("jalapeno", 1);
//        burger.addBurgerToppings4("olive", 1);
//        burger.addBurgerToppings5("tomato", 1);
//        burger.addBurgerToppings6("onion", 1);
//        burger.itemizeBurger();
//        System.out.println("+++++++++++++++++++++++");
//        Meat meat2 = new Meat("chicken");
//        Bread bread2 = new Bread("Wheat");
//        HealthBurger healthBurger = new HealthBurger("healthy", 4.55, bread2, meat2);
//        healthBurger.addHealthyTopping1("tomato", 1);
//        healthBurger.addHealthyTopping2("lettuce", .50);
//        healthBurger.addHealthyTopping3("pickles", .50);
//        healthBurger.addHealthyTopping4("onion", .50);
//        healthBurger.addBurgerToppings1("tomato", 1);
//        healthBurger.addBurgerToppings2("hot sauce", 1);
//        healthBurger.addBurgerToppings3("bacon", 1);
//        healthBurger.addBurgerToppings4("jalapeno", 1);
//        healthBurger.addBurgerToppings5("pickles", 1);
//        healthBurger.addBurgerToppings6("onions", 1);
//        healthBurger.itemizeBurger();
//        System.out.println("+++++++++++++++++++++++");
//        Meat meat3 = new Meat("fish");
//        Bread bread3 = new Bread("Sesame");
//        DeluxeBurger db = new DeluxeBurger(bread3, meat3);
//        db.addBurgerToppings1("cheese", 1);
//        db.addBurgerToppings2("bacon", 2);
//        db.addBurgerToppings3("dill", 1);
//        db.addBurgerToppings4("jalapeno", 1);
//        db.addBurgerToppings5("dill", 1);
//        db.addBurgerToppings6("lettuce", 1);
//        db.itemizeBurger();
//        System.out.println("+++++++++++++++++++");
//        Meat meat4 = new Meat("beef");
//        Bread bread4 = new Bread("rye");
//        basicBurger pb = new basicBurger("Basic", 2, bread4, meat4);
//        pb.addBasicTopping1("tomato", 1);
//        pb.addBasicTopping2("lettuce", .5);
//        pb.addBurgerToppings1("bacon", 1);
//        pb.addBurgerToppings2("cheese", .5);
//        pb.addBasicTopping1("beans", .5);
//        pb.addBurgerToppings3("pickles", 1);
//        pb.addBurgerToppings4("onions", .5);
//        pb.addBurgerToppings5("jalapenos", 1);
//        pb.addBurgerToppings6("sauce", .5);
//        pb.itemizeBurger();
    }
}
