package burger_shop;

public class Main {

    public static void main(String[] args) {

        System.out.println("++++Regular Burger Test++++++++++");
        Burger burger = new Burger(6.99);
        burger.addRegularBurgerNote();
        burger.addBread(Bread.WHITE);
        burger.addMeat(Meat.STEAK);
        burger.addSide(Side.YOGURT);
        burger.addDrink(Drink.DRPEPPER);
        burger.addToppings(Toppings.LETTUCE);
        burger.addToppings(Toppings.SPINACH);
        burger.totalBurgerPrice();
        System.out.println("++++++End Regular Burger Test+++++++");

        System.out.println("+++++Deluxe Burger Test Start++++++++++");
      //Deluxe Burger Test - no toppings, side and drink automatic;
       DeluxeBurger deluxe = new DeluxeBurger(7.99, "Fries", "Coke");
       deluxe.addBread(Bread.SESAME);
       deluxe.addMeat(Meat.CHICKEN);
       deluxe.addToppings(Toppings.TOMATOES);
        deluxe.totalDeluxePrice();
        System.out.println("++++Deluxe Burger Test End+++++++");

        System.out.println("++++++++Healthy Burger Test Start+++++++++");
       // healthy burger test - 4 toppings, only healthy, get price:
        HealthBurger health = new HealthBurger(8.99);
        health.addBread(Bread.WHEAT);
        health.addSide(Side.YOGURT);
        health.addDrink(Drink.FANTA);
        health.addToppings(Toppings.LETTUCE);
        health.addToppings(Toppings.ONIONS);
        health.addToppings(Toppings.JALAPENOS);
        health.addToppings(Toppings.KETCHUP);
        health.addToppings(Toppings.BACON);
        health.addToppings(Toppings.CHEESE);
        health.totalHealthBurgerPrice();
        System.out.println("+++++Healthy Burger test end++++++++");

        System.out.println("+++++++Basic Burger Test Start+++++++++++++");
       // basic burger test  - only allow 2 toppings, add sides, drink, total price. Testing and working.
        BasicBurger basic = new BasicBurger(3.99);
        basic.addToppings(Toppings.MAYO);
        basic.addToppings(Toppings.CHEESE);
        basic.addToppings(Toppings.LETTUCE);
        basic.addSide(Side.APPLE);
        basic.addBread(Bread.WHITE);
        basic.addMeat(Meat.STEAK);
        basic.addSide(Side.FRIES);
        basic.addDrink(Drink.SPRITE);
        basic.totalBasicBurgerPrice();
        System.out.println("+++++++++Basic Burger Test End+++++++++++++++");

        System.out.println("+++++++Meal test Start+++++++++");
        //Meal test - select burger, sides, drink, toppings, totals up price correctly.
        DeluxeBurger deluxe1 = new DeluxeBurger(8.99, "Fries", "Coke");
        Meal meal = new Meal(deluxe1, 8.99);
        meal.getDeluxeBurger().addBread(Bread.RYE);
        meal.getDeluxeBurger().addMeat(Meat.CHICKEN);
        meal.getDeluxeBurger().addToppings(Toppings.MAYO);
        meal.getDeluxeBurger().addToppings(Toppings.CHEESE);
        meal.getDeluxeBurger().addToppings(Toppings.PICKLES);
        meal.getDeluxeBurger().addToppings(Toppings.ONIONS);
        meal.getDeluxeBurger().addToppings(Toppings.MUSTARD);
        meal.getDeluxeBurger().addToppings(Toppings.JALAPENOS);
        meal.getDeluxeBurger().addToppings(Toppings.TOMATOES);
        meal.getDeluxeBurger().addToppings(Toppings.SPINACH);
        meal.getDeluxeBurger().totalDeluxePrice();
        System.out.println("++++++++++Meal Test End++++++++++++");

        System.out.println("+++++++Order basic burger Test Start++++++++++++++++");
        BasicBurger basic1 = new BasicBurger(4.99);
        Meal meal1 = new Meal(basic1, 4.99);
        Order order = new Order(meal1, 4.99);
        order.getMeal().getBasicBurger().addDrink(Drink.getDRPEPPER());
        order.getMeal().getBasicBurger().addMeat(Meat.getSTEAK());
        order.getMeal().getBasicBurger().addToppings(Toppings.CHEESE);
        order.getMeal().getBasicBurger().addToppings(Toppings.PICKLES);
        order.getMeal().getBasicBurger().addToppings(Toppings.BACON);
        order.getMeal().getBasicBurger().totalBasicBurgerPrice();
        System.out.println("++++++++Order basic burger Test End++++++++++++++++");

        System.out.println("+++++++Order Health burger Test Start++++++++++++++++");
        HealthBurger health1 = new HealthBurger(6.99);
        Meal meal2 = new Meal(health1, 6.99);
        Order order2 = new Order(meal2, 6.99);
        order2.getMeal().getHealthBurger().addSide(Side.YOGURT);
        order2.getMeal().getHealthBurger().addDrink(Drink.DIETCOKE);
        order2.getMeal().getHealthBurger().addMeat(Meat.STEAK);
        order2.getMeal().getHealthBurger().addToppings(Toppings.CHEESE);
        order2.getMeal().getHealthBurger().addToppings(Toppings.PICKLES);
        order2.getMeal().getHealthBurger().addToppings(Toppings.BACON);
        order2.getMeal().getHealthBurger().totalHealthBurgerPrice();
        System.out.println("++++++++Order health burger Test End++++++++++++++++");

        System.out.println("+++++++Order deluxe burger Test Start++++++++++++++++");
        DeluxeBurger deluxe2 = new DeluxeBurger(8.99, "Fries", "Coke");
        Meal meal3 = new Meal(deluxe2, 8.99);
        Order order3 = new Order(meal3, 8.99);
        order3.getMeal().getDeluxeBurger().addSide(Side.YOGURT);
        order3.getMeal().getDeluxeBurger().addDrink(Drink.DIETCOKE);
        order3.getMeal().getDeluxeBurger().addMeat(Meat.STEAK);
        order3.getMeal().getDeluxeBurger().addToppings(Toppings.CHEESE);
        order3.getMeal().getDeluxeBurger().addToppings(Toppings.PICKLES);
        order3.getMeal().getDeluxeBurger().addToppings(Toppings.BACON);
        order3.getMeal().getDeluxeBurger().totalDeluxePrice();
        System.out.println("++++++++Order deluxe burger Test End++++++++++++++++");
    }
}
