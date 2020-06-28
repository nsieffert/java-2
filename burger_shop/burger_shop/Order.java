package burger_shop;

import java.util.ArrayList;

public class Order {
    Burger burger;
    Meat meat;
    Bread bread;
    Meal meal;
    double price;

    public Order(Burger burger, Meat meat, Bread bread) {
        this.burger = burger;
        this.meat = meat;
        this.bread = bread;
    }

    public Order(Meal meal) {
        this.meal = meal;
    }

    public Order(Meal meal, Burger burger, Meat meat, Bread bread, double price) {
        this.price = price;
        this.burger = burger;
        this.meat = meat;
        this.bread = bread;
        this.meal = meal;
    }

   // private ArrayList<MealBurger> mealBurger;
    private ArrayList<Toppings> toppings;
    private ArrayList<Drink> drink;
    private ArrayList<Side> side;

    public void addBread(Bread bread) {
        System.out.println(bread + "is added.");
    }
    public void addMeat(Meat meat) {
        System.out.println(meat + "is added.");
    }
    public void addSide(Drink drink) {
        System.out.println(drink + "is added.");
    }
    public void addSide(Side side) {
        System.out.println(side + "is added.");
    }

    public Burger getBurger() {
        return burger;
    }

    public Meat getMeat() {
        return meat;
    }

    public Bread getBread() {
        return bread;
    }

    public Meal getMeal() {
        return meal;
    }

    public double getPrice() {
        return price;
    }

//    public ArrayList<MealBurger> getMealBurger() {
//        return mealBurger;
//    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public ArrayList<Drink> getDrink() {
        return drink;
    }

    public ArrayList<Side> getSide() {
        return side;
    }


    public double getOrderPrice() {
        System.out.println("The Meal Burger is " + this.price);
        return this.price;
    }

    public double totalOrderPrice() {
        double mealBurgerPrice = this.price;
        for (int i = 0; i < toppings.size(); i++) {
            Toppings validated = this.toppings.get(i);
            mealBurgerPrice += validated.getPrice();
        }
        System.out.println("The total for the Burger Meal is " + mealBurgerPrice);
        return mealBurgerPrice;
    }
}












 //   private Burger burger;
//    private double basicBurgerPrice = 3.99;
//    private Burger HealthBurger;
//    private double healthBurgerPrice = 5.99;
//    private Burger DeluxeBurger;
//    private double DeluxeBurgerPrice = 7.99;
//    private String orderToppings1Name;
//    private double orderToppings1Price;
//    private String orderToppings2Name;
//    private double orderToppings2Price;
//    private String orderToppings3Name;
//    private double orderToppings3Price;
//    private String orderToppings4Name;
//    private double orderToppings4Price;
//    private Meal meal;
//    private Drink drink;
//    private Side side;
//
//
//    public Order(Burger burger, Drink drink, Side side) {
//        this.burger = burger;
//        this.drink = drink;
//        this.side = side;
//    }
//
//    public Order(Meal meal) {
//        this.meal = meal;
//    }
//
//    public Drink getDrinkType(String name) {
//        return drink;
//    }
//
//    public Side getSidesType(String name) {
//        return side;
//    }
//    public void addOrderToppings1(String name, double price) {
//        this.orderToppings1Name = name;
//        this.orderToppings1Price = price;
//    }
//
//    public void addOrderToppings2(String name, double price) {
//        this.orderToppings2Name = name;
//        this.orderToppings2Price = price;
//    }
//
//    public void addOrderToppings3(String name, double price) {
//        this.orderToppings3Name = name;
//        this.orderToppings3Price = price;
//    }
//
//    public void addOrderToppings4(String name, double price) {
//        this.orderToppings4Name = name;
//        this.orderToppings4Price = price;
//    }
//    public String addBurger(String burgerName) {
//        if (BasicBurger != null) {
//            System.out.println("Customer has selected the Basic Burger at a cost of " + this.basicBurgerPrice);
//        } else if (HealthBurger != null) {
//            System.out.println("Customer has selected the Health Burger at a cost of " + this.healthBurgerPrice);
//        } else if (DeluxeBurger != null) {
//            System.out.println("Customer has selected the Deluxe Burger at a cost of " + this.DeluxeBurgerPrice);
//        }
//        return burgerName;
//    }
//        public void itemizeToppingsOrder() {
//        if (this.orderToppings1Name != null) {
//            System.out.println("Customer added " + this.orderToppings1Name + " for an extra " + this.orderToppings1Price);
//        }
//        if (this.orderToppings2Name != null) {
//            System.out.println("Customer added " + this.orderToppings2Name + " for an extra " + this.orderToppings2Price);
//        }
//        if (this.orderToppings3Name != null) {
//            System.out.println("Customer added " + this.orderToppings3Name + " for an extra " + this.orderToppings3Price);
//        }
//        if (this.orderToppings4Name != null) {
//            System.out.println("Customer added " + this.orderToppings4Name + " for an extra " + this.orderToppings4Price);
//        }
//        if (drink != null) {
//            System.out.println("Customer added " + drink + " at no extra charge");
//        }
//        if (side != null) {
//            System.out.println("Customer added " + side + " at no extra charge");
//        }
//    }
//    public String addDrinks(String drinkType) {
//        System.out.println("Customer added " + drinkType + " for no extra charge. Thank you!");
//        return drinkType;
//    }
//
//    public String addSides(String sidesType) {
//        System.out.println("Customer added " + sidesType + " for no extra charge. Thank you!");
//        return sidesType;
//    }
//        public double totalBurgerOrder() {
//            double totalOrderPrice = 0;
//            totalOrderPrice = this.DeluxeBurgerPrice + this.healthBurgerPrice + this.basicBurgerPrice + this.orderToppings1Price + this.orderToppings2Price + this.orderToppings3Price +
//                    this.orderToppings4Price;
//            System.out.println("Your total is " + totalOrderPrice);
//            return totalOrderPrice;
