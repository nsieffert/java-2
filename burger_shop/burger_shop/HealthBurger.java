package burger_shop;
import java.util.ArrayList;

public class HealthBurger {
    private double price;

    private ArrayList<Toppings> toppings;


    public HealthBurger(double price){
        this.price = price;
        this.toppings = new ArrayList<Toppings>();
    }
    public void addHealthBurger(double price) {
        System.out.println("Added Healthy Burger for " + this.price);
        }

    public void addToppings(Toppings topping) {
        if (this.toppings.size() >= 4) {
            System.out.println("Customer has reached toppings limit.");
        } else {
            if (topping.isHealthy()) {
                System.out.println("Added " + topping  + " as a topping.");
                this.toppings.add(topping);
            } else {
                System.out.println("Can only select healthy toppings.");
            }

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

    public ArrayList<Toppings> getToppings(){
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("New topping " + toppings.get(i).getTopping());
        }
        return this.toppings;
    }
    public double HealthBurgerPrice(){
        System.out.println("The healthy Burger is " + this.price);
        return this.price;
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


