package burger_shop;

public class Burger {
    private String name;
    private double price;
    private String toppings1Name;
    private double toppings1Price;
    private String toppings2Name;
    private double toppings2Price;
    private String toppings3Name;
    private double toppings3Price;
    private String toppings4Name;
    private double toppings4Price;
    private String toppings5Name;
    private double toppings5Price;
    private String toppings6Name;
    private double toppings6Price;
    private Meat meatType;
    private Bread breadType;

    public Burger(Bread breadType, Meat meatType) {
        this.name = name;
        this.price = price;
        this.breadType = breadType;
        this.meatType = meatType;
    }

    public Meat getMeatType() {
        return meatType;
    }
    public Bread getBreadType() {
        return breadType;
    }

    public void addBurgerToppings1(String name, double price){
        this.toppings1Name = name;
        this.toppings1Price = price;
    }

    public void addBurgerToppings2(String name, double price){
        this.toppings2Name = name;
        this.toppings2Price = price;
    }

    public void addBurgerToppings3(String name, double price){
        this.toppings3Name = name;
        this.toppings3Price = price;
    }

    public void addBurgerToppings4(String name, double price){
        this.toppings4Name = name;
        this.toppings4Price = price;
    }

    public void addBurgerToppings5(String name, double price){
        this.toppings5Name = name;
        this.toppings5Price = price;
    }

    public void addBurgerToppings6(String name, double price){
        this.toppings6Name = name;
        this.toppings6Price = price;
    }

    public double itemizeBurger() {
        double totalPrice = 0;
        System.out.println(this.name + "burger using " + meatType + " on a " + breadType + " bun: the price is " + this.price);
        if(this.toppings1Name != null) {
            System.out.println("Customer added " + this.toppings1Name + " for an extra " + this.toppings1Price);
    }
        if(this.toppings2Name != null) {
            System.out.println("Customer added " + this.toppings2Name + " for an extra " + this.toppings2Price);
        }
        if(this.toppings3Name != null) {
            System.out.println("Customer added " + this.toppings3Name + " for an extra " + this.toppings3Price);
        }
        if(this.toppings4Name != null) {
            System.out.println("Customer added " + this.toppings4Name + " for an extra " + this.toppings4Price);
        }
        if(this.toppings5Name != null) {
            System.out.println("Customer added " + this.toppings5Name + " for an extra " + this.toppings5Price);
        }
        if(this.toppings6Name != null) {
            System.out.println("Customer added " + this.toppings6Name + " for an extra " + this.toppings6Price);
        }


        totalPrice = this.price + this.toppings1Price + this.toppings2Price + this.toppings3Price +
                this.toppings4Price + this.toppings5Price + this.toppings6Price;

        System.out.println("Your total is " + totalPrice);
        return totalPrice;


    }

}
