package burger_shop;
import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private double price;

    public DeluxeBurger(double price, String side, String drink) {
        super(7.99);
        this.price = price;
        System.out.println("Customer has selected the Deluxe Burger for " + this.price);
        System.out.println("Customer has also added "+ drink +", and " + side +
                ", which are complimentary with the deluxe burger.");
    }

    public void addBread(Bread bread) {
        System.out.println("Added " + bread + " bread.");
    }

    public void addMeat(Meat meat) {
        System.out.println("Added " + meat + " meat.");
    }

    public void addToppings(Toppings topping) {
        super.addToppings(topping);
    }

    public ArrayList<Toppings> getToppings() {
        return super.getToppings();
    }

    @Override
    public double totalBurgerPrice() {
        return super.totalBurgerPrice();
    }

    public double totalDeluxeBurgerPrice(){
        System.out.println("The Deluxe Burger is " + this.price);
        System.out.println("Side and drink are complimentary.");
        System.out.println("Your total for the Deluxe Burger is " + this.price);
        return this.price;
    }
}