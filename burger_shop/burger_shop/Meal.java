package burger_shop;
import java.util.ArrayList;

public class Meal {
    private double price;
    HealthBurger healthBurger;
    DeluxeBurger deluxeBurger;
    BasicBurger basicBurger;

    private ArrayList<Toppings> toppings;

    public Meal(double price) {
        this.healthBurger = getHealthBurger();
        this.basicBurger = getBasicBurger();
        this.deluxeBurger = getDeluxeBurger();
        this.price = price;
        this.toppings = new ArrayList<Toppings>();
        System.out.println("Customer has selected a burger for " + this.price);
    }

    public double getPrice() {
        return price;
    }

    public HealthBurger getHealthBurger() {
        return healthBurger;
    }

    public DeluxeBurger getDeluxeBurger() {
        return deluxeBurger;
    }

    public BasicBurger getBasicBurger() {
        return basicBurger;
    }
//    public void addMealBurger(Burger burger) {
//        if (burger.equals(getHealthBurger())) {
//            System.out.println("Customer has added the " + burger);
//        } else if (burger.equals(getBasicBurger())) {
//            System.out.println("Customer has added the " + burger);
//        } else if (burger.equals(getDeluxeBurger())) {
//            System.out.println("Customer has added the " + burger);
//        } else {
//            System.out.println("Please select a burger.");
//        }
//    }
    public void addToppings(Toppings topping) {
        if (this.toppings.size() >= 8) {
            System.out.println("Customer has reached toppings limit.");
        } else {
            System.out.println("Added " + topping + " for " + topping.getPrice());
            this.toppings.add(topping);
        }
    }

    public void addBread(Bread bread) {
        System.out.println("Added " + bread + " bun.");
    }
    public void addMeat(Meat meat) {
        System.out.println("Added " + meat + " meat.");
    }
    public void addDrink(Drink drink) {
        System.out.println("Added " + drink + " drink.");
    }
    public void addSide(Side side) {
        System.out.println("Added " + side + " side.");
    }

    public ArrayList<Toppings> getToppings() {
        for (Toppings topping : toppings) {
            System.out.println("New topping " + topping.getTopping());
        }
        return this.toppings;
    }

    public double getMealBurgerPrice(){
        System.out.println("The Meal Burger is " + this.price);
        return this.price;
    }
    public double totalMealBurgerPrice() {
        double mealBurgerPrice  = this.price;
        for(int i = 0; i < toppings.size(); i++){
            Toppings checked  = this.toppings.get(i);
            mealBurgerPrice += checked.getPrice();
        }
        System.out.println("The total for the Burger Meal is " + mealBurgerPrice);
        return mealBurgerPrice;
    }
}