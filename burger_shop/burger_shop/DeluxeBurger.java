package burger_shop;

public class DeluxeBurger extends Burger {
    private Meat meatType;
    private Bread breadType;

    public DeluxeBurger(Bread breadType, Meat meatType) {
        super(breadType, meatType);
        super.addBurgerToppings5("Chips", 1);
        super.addBurgerToppings6("Drink", 1);
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
    public void addBurgerToppings1(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerToppings2(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerToppings3(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerToppings4(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerToppings5(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }

    @Override
    public void addBurgerToppings6(String name, double price) {
        System.out.println("the Deluxe burger only comes with chips and a drink");
    }
    }

