package burger_shop;
import java.util.ArrayList;

public class BasicBurger extends Burger {
    private double price;

    private ArrayList<Toppings> toppings;

    public BasicBurger(double price) {
        super(price);
        this.price = price;
        this.toppings = new ArrayList<Toppings>();
        System.out.println("Customer has selected the basic burger for " + this.price);
    }

    public void addToppings(Toppings topping) {
        if (this.toppings.size() >= 2) {
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
        public double BasicBurgerPrice(){
            System.out.println("The Basic Burger is " + this.price);
            return this.price;
        }

    public void addBread(Bread bread) {
        System.out.println("Added " + bread + " bun.");
    }
    public void addMeat(Meat meat) {
        System.out.println("Added " + meat + " meat.");
    }
    public void addSide(Side side) {
        System.out.println("Added " + side + " side.");
    }
    public void addDrink(Drink drink) {
        System.out.println("Added " + drink + " drink.");
    }


    public double totalBasicBurgerPrice() {
        double basicBurgerPrice  = this.price;
        for(int i = 0; i < toppings.size(); i++){
            Toppings checked  = this.toppings.get(i);
            basicBurgerPrice += checked.getPrice();
        }
            System.out.println("The total for the basic Burger is " + basicBurgerPrice);
            return basicBurgerPrice;
        }
}