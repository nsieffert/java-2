package burger_shop;

public class BasicBurger extends Burger {
    private String name;
    private String basicTopping1Name;
    private double basicTopping1Price;
    private String basicTopping2Name;
    private double basicTopping2Price;
    private Meat meatType;
    private Bread breadType;

    public BasicBurger(String name, double price, Bread breadType, Meat meatType) {
        super(breadType, meatType);
        this.name = "Basic Burger";
        this.meatType = meatType;
        this.breadType = breadType;
    }

    public Meat getMeatType() {
        return meatType;
    }

    public Bread getBreadType() {
        return breadType;
    }

    @Override
    public String toString() {
        return String.format(name);
    }

    public void addBasicTopping1(String name, double price) {
        this.basicTopping1Name = name;
        this.basicTopping1Price = price;
    }

    public void addBasicTopping2(String name, double price) {
        this.basicTopping2Name = name;
        this.basicTopping2Price = price;
    }

    @Override
    public void addBurgerToppings1(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerToppings2(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }
    @Override
    public void addBurgerToppings3(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerToppings4(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerToppings5(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerToppings6(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
        if (this.basicTopping1Name != null) {
            System.out.println("Customer added " + this.basicTopping1Name + " for an extra " + this.basicTopping1Price);
        }

        if (this.basicTopping2Name != null) {
            System.out.println("Customer added " + this.basicTopping2Name + " for an extra " + this.basicTopping2Price);
            totalPrice = totalPrice + this.basicTopping1Price + this.basicTopping2Price;
            System.out.println("Your total for the basic burger is " + totalPrice);
        }
        return totalPrice;
    }
}
