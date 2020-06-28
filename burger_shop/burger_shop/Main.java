package burger_shop;

public class Main {

    public static void main(String[] args) {

//        System.out.println("++++Regular Burger Test++++++++++");
//        Burger burger = new Burger(6.99);
//        burger.addBread(Bread.WHITE);
//        burger.addMeat(Meat.STEAK);
//        burger.addSide(Side.YOGURT);
//        burger.addDrink(Drink.DRPEPPER);
//        burger.addToppings(Toppings.LETTUCE);
//                burger.addToppings(Toppings.SPINACH);
//        burger.totalBurgerPrice();
//        System.out.println("++++++End Regular Burger Test+++++++");

//        System.out.println("+++++Deluxe Burger Test Start++++++++++");
////      Deluxe Burger Test - no toppings, side and drink automatic;
//       DeluxeBurger deluxe = new DeluxeBurger(7.99, "Fries", "Coke");
//       deluxe.addBread(Bread.SESAME);
//       deluxe.addMeat(Meat.CHICKEN);
//       deluxe.addToppings(Toppings.TOMATOES);
//        deluxe.totalDeluxeBurgerPrice();
//        System.out.println("++++Deluxe Burger Test End+++++++");

        //System.out.println("++++++++Healthy Burger Test Start+++++++++");
        //healthy burger test - 4 toppings, only healthy, get price:
//        Meat meat = new Meat("Chicken");
//        Bread bread = new Bread("Wheat");
//        Side side = new Side("Fries");
//        Drink drink = new Drink("Coke");
//        HealthBurger health = new HealthBurger(8.99);
//        health.addBread(Bread.WHEAT);
//        health.addSide(Side.YOGURT);
//        health.addDrink(Drink.FANTA);
//        health.addToppings(Toppings.LETTUCE);
//        health.addToppings(Toppings.TOMATOES);
//        health.addToppings(Toppings.BACON);
//        health.addToppings(Toppings.CHEESE);
//        health.totalHealthBurgerPrice();
//        System.out.println("+++++Healthy Burger test end++++++++");

//        System.out.println("+++++++Basic Burger Test Start+++++++++++++");
//        //basic burger test  - only allow 2 toppings, add sides, drink, total price. Testing and working.
//        BasicBurger basic = new BasicBurger(3.99);
//        basic.addToppings(Toppings.MAYO);
//        basic.addToppings(Toppings.CHEESE);
//        basic.addToppings(Toppings.LETTUCE);
//        basic.addSide(Side.APPLE);
//        basic.addBread(Bread.WHITE);
//        basic.addMeat(Meat.STEAK);
//        basic.addSide(Side.FRIES);
//        basic.addDrink(Drink.SPRITE);
//        basic.totalBasicBurgerPrice();
//        System.out.println("+++++++++Basic Burger Test End+++++++++++++++");

        System.out.println("+++++++Meal test Start+++++++++");
        //Meal test - select burger, sides, drink, toppings, totals up price correctly.
        HealthBurger health = new HealthBurger(7.99);
        Meal meal = new Meal(7.99);
        //meal.HealthBurger();
        //meal.getHealthBurger();
        //meal.getHealthBurger().addHealthBurger(7.99);
        //meal.healthBurger.addHealthBurger(7.99);
        meal.addToppings(Toppings.KETCHUP);
         meal.addToppings(Toppings.JALAPENOS);
        meal.addToppings(Toppings.MAYO);
        meal.addToppings(Toppings.TOMATOES);
        meal.addToppings(Toppings.LETTUCE);
        meal.addToppings(Toppings.BACON);
        meal.addToppings(Toppings.MUSTARD);
        meal.addToppings(Toppings.ONIONS);
        meal.addToppings(Toppings.SPINACH);
   meal.addBread(Bread.RYE);
   meal.addMeat(Meat.CHICKEN);
   meal.addSide(Side.FRIES);
   meal.addDrink(Drink.FANTA);
    meal.totalMealBurgerPrice();
        System.out.println("++++++++++Meal Test End++++++++++++");

    }
}
