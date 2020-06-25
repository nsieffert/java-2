package burger_shop;

public class basicBurger extends Burger {
    private String basicSide1Name;
    private double basicSide1Price;
    private String basicSide2Name;
    private double basicSide2Price;
    private Meat meatType;
    private Bread breadType;

    public basicBurger(String name, double price, Bread breadType, Meat meatType) {
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

    public void addBasicSide1(String name, double price) {
        this.basicSide1Name = name;
        this.basicSide1Price = price;
    }

    public void addBasicSide2(String name, double price) {
        this.basicSide2Name = name;
        this.basicSide2Price = price;
    }

    @Override
    public void addBurgerSides1(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerSides2(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }
    @Override
    public void addBurgerSides3(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerSides4(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerSides5(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public void addBurgerSides6(String name, double price) {
        System.out.println("the basic burger only comes with two sides total");
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
        if (this.basicSide1Name != null) {
            System.out.println("Customer added " + this.basicSide1Name + " for an extra " + this.basicSide1Price);
        }

        if (this.basicSide2Name != null) {
            System.out.println("Customer added " + this.basicSide2Name + " for an extra " + this.basicSide2Price);
            totalPrice = totalPrice + this.basicSide1Price + this.basicSide2Price;
            System.out.println("Your total for the basic burger is " + totalPrice);
        }
        return totalPrice;
    }
}
