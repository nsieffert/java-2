package burger_shop;

import java.util.ArrayList;

public class Burger {
    private double price;

    private ArrayList<Toppings> toppings;

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
        System.out.println("Customer has ordered a burger for " + this.price);
    }

   public void addToppings(Toppings topping) {
        if(this.toppings.size() >=8) {
            System.out.println("Customer has reached toppings limit.");
           } else {
               System.out.println("Added " + topping);
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




















//    private String burger;
//    private double price;
//    private String toppings1Name;
//    private double toppings1Price;
//    private String toppings2Name;
//    private double toppings2Price;
//    private String toppings3Name;
//    private double toppings3Price;
//    private String toppings4Name;
//    private double toppings4Price;
//    private String toppings5Name;
//    private double toppings5Price;
//    private String toppings6Name;
//    private double toppings6Price;
//    private Meat meat;
//    private Bread bread;
//
//    public Burger(Bread bread, Meat meat, double price) {
//        this.price = price = 2.99;
//        this.bread = bread;
//        this.meat = meat;
//    }
//
//    public Meat getMeat() {
//        return meat;
//    }
//    public Bread getBread() {
//        return bread;
//    }
//
//    public void addBurgerToppings1(String name, double price) {
//        this.toppings1Name = name;
//        this.toppings1Price = price;
//    }
//
//    public void addBurgerToppings2(String name, double price) {
//        this.toppings2Name = name;
//        this.toppings2Price = price;
//    }
//
//    public void addBurgerToppings3(String name, double price) {
//        this.toppings3Name = name;
//        this.toppings3Price = price;
//    }
//
//    public void addBurgerToppings4(String name, double price) {
//        this.toppings4Name = name;
//        this.toppings4Price = price;
//    }
//
//    public void addBurgerToppings5(String name, double price) {
//        this.toppings5Name = name;
//        this.toppings5Price = price;
//    }
//
//    public void addBurgerToppings6(String name, double price) {
//        this.toppings6Name = name;
//        this.toppings6Price = price;
//    }
//
//    public double itemizeBurger() {
//        if (this.toppings1Name != null) {
//            System.out.println("Customer ordered a burger for " + this.price);
//            System.out.println("Customer added " + this.toppings1Name + " for an extra " + this.toppings1Price);
//        }
//        if (this.toppings2Name != null) {
//            System.out.println("Customer added " + this.toppings2Name + " for an extra " + this.toppings2Price);
//        }
//        if (this.toppings3Name != null) {
//            System.out.println("Customer added " + this.toppings3Name + " for an extra " + this.toppings3Price);
//        }
//        if (this.toppings4Name != null) {
//            System.out.println("Customer added " + this.toppings4Name + " for an extra " + this.toppings4Price);
//        }
//        if (this.toppings5Name != null) {
//            System.out.println("Customer added " + this.toppings5Name + " for an extra " + this.toppings5Price);
//        }
//        if (this.toppings6Name != null) {
//            System.out.println("Customer added " + this.toppings6Name + " for an extra " + this.toppings6Price);
//        }
//        return 0;
//    }
//        public double burgerTotalPrice() {
//            double totalPrice = 0;
//            totalPrice = this.price + this.toppings1Price + this.toppings2Price + this.toppings3Price +
//                    this.toppings4Price + this.toppings5Price + this.toppings6Price;
//            System.out.println("Your total is " + totalPrice);
//            return totalPrice;
//        }
//}
//
