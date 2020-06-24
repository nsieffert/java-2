package burger_shop;

public class Burger {
    private String name;
    private String meat;
    private double price;
    private String bun;
    private String sides1Name;
    private double sides1Price;
    private String sides2Name;
    private double sides2Price;
    private String sides3Name;
    private double sides3Price;
    private String sides4Name;
    private double sides4Price;
    private String sides5Name;
    private double sides5Price;
    private String sides6Name;
    private double sides6Price;

    public Burger(String name, String meat, double price, String bun) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bun = bun;
    }
    public void addBurgerSides1(String name, double price){
        this.sides1Name = name;
        this.sides1Price = price;
    }

    public void addBurgerSides2(String name, double price){
        this.sides2Name = name;
        this.sides2Price = price;
    }

    public void addBurgerSides3(String name, double price){
        this.sides3Name = name;
        this.sides3Price = price;
    }

    public void addBurgerSides4(String name, double price){
        this.sides4Name = name;
        this.sides4Price = price;
    }

    public void addBurgerSides5(String name, double price){
        this.sides5Name = name;
        this.sides5Price = price;
    }

    public void addBurgerSides6(String name, double price){
        this.sides6Name = name;
        this.sides6Price = price;
    }

    public double itemizeBurger() {
        double totalPrice = 0;
        System.out.println(this.name + "burger using " + this.meat + " on a " + this.bun + " bun: the price is " + this.price);
        if(this.sides1Name != null) {
            System.out.println("Customer added " + this.sides1Name + " for an extra " + this.sides1Price);
    }
        if(this.sides2Name != null) {
            System.out.println("Customer added " + this.sides2Name + " for an extra " + this.sides2Price);
        }
        if(this.sides3Name != null) {
            System.out.println("Customer added " + this.sides3Name + " for an extra " + this.sides3Price);
        }
        if(this.sides4Name != null) {
            System.out.println("Customer added " + this.sides4Name + " for an extra " + this.sides4Price);
        }
        if(this.sides5Name != null) {
            System.out.println("Customer added " + this.sides5Name + " for an extra " + this.sides5Price);
        }
        if(this.sides6Name != null) {
            System.out.println("Customer added " + this.sides6Name + " for an extra " + this.sides6Price);
        }

        totalPrice = this.price + this.sides1Price + this.sides2Price + this.sides3Price + this.sides4Price + this.sides5Price + this.sides6Price ;
        System.out.println("Your total is " + totalPrice);
        return totalPrice;


    }

}
