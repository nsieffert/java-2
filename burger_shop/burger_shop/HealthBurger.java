package burger_shop;

public class HealthBurger extends Burger {
    private String healthySide1Name;
    private double healthySide1Price;
    private String healthySide2Name;
    private double healthySide2Price;

    public HealthBurger(String meat, double price) {
        super("Healthy", meat, price, "Wheat");

    }
    public void addHealthySide1(String name, double price){
        this.healthySide1Name = name;
        this.healthySide1Price = price;
    }
    public void addHealthySide2(String name, double price){
        this.healthySide2Name = name;
        this.healthySide2Price = price;
    }

    @Override
    public void addBurgerSides5(String name, double price) {
        System.out.println("Healthy burger can only have 6 sides total");
    }

    @Override
    public void addBurgerSides6(String name, double price) {
        System.out.println("Healthy burger can only have 6 sides total");
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
        return totalPrice;
    }
}
