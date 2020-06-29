package burger_shop;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Burger {
    private double price;
    private ArrayList<Toppings> toppings;

    public void addRegularBurgerNote(){
        System.out.println("Customer has selected the regular burger for " + this.price);
    }

    public void addSide(Side side) {System.out.println("Added " + side + " side.");}
    public void addMeat(Meat meat) {
        System.out.println("Added " + meat + " meat.");
    }
    public void addDrink(Drink drink) {
        System.out.println("Added " + drink + " drink.");
    }
    public void addBread(Bread bread) {
        System.out.println("Added " + bread + " bun.");
    }

    public Burger(double price){
        this.price = price;
        this.toppings = new ArrayList<Toppings>();
    }

   public void addToppings(Toppings topping) {
        if(this.toppings.size() >=8) {
            System.out.println("Customer has reached toppings limit.");
           } else {
               System.out.println("Added " + topping + " for " + topping.getPrice());
               this.toppings.add(topping);
           }
       }
       public ArrayList<Toppings> getToppings() {
           for (int i = 0; i < toppings.size(); i++) {
               System.out.println("New topping " + toppings.get(i).getTopping());
           }
           return this.toppings;
       }
       public double totalBurgerPrice() {
           double burgerPrice  = this.price;
           for(int i = 0; i < toppings.size(); i++){
               Toppings checked  = this.toppings.get(i);
               burgerPrice += checked.getPrice();
           }
           System.out.println("The total for the regular burger is " + burgerPrice);
           return burgerPrice;
       }
   }
