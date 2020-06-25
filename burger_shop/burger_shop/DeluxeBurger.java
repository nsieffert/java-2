package burger_shop;

public class DeluxeBurger extends Burger {
    private Meat meatType;
    private Bread breadType;

    public DeluxeBurger(Bread breadType, Meat meatType) {
        super("Deluxe", 6.55, breadType, meatType);
        super.addBurgerSides5("Chips", 1);
        super.addBurgerSides6("Drink", 1);
        this.meatType = meatType;


    }
    public Meat getMeatType() {
        return meatType;
    }

    public Bread getBreadType() {
        return breadType;
    }

    @Override
    public void addBurgerSides1(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides2(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides3(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides4(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides5(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerSides6(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }
    }

