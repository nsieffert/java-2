package burger_shop;
import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private double price;
    private String freeSide;
    private String freeDrink;


    private ArrayList<Toppings> toppings;

    public DeluxeBurger(double price, String freeSide, String freeDrink) {
        super(price);
        this.price = price;
        this.toppings = new ArrayList<Toppings>();
        this.freeSide = freeSide;
        this.freeDrink = freeDrink;
        System.out.println("Customer has added a Deluxe Burger for " + this.price + ", with side and drink included.");
    }
    public void addToppings(Toppings topping) {
        if (this.toppings.size() >= 6) {
            System.out.println("Customer has reached toppings limit.");
        } else {
            System.out.println("Added " + topping + " as a topping for " + topping.getPrice());
            this.toppings.add(topping);
        }
    }
    public ArrayList<Toppings> getToppings() {
        for (Toppings topping : toppings) {
            System.out.println("New topping " + topping.getTopping());
        }
        return this.toppings;
    }

    public void addBread(Bread bread) {
        System.out.println("Added " + bread + " bun.");
    }
    public void addMeat(Meat meat) {
        System.out.println("Added " + meat + " meat.");
    }

    public double totalDeluxePrice() {
        double deluxeBurgerPrice  = this.price;
        for(int i = 0; i < toppings.size(); i++){
            Toppings checked  = this.toppings.get(i);
            deluxeBurgerPrice += checked.getPrice();
        }
        System.out.println("The total for the Deluxe Burger is " + deluxeBurgerPrice);
        return deluxeBurgerPrice;
    }
}