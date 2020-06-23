package burger_shop;

public class PlainBurger extends Burger {
    private String plainSide1Name;
    private double plainSide1Price;
    private String plainSide2Name;
    private double plainSide2Price;

    public PlainBurger(String name, String meat, double price, String bun) {
        super(name, meat, price, bun);
    }


    public void addPlainSide1(String name, double price) {
        this.plainSide1Name = name;
        this.plainSide1Price = price;
    }

    public void addPlainSide2(String name, double price) {
        this.plainSide2Name = name;
        this.plainSide2Price = price;
    }

    @Override
    public void addBurgerSides1(String name, double price) {
        System.out.println("Plain burger only comes with two sides");
    }

    @Override
    public void addBurgerSides2(String name, double price) {
        System.out.println("Plain burger only comes with two sides");
    }

    @Override
    public void addBurgerSides3(String name, double price) {
        System.out.println("Plain burger only comes with two sides");
    }

    @Override
    public void addBurgerSides4(String name, double price) {
        System.out.println("Plain burger only comes with two sides");
    }

    @Override
    public void addBurgerSides5(String name, double price) {
        System.out.println("Plain burger only comes with two sides");
    }

    @Override
    public void addBurgerSides6(String name, double price) {
        System.out.println("Plain burger only comes with two sides");
    }

    @Override
    public double itemizeBurger() {
        double totalPrice = super.itemizeBurger();
        if (this.plainSide1Name != null) {
            System.out.println("Customer added " + this.plainSide1Name + " for an extra " + this.plainSide1Price);
        }

        if (this.plainSide2Name != null) {
            System.out.println("Customer added " + this.plainSide2Name + " for an extra " + this.plainSide2Price);
            totalPrice = totalPrice + this.plainSide1Price + this.plainSide2Price;
            System.out.println("Your total for the plain burger is " + totalPrice);
        }
        return totalPrice;
    }
}
