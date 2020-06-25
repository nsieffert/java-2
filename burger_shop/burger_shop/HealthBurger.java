package burger_shop;

public class HealthBurger extends Burger {
    private String healthySide1Name;
    private double healthySide1Price;
    private String healthySide2Name;
    private double healthySide2Price;
    private String healthySide3Name;
    private double healthySide3Price;
    private String healthySide4Name;
    private double healthySide4Price;

    private Meat meatType;
    private Bread breadType;


    public HealthBurger(String name, double price, Bread breadType, Meat meatType) {
        super(name, price, breadType, meatType);
        this.meatType = meatType;
        this.breadType = breadType;
    }

    public Meat getMeatType() {
        return meatType;
    }

    public Bread getBreadType() {
        return breadType;
    }

    public void addHealthySide1(String name, double price) {
        if (name != "tomato") {
            System.out.println("May only select tomato");
        } else {
            this.healthySide1Name = name;
            this.healthySide1Price = price;
        }
    }
    public void addHealthySide2(String name, double price) {
        if (name != "lettuce") {
            System.out.println("May only select lettuce");
        } else {
            this.healthySide2Name = name;
            this.healthySide2Price = price;
        }
    }
    public void addHealthySide3(String name, double price) {
        if (name != "pickles") {
            System.out.println("May only select pickles");
        } else {
            this.healthySide3Name = name;
            this.healthySide3Price = price;
        }
    }
    public void addHealthySide4(String name, double price) {
        if (name != "onion") {
            System.out.println("May only select onion");
        } else {
            this.healthySide4Name = name;
            this.healthySide4Price = price;
        }
    }
    @Override
    public void addBurgerSides1(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public void addBurgerSides2(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }
    @Override
    public void addBurgerSides3(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public void addBurgerSides4(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }
    @Override
    public void addBurgerSides5(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public void addBurgerSides6(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
        if(this.healthySide1Name != null) {
            System.out.println("Customer added " + this.healthySide1Name + " for an extra " + this.healthySide1Price);
            totalPrice = totalPrice + this.healthySide1Price;
        }

        if(this.healthySide2Name != null) {
            System.out.println("Customer added " + this.healthySide2Name + " for an extra " + this.healthySide2Price);
            totalPrice = totalPrice + this.healthySide2Price;
            System.out.println("Your total for the healthy burger is " + totalPrice);
        }
        if(this.healthySide3Name != null) {
            System.out.println("Customer added " + this.healthySide3Name + " for an extra " + this.healthySide3Price);
            totalPrice = totalPrice + this.healthySide3Price;
            System.out.println("Your total for the healthy burger is " + totalPrice);
        }
        if(this.healthySide4Name != null) {
            System.out.println("Customer added " + this.healthySide4Name + " for an extra " + this.healthySide4Price);
            totalPrice = totalPrice + this.healthySide4Price;
            System.out.println("Your total for the healthy burger is " + totalPrice);
        }
        return totalPrice;
    }
}
