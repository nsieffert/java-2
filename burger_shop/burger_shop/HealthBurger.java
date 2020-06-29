package burger_shop;
import java.util.ArrayList;

public class HealthBurger {
    private double price;

    private ArrayList<Toppings> toppings;
    private ArrayList<Side> sides;

    public HealthBurger(double price){
        this.price = price;
        this.toppings = new ArrayList<Toppings>();
        this.sides = new ArrayList<Side>();
        System.out.println("Customer has added a healthy Burger for " + this.price);
    }

    public void addToppings(Toppings topping) {
        if (this.toppings.size() >= 4) {
            System.out.println("Customer has reached toppings limit.");
        } else {
            if (topping.isHealthy()) {
                System.out.println("Added " + topping  + " as a topping for " + topping.getPrice());
                this.toppings.add(topping);
            } else {
                System.out.println("Can only select healthy toppings.");
            }

        }

    }

    public void addSides(Side side) {
        if (this.sides.size() >= 3) {
            System.out.println("Customer has reached the sides limit.");
        } else {
            System.out.println("Added " + side + " as a side.");
            this.sides.add(side);
        }
    }
    public ArrayList<Side> getSides() {
        for (Side side : sides) {
            System.out.println("New topping " + side.getSide());
        }
        return this.sides;
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

    public ArrayList<Toppings> getToppings(){
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("New topping " + toppings.get(i).getTopping());
        }
        return this.toppings;
    }

    public double totalHealthBurgerPrice() {
        double healthBurgerPrice  = this.price;
        for(int i = 0; i < toppings.size(); i++){
            Toppings checked  = this.toppings.get(i);
            healthBurgerPrice += checked.getPrice();
        }
        System.out.println("The total for the healthy Burger is " + healthBurgerPrice);
        return healthBurgerPrice;
    }
}


