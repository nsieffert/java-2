package burger_shop;

public class HealthBurger extends Burger {
    private String healthyTopping1Name;
    private double healthyTopping1Price;
    private String healthyTopping2Name;
    private double healthyTopping2Price;
    private String healthyTopping3Name;
    private double healthyTopping3Price;
    private String healthyTopping4Name;
    private double healthyTopping4Price;
    private Meat meatType;
    private Bread breadType;


    public HealthBurger(String name, double price, Bread breadType, Meat meatType) {
        super(breadType, meatType);
        this.meatType = meatType;
        this.breadType = breadType;
    }

    public Meat getMeatType() {
        return meatType;
    }
    public Bread getBreadType() {
        return breadType;
    }

    public void addHealthyTopping1(String name, double price) {
        if (name != "tomato") {
            System.out.println("May only select tomato");
        } else {
            this.healthyTopping1Name = name;
            this.healthyTopping1Price = price;
        }
    }
    public void addHealthyTopping2(String name, double price) {
        if (name != "lettuce") {
            System.out.println("May only select lettuce");
        } else {
            this.healthyTopping2Name = name;
            this.healthyTopping2Price = price;
        }
    }
    public void addHealthyTopping3(String name, double price) {
        if (name != "pickles") {
            System.out.println("May only select pickles");
        } else {
            this.healthyTopping3Name = name;
            this.healthyTopping3Price = price;
        }
    }
    public void addHealthyTopping4(String name, double price) {
        if (name != "onion") {
            System.out.println("May only select onion");
        } else {
            this.healthyTopping4Name = name;
            this.healthyTopping4Price = price;
        }
    }
    @Override
    public void addBurgerToppings1(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public void addBurgerToppings2(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }
    @Override
    public void addBurgerToppings3(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public void addBurgerToppings4(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }
    @Override
    public void addBurgerToppings5(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public void addBurgerToppings6(String name, double price) {
        System.out.println("Healthy burger can only have four sides total");
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
        if(this.healthyTopping1Name != null) {
            System.out.println("Customer added " + this.healthyTopping1Name + " for an extra " + this.healthyTopping1Price);
            totalPrice = totalPrice + this.healthyTopping1Price;
        }

        if(this.healthyTopping2Name != null) {
            System.out.println("Customer added " + this.healthyTopping2Name + " for an extra " + this.healthyTopping2Price);
            totalPrice = totalPrice + this.healthyTopping2Price;
            System.out.println("Your total for the healthy burger is " + totalPrice);
        }
        if(this.healthyTopping3Name != null) {
            System.out.println("Customer added " + this.healthyTopping3Name + " for an extra " + this.healthyTopping3Price);
            totalPrice = totalPrice + this.healthyTopping3Price;
            System.out.println("Your total for the healthy burger is " + totalPrice);
        }
        if(this.healthyTopping4Name != null) {
            System.out.println("Customer added " + this.healthyTopping4Name + " for an extra " + this.healthyTopping4Price);
            totalPrice = totalPrice + this.healthyTopping4Price;
            System.out.println("Your total for the healthy burger is " + totalPrice);
        }
        return totalPrice;
    }
}
